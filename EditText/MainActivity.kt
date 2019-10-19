package com.projects.facedetector

import java.util.Stack

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Matrix
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.support.design.widget.Snackbar
import android.support.media.ExifInterface
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.support.v4.content.FileProvider
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.*

import androidx.core.view.toBitmap

// import com.wajahatkarim3.easyvalidation.toasts.view_ktx.maxLengthToast

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.experimental.launch
import org.bytedeco.javacv.AndroidFrameConverter
import org.bytedeco.javacv.OpenCVFrameConverter
import java.io.File

import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONArray
import org.json.JSONObject



class MainActivity : AppCompatActivity() {

    private val REQUEST_IMAGE_CAPTURE = 100
    private val REQUEST_CAMERA_PERMISSION = 200
    private lateinit var uri: Uri

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edittext = findViewById<EditText>(R.id.editText)

        var button = findViewById<Button>(R.id.btnEmpty)
        button.setOnClickListener {

            faces_value.text = "3458 " + edittext.text

            val sm_tok = edittext.text.split(" ")

            faces_value.text = "3458 " + edittext.text + " " + sm_tok


            for (t in sm_tok) faces_value.text = t + "/ "

            var sm_S = arrayOf(sm_tok[0])

            faces_value.text = sm_S[0]

            val sm_n = IntArray(sm_tok.size)

            var sm_N = (sm_tok.size) - 1

            faces_value.text = sm_N.toString()

            val sm_s = sm_S[0]

            val S = Stack<String>()
            
            val SA = Stack<Any>()

            S.push(sm_tok[0]) // .toInt())

            SA.push(153)


            try {
                // val Sn = SA[0]::class.simpleName
                val Sn = 0
            } catch ( e : Exception ) {
                S.push(e.toString())
            }

            // sm_N = 1

            var smv=0

            var sm_bm=0

            // 20190422
            // !!! first word cannot be function, yet!! why?

            if (true) for (i in 1..sm_N) {
                // sm_s.plus(sm_S[i])

                if (sm_tok[i].equals("+")) {
                    smv = 0
                    //
                    // S.push(333 + i)// S.push(S.count())
                    // S.push(sm_tok[i])
                    S.push((S.pop().toInt() + S.pop().toInt()).toString())
                }
                else if (sm_tok[i].equals("fv")) S.push(faces_value.text.toString())
                else if (sm_tok[i].equals("irot")) rotImage(imageView.toBitmap(), faces_value)
                else if (sm_tok[i].equals("getuser")) S.push(getUsers(faces_value))
                // else if (sm_tok[i].equals("sn")) S.push(Sn.toString())
                // else if (sm_tok[i].equals("sn")) S.push("is sn")
                else if (sm_tok[i].equals("sn")) S.push(SA.pop().toString())
                else {
                    smv = i //
                    // S.push(sm_tok[i].toInt())
                    // S.push(777+i);
                    S.push(sm_tok[i])
                    // S.push(i)
                }

                // faces_value.text = sm_S[i] // + " " + i.toString()
            }

            faces_value.text = S.pop() + " 20190422"// .toString()

            // faces_value.text = sm_tok[smv]

            // for (sm_t in sm)

            // Validator way
            //edittext.validator()
            //        .nonEmpty()
            //        .addErrorCallback {
            //            edittext.error = it
            //        }
            //        .check()

            // Extension Way
            //edittext.nonEmpty ( {
            //   edittext.error = "Cannot be empty! - Check"
            //}, "test message" )

            // edittext.maxLengthToast(5,"sorry you can not enter more than 5 characters")
        }



        FaceDetection.loadModel(this)

        btnCamera.setOnClickListener {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA), REQUEST_CAMERA_PERMISSION)
            } else {
                startCamera()
            }

        }
    }

    private fun startCamera() {
        uri = FileProvider.getUriForFile(this, "com.projects.facedetector.fileprovider",
                File.createTempFile("picture", ".jpg", getExternalFilesDir(Environment.DIRECTORY_PICTURES)))
        startActivityForResult(Intent(MediaStore.ACTION_IMAGE_CAPTURE).apply { putExtra(MediaStore.EXTRA_OUTPUT, uri) }, REQUEST_IMAGE_CAPTURE)
    }


    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        if (requestCode == REQUEST_CAMERA_PERMISSION && grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            startCamera()
        } else {
            Snackbar.make(findViewById<View>(android.R.id.content), "Please enable the access to the camera", Snackbar.LENGTH_LONG).show()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {
            hintText.visibility = INVISIBLE
            detailsGroup.visibility = VISIBLE
            val bitmap = getCapturedImage(uri)
            imageView.setImageBitmap(bitmap)
            detectFace(bitmap, faces_value)
        }
    }

    private fun getCapturedImage(uri: Uri): Bitmap {
        val bitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, uri)
        return when (ExifInterface(contentResolver.openInputStream(uri)).getAttributeInt(ExifInterface.TAG_ORIENTATION, ExifInterface.ORIENTATION_UNDEFINED)) {
            ExifInterface.ORIENTATION_ROTATE_90 -> Bitmap.createBitmap(bitmap, 0, 0, bitmap.width, bitmap.height, Matrix().apply { postRotate(90F) }, true)
            ExifInterface.ORIENTATION_ROTATE_180 -> Bitmap.createBitmap(bitmap, 0, 0, bitmap.width, bitmap.height, Matrix().apply { postRotate(180F) }, true)
            ExifInterface.ORIENTATION_ROTATE_270 -> Bitmap.createBitmap(bitmap, 0, 0, bitmap.width, bitmap.height, Matrix().apply { postRotate(270F) }, true)
            else -> bitmap
        }
    }

    private fun detectFace(image: Bitmap, facesValue: TextView) {



        val frame = AndroidFrameConverter().convert(image)
        val mat = OpenCVFrameConverter.ToMat().convert(frame)
        launch {
            val numberOfFaces = FaceDetection.detectFaces(mat).toString()
            runOnUiThread {
                facesValue.text = numberOfFaces
            }
        }
    }

    private fun rotImage(image: Bitmap, facesValue: TextView) {
        val frame = AndroidFrameConverter().convert(image)
        val mat = OpenCVFrameConverter.ToMat().convert(frame)

        val mat0 = FaceDetection.grayScaled(mat)

        val frame0 = OpenCVFrameConverter.ToMat().convert(mat0)
        // val bmp0 = Bitmap.createBitmap(mat0, mat0.cols(), mat0.rows(), Bitmap.Config.ARGB_8888)
        val bmp0 = AndroidFrameConverter().convert(frame0)



        launch {
            // val numberOfFaces = FaceDetection.detectFaces(mat).toString()
            // mat.zero()




            imageView.setImageBitmap(bmp0)

            runOnUiThread {
                facesValue.text = "irot001"// numberOfFaces
            }
        }
    }

    fun getUsers(facesValue: TextView): String {

        facesValue.text = "in getUsers()"

        // S.push("in getUsers()")

        val textView = facesValue

        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(this)
        val url: String = "https://api.github.com/search/users?q=eyehunt"

        // Request a string response from the provided URL.
        val stringReq = StringRequest(Request.Method.GET, url,
                Response.Listener<String> { response ->

                    var strResp = response.toString()
                    val jsonObj: JSONObject = JSONObject(strResp)
                    val jsonArray: JSONArray = jsonObj.getJSONArray("items")
                    var str_user: String = ""
                    for (i in 0 until jsonArray.length()) {
                        var jsonInner: JSONObject = jsonArray.getJSONObject(i)
                        str_user = str_user + "\n" + jsonInner.get("login")

                    }
                    textView!!.text = "response : $str_user "
                    // return str_user
                },
                Response.ErrorListener {
                    // textView!!.text = "That didn't work!"

                    error -> textView!!.text = error.toString()
                    // error -> toast(error.toString())
                })
        queue.add(stringReq)
        return textView!!.text.toString()
    }
}



