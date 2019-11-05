/******************************************************************************
 *  Compilation:  javac HelloWorld.java
 *  Execution:    java HelloWorld
 *
 *  Prints "Hello, World". By tradition, this is everyone's first program.
 *
 *  % java HelloWorld
 *  Hello, World
 *
 *  These 17 lines of text are comments. They are not part of the program;
 *  they serve to remind us about its properties. The first two lines tell
 *  us what to type to compile and test the program. The next line describes
 *  the purpose of the program. The next few lines give a sample execution
 *  of the program and the resulting output. We will always include such 
 *  lines in our programs and encourage you to do the same.
 *
 ******************************************************************************/

import com.roxstudio.utils.*;
// import java.io.FileWriter;
import java.io.*;
import java.util.*;
import java.lang.reflect.*;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

/*
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;
*/

import java.util.Arrays;

import org.jsoup.nodes.*;
import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

import java.net.*;
import java.io.IOException; import java.nio.file.Files; import java.nio.file.Paths;

public class phos {

        static HashMap<String, List<String>> CDW = new HashMap<String, List<String>>();
        static HashMap<String, String> BV = new HashMap<String, String>();
        static Stack<String> S=new Stack<String>();

    public static void main(String[] args) {
    
        // String s;
        
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        
        // System.out.println(new CUrl().opt(args).exec(null));
        
        
        Stack<String> S=new Stack<String>();
	
		// String sm_r = ServletRequestUtils.getStringParameter(request, "r", "");
		
		// String[] T=sm_r.split(" ");
		
		String[] T = args ;
		
		int L=T.length;
		int i;
		int $;
		
		S.push("s");
		
		for (i=0; i<L; i++) {
					System.out.println(i+ " " + T[i]);
					if (T[i].equals("+")) S.push(Integer.toString(Integer.parseInt(S.pop())+Integer.parseInt(S.pop())));
					
					/*
					else if (T[i].equals("dbe")) S.push( sm_eval( con, S.pop(), Integer.parseInt(S.pop()) ) );
					else if (T[i].equals("smsp")) S.push( sm_sp( con, S.pop() )); //Integer.parseInt(S.pop()) ) );
					else if (T[i].equals("dbe2")) S.push( sm_eval_2( con, S.pop(), Integer.parseInt(S.pop()), S.pop() ) );
					else if (T[i].equals("dbstat")) S.push( HW_INV.getConnectionStat(con, 2003) );
					// else if (T[i].equals("dbhwstat")) S.push( HW_INV.getConnection_HWStat( con,Integer.parseInt(S.pop()), Integer.parseInt(S.pop())) );
					else if (T[i].equals("dbhwsl")) S.push( HW_INV.getConnection_HWStatList(con, 2003, 3,"Windows 10 Professional, 64-bit(x64)") );
					else if (T[i].equals("dbswfs")) S.push( HW_INV.getConnection_GetRelationSWFileStat(con,-1,0,".EXE") );
					else if (T[i].equals("dbnwad2")) S.push( HW_INV.getConnection_GetSubnetNIAgentDetail2(con,-1,0,".EXE") );
					else if (T[i].equals("dbepl")) S.push( HW_INV.getConnection_GetEsdPackageLists(con,-1,0,".EXE") );
					else if (T[i].equals("dbtest")) S.push( executeSQLException(con));
					// else if (T[i].equals("dbswus")) S.push( HW_INV.getConnection_GetRelationSWUNIStat2(con, -1, 3,"Windows 10 Professional, 64-bit(x64)") );
					// else if (T[i].equals("dbrps2")) S.push( HW_INV.getConnection_GetRelationPackageStat2(con, -1, 3,"Windows 10 Professional, 64-bit(x64)") );
					*/
					else if (T[i].equals("curl")) {
					
                        // System.out.println( S.pop() + " " + S.pop() );
                        
                        String[] s_args = new String[1];
                        s_args[0] = ( S.pop() );
					
					    // if (false) {
					    if (true) {
					            String s = new CUrl().opt(s_args).exec(null);
                    
                                System.out.println(s);
                                
                                try {
                   
                                    // BufferedWriter writer = new BufferedWriter( new FileWriter( "o_java.html" ));
                   
                                    BufferedWriter writer = new BufferedWriter( new FileWriter( S.pop() ));
                                
                                    writer.write( s );
                                    // do stuff 
                                    writer.close();
                                }
                                catch ( Exception e ) {}
                                
                        }
                    }
                        
					                
				    else S.push(T[i]);
					
				}
				
				String s = ": dltag a bv: ig/${a}.html https://www.instagram.com/explore/tags/${a}/ copy: ;";
				String[] s_args = s.split(" ");
				FGLA(s_args);
				
				F(": dlsc ig/${a}.html fgc: commanl: nlc: explode: /shortcode/ grep: dl_shortcode: ;");
				
				// F(": commanl:
				
				FGLA(args);
					
    }
    
        public static void F(String s)
        {
           String before = s;
           String after = before.trim().replaceAll(" +", " ");
        
        // $a = explode(' ', trim($a)); // remove front and trailing spaces
        // String[] T = after.split(" ");  // java must use double quotes, not single quotes!!
        
            FGLA( after.split(" ") );
        }
        
    public static void sm_fgc()
    {
        System.out.println("  147 In sm_fgc" );
    
        try {
        InputStream is = new FileInputStream( S.pop() );
        BufferedReader buf = new BufferedReader(new InputStreamReader(is));
                
        String line = buf.readLine();
        StringBuilder sb = new StringBuilder();
                
        while(line != null){
           sb.append(line).append("\n");
           line = buf.readLine();
        }
                
        String fileAsString = sb.toString();
        // System.out.println("Contents : " + fileAsString);
        
        S.push( fileAsString );
        }
        catch (Exception e) {}
        
    }
        
    // function fgl_dl_shortcode()
    public static void sm_dl_shortcode()
    {

        // $a=array_pop($S);
        String $a = S.pop();
        
        Gson gson = new Gson(); 
 
        String[] userArray = gson.fromJson($a, String[].class);  

        /*
        foreach($a as $k => $b)
        {
        $c=explode(":", $b);
        echo "\n\n In fgl_dl_shortcode ";
        echo " $k ".$c[1]." ";
        $l=strlen($c[1]);
        $d=substr($c[1],1,$l-3);
        echo $d;

        //    flush();
        //    ob_flush();

        copy("https://www.instagram.com/p/".$d, "ig/".$d.".html");
        if (file_exists("ig/".$d.".html")) get_meta("ig/".$d.".html");

        }
        */

        File file;

        for(String b : userArray) {

            String[] $c=b.split(":");
                
            System.out.println(b);
            
            int $l=$c[1].length();
            String $d=$c[1].substring(1,$l-2);

            // copy("https://www.instagram.com/p/".$d, "ig/".$d.".html");
            // S.push("ig/"+$d+".html");
            // S.push("https://www.instagram.com/p/"+$d);
            // F("ig/"+$d+".html https://www.instagram.com/p/"+$d+" copy:");
            
            // URL must have '/' at end for path!!
            // curl_copy( "https://www.instagram.com/p/"+$d+"/", "ig/"+$d+".html");
            
            S.push( "ig/"+$d+".html" );
            S.push( "https://www.instagram.com/p/"+$d+"/" );
            sm_copy();

            // if (file_exists("ig/".$d.".html")) get_meta("ig/".$d.".html");            
            file = new File("ig/"+$d+".html");
            if (file.exists() && file.isFile())
            {
              System.out.println("file exists, and it is a file: "+ "ig/"+$d+".html");
              
              S.push( "ig/"+$d+".html" );
              sm_meta();
            }            

        }
    }
    

    public static void sm_meta()
    {
        String fn = S.pop();

        System.out.println( "  247 sm_meta "+ fn);
                
        // Document doc = Jsoup.parse("test.html");
        try {

            System.out.println( "  252 sm_meta "+ fn);

            File input = new File( fn );        
            
            System.out.println( "  256 sm_meta "+ fn);
            
            // dies WITHOUT warning if jar is not included!!
            Document doc = Jsoup.parse( input, "UTF-8", "" );
            
            System.out.println( "  260 sm_meta "+ fn);
            
            System.out.println( "  262 doc body test "+ doc.body().text() );

            Map<String, String> metas = new HashMap<>();
            Elements metaTags = doc.getElementsByTag("meta");

            int i=0;
            // String[] f_jpath;
            List<String> f_jpath = new ArrayList<String>();
            String f_jurl="";
            
            for (Element metaTag : metaTags) {
              String content = metaTag.attr("content");
              String name = metaTag.attr("name");
              metas.put(name, content);
              if (i==10) {
                System.out.println( metas.get(name) );
                f_jpath = Arrays.asList( metas.get(name).split("/") );
                f_jurl = metas.get(name);
              }
              i++;
            }
            System.out.println( "  260 jpg url "+ f_jpath.get(9) );
            
            String[] f_jfn = f_jpath.get(9).split("\\?");
            
            System.out.println( "  265 jpg url "+ f_jpath.get(9) );
            System.out.println( f_jfn[0] );
            
            // curl_copy( f_jurl+"/", "ig/"+f_jfn[0] );
            // curl_copy( f_jurl+"/", "ig/"+f_jfn[0] );
            // curl_copy( f_jurl, "ig/"+f_jfn[0] );
            
            S.push( "ig/"+f_jfn[0] ); S.push( f_jurl );
            sm_copy();
        }
        
        catch (Exception e) {
            System.out.println( "  274 Exception "+ e );
        }
    }    


    public static void sm_meta_0()
    {
      System.out.println( "  230 sm_meta");
    
        try {
        File input = new File( S.pop() );
        Document doc = Jsoup.parse(input, "UTF-8", "");

// Element content = doc.getElementById("content");
Element content = doc.getElementById("body");
// Elements links = content.getElementsByTag("a");
Elements links = doc.getElementsByTag("meta");
for (Element link : links) {
  String linkHref = link.attr("href");
  String linkText = link.text();
  
      System.out.println(linkHref);
}            
        }
        catch (Exception e) {
              System.out.println( "  246 sm_meta "+e);
        }
    
    }

    public static void sm_commanl()
    {
        String new_str = ",\n" ;

        String patternString = ",";        
        
        String text = S.pop() ;

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        /*
        int count = 0;
        while(matcher.find()) {
            count++;
            text = text.replace( text.substring(matcher.start(), matcher.end()),  
                    new_str );
        }
        */
        
        String replaceAll = matcher.replaceAll( new_str );
        
        S.push( replaceAll );
    }
    
    public static void sm_nlc() // nlc: push newline character to stack
    {
        S.push( "\n" );
    }
    
    public static void sm_explode() // explode: PHP explode
    {
        // How to store array in Java Stack<String>? Use JSON? Need type prefix?
        // Use json format string as prefix?
        
        String dlm = S.pop();
        String s_in = S.pop();
        
        String[] sa = s_in.split(dlm);
        
        // JSONArray arr_strJson = new JSONArray(Arrays.asList(sa));
        
        Gson gson=new GsonBuilder().create();
        String jsonArray=gson.toJson(sa);
        
        S.push( jsonArray );
        
        // System.out.println("  In explode: " + jsonArray +" "+ sa.length +" "+ s_in +" "+ dlm );
    }


    public static void sm_grep()
    {
        // String new_str = S.pop() ;
        Stack<String> S0=new Stack<String>();

        String patternString = S.pop();        
        
        int L = patternString.length();
        patternString = patternString.substring(1, L-1);
        
        String text = S.pop() ;

        Pattern pattern = Pattern.compile(patternString);

        Gson gson = new Gson(); 
     
        String[] userArray = gson.fromJson(text, String[].class);  
     
        for(String user : userArray) {
            Matcher matcher = pattern.matcher(user);
                
                int count = 0;
                while(matcher.find()) {
                    count++;
                    // System.out.println(user);
                    S0.push(user);
                    
                }
        }

        Object[] arr = S0.toArray();
        // System.out.println(arr.length);
        // Gson gson=new GsonBuilder().create();
        String jsonArray=gson.toJson(arr);
        
        S.push( jsonArray );        
     }
    
    
    public static void curl_copy( String url, String fn )
    {
			
        // System.out.println( S.pop() + " " + S.pop() );
        
        /*
        String[] s_args = new String[2];
        s_args[0] = ( url );
        s_args[1] = "-o";
        */
        
        String[] s_args = { url, "--output", "test.jpg" };

        System.out.println( "  403 curl_copy "+ s_args[0] );
	
	    // if (false) {
	    if (true) {
	            String s = new CUrl().opt(s_args).exec(null);
    
                // System.out.println(s);
                
                try {
   
                    // BufferedWriter writer = new BufferedWriter( new FileWriter( "o_java.html" ));
   
                    BufferedWriter writer = new BufferedWriter( new FileWriter( fn ));
                
                    writer.write( s );
                    // do stuff 
                    writer.close();
                }
                catch ( Exception e ) {}
                
        }
        
        System.out.println( "  338 sm_copy "+ s_args[0] );
    }
    
    // public static void sm_copy_nio()
    public static void sm_copy()
    {
    
        String url = S.pop(); 
        
        String fn = S.pop();
        
        System.out.println( "  446 sm_copy "+ fn +" "+ url );
 
        try(InputStream in = new URL( url ).openStream()){
            Files.copy(in, Paths.get( fn ));
        }
        
        catch ( Exception e ) {}
    }

    
    
    public static void sm_copy_curl()
    {
			
        // System.out.println( S.pop() + " " + S.pop() );
        
        String[] s_args = new String[1];
        s_args[0] = ( S.pop() );

        System.out.println( "  317 "+ s_args[0] );
	
	    // if (false) {
	    if (true) {
	            String s = new CUrl().opt(s_args).exec(null);
    
                System.out.println(s);
                
                try {
   
                    // BufferedWriter writer = new BufferedWriter( new FileWriter( "o_java.html" ));
   
                    BufferedWriter writer = new BufferedWriter( new FileWriter( S.pop() ));
                
                    writer.write( s );
                    // do stuff 
                    writer.close();
                }
                catch ( Exception e ) {}
                
        }
        
        System.out.println( "  338 sm_copy "+ s_args[0] );
    }



    public static void sm_preg_replace()
    {
        String new_str = S.pop() ;

        String patternString = S.pop();        
        
        String text = S.pop() ;

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        /*
        int count = 0;
        while(matcher.find()) {
            count++;
            text = text.replace( text.substring(matcher.start(), matcher.end()),  
                    new_str );
        }
        */
        
        // S.push( text );
        
        String replaceAll = matcher.replaceAll( new_str );
        
        S.push( replaceAll );
    }
    
    public static void sm_other(String $v)
    {    
        System.out.println("  249 sm_other " );
    
        if ($v.equals("bv:")) {
            BV.put( S.pop(), S.pop() );
            System.out.println("  bv: sm_bv " );
            System.out.println( BV ); // + S.pop() +" "+ S.pop() );
        }                  
		else if ($v.equals("copy:")) {
			
            // System.out.println( S.pop() + " " + S.pop() );
            
            String[] s_args = new String[1];
            s_args[0] = ( S.pop() );
		
		    // if (false) {
		    if (true) {
		            String s = new CUrl().opt(s_args).exec(null);
        
                    System.out.println(s);
                    
                    try {
       
                        // BufferedWriter writer = new BufferedWriter( new FileWriter( "o_java.html" ));
       
                        BufferedWriter writer = new BufferedWriter( new FileWriter( S.pop() ));
                    
                        writer.write( s );
                        // do stuff 
                        writer.close();
                    }
                    catch ( Exception e ) {}
                    
            }
        }
		else if ($v.equals("fgc:")) sm_fgc();
		else if ($v.equals("preg_replace:")) sm_preg_replace();
		else if ($v.equals("commanl:")) sm_commanl();
		else if ($v.equals("peek:"))                             
		    System.out.println( S.peek() );			    
    }
    
    // function FGL($a) // 5gl to php bootstrap code, use function argument as input string; add colon definition;
    public static void FGLA(String[] $a)
    {
        // 2019-11-03
        // global $argv, $S, $SS, $xk, $xs, $SC, $SL, $CDW; // $CDW: colon defined words
        
        // $a = preg_replace('/\s+/', ' ', $a);
        // String before = $a;
        // String after = before.trim().replaceAll(" +", " ");
        
        // $a = explode(' ', trim($a)); // remove front and trailing spaces
        // String[] T = after.split(" ");  // java must use double quotes, not single quotes!!
        
        String[] T = $a ;
    
        System.out.println( "T" ); 
        System.out.println( T[0] );    

        /*                
        $SS[] = array(0, $a); // 2018 08 02 new items pushed to $SS, caused problem?
        $xc = count($SS);
        $xk =& $SS[$xc - 1][0];
        */
        
        // $xs =& $SS[$xc - 1][1];
        String[] $xs = T;
        String $v;

        // $xl = count($SS[$xc - 1][1]);
        int $xl = $xs.length;
        int $xk = 0;
        int $vk = $xk;
        int $Z=$xl;                

        /*
        HashMap<String, List<String>> CDW = new HashMap<String, List<String>>();
        HashMap<String, String> BV = new HashMap<String, String>();
        Stack<String> S=new Stack<String>();
        */

        // 2018 07 10
        do {
            // while ($vk < $xl) {
        
            $vk = $xk;
            
            // $v = trim($xs[$xk]);
            $v = $xs[$xk].trim();
        
            System.out.println( $v );
            
//            F(': dltag a bv: ig/${a}.html https://www.instagram.com/explore/tags/${a}/ copy: ;');
          
            String text    =
                "This is the text which is to be searched " +
                "for occurrences of the word 'is'.";

            // text = "ig/${a}.html";
            text = $v ;

        String patternString = "is";
        
        patternString = "/\\${+(.*?)}/";
        
        patternString = "\\$\\{+(.*?)\\}";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while(matcher.find()) {
            count++;
            
            if (BV.get( text.substring(matcher.start()+2, matcher.end()-1) )!=null)
                System.out.println("found: " + count + " : "
                    + matcher.start() + " - " + matcher.end() + " " + text.substring(matcher.start(), matcher.end()) + " " + text.substring(matcher.start()+2, matcher.end()-1) +" "+ BV.get( text.substring(matcher.start()+2, matcher.end()-1) ));
                $v = $v.replace( "${"+text.substring(matcher.start()+2, matcher.end()-1)+"}",  
                BV.get( text.substring(matcher.start()+2, matcher.end()-1) )
                );
        }
            
            /*
            // Bash style variable substitutions
            if(preg_match_all('/\${+(.*?)}/', $v, $m)) {
            
            // echo " line ".__LINE__." has bash var ".var_src($m)."    ";
            
                foreach($m[1] as $mk => $me) { // $m[1] is inner match, $m[0] is outer match
                    
                    // echo "\n line ".__LINE__." me ".var_src($me)." mk ".$mk." v ".$v."    ";
                    
                    // $v=preg_replace('/\${'.$VN.'}/',  $VV, $str)
                    
                    if (isset($BV[$me])) $v=preg_replace('/\${'.$me.'}/',  $BV[$me], $v);
                    
                    // echo "\n line ".__LINE__." me ".var_src($me)." mk ".$mk." v ".$v."    ";
                    
                    $S[]=$v;
                }
            
            }

//        if (in_array($v, array_keys($CDW))) { // $CDW colon defined words, unify Forth (no colon) and Unicode
            else 
            */
            
            System.out.println("  213 " + $v );
            
            if ( CDW.keySet().contains( $v ) ) {
                
                String[] $WA = CDW.get($v).toArray( new String[0] ); // array_pop($WA); // remove semicolon;
                System.out.println( "  157 " + $v );
                System.out.println( $WA.length );
                
                FGLA($WA);
                
            }    
        
        else if ($v == ">:" || $v == "<:") {
            // $S[] = $v;
            S.push( $v );
        } else {
            // $l = strlen($v);
            int $l = $v.length();
            
            System.out.println( $v +" "+ $xk +" "+ $xs.length +" "+ $v.charAt($l-1)   );
            System.out.println( $v.charAt($l-1)==':' );
            
            if ($v.equals(":") && $l==1) { // colon definition CDW 20190119
            
                // echo "is colon; ";  
                
                $xk++; $vk = $xk; 

                System.out.println( $v + " " + $xk + " " + $xs.length );

                
                // $v = trim($xs[$xk]);
                $v = $xs[$xk].trim();
            
                // $CDW[$v]=array();
                CDW.put( $v, new ArrayList<String>() );

                String $w0 = $v;
                $xk++;
                
                do {
                
                    System.out.println( "  189 " + $v + " " + $xk + " " + $xs.length );
                    $vk = $xk;
                    $v = $xs[$xk].trim();

                    CDW.get( $w0 ).add( $v );

                    // $l = strlen($v);
                    $l = $v.length();
                    
                    if ($v.equals(";") && $l==1) {
                        break;
                    }
                    $xk++;
                } while (true);
            }
            
            
            
            else if ($v.charAt($l-1)==':') { 

                System.out.println( "  375 " + $v +" "+ $xk +" "+ $xs.length +" "+ $v.charAt($l-1)   );
                
                // $l = strlen($v);
                $l = $v.length();
                
                // $fn = substr($v, 0, $l - 1);
                String $fn = "sm_"+ $v.substring(0, $l - 1);

                System.out.println("  383 "+ $fn);
                
                // Class clazz = Test.class;
                Class clazz = phos.class;

                /*
                for (Method method : clazz.getDeclaredMethods()) {
                    System.out.println(method.getName());
                    if (method.getName().equals($fn)) {
                        System.out.println("Method exists: "+$fn);
                    }
                }
                */

                try {
                if (clazz.getDeclaredMethod($fn, null) != null) {
                    System.out.println("  397 Method exists: "+$fn);
                    
                    //Step1 - Using string funClass to convert to class
                    // String funClass = "package.myclass";
                    // Class c = Class.forName(funClass);
                    Class c = phos.class;

                    //Step2 - instantiate an object of the class abov
                    Object o = c.newInstance();
                    //Prepare array of the arguments that your function accepts, lets say only one string here
                    Class[] paramTypes = new Class[1];
                    paramTypes[0]=String.class;
                    
                    // String methodName = "mymethod";
                    String methodName = $fn;
                    
                    //Instantiate an object of type method that returns you method name
                    // Method m = c.getDeclaredMethod(methodName, paramTypes);
                    Method m = c.getDeclaredMethod(methodName, null);
                    
                    //invoke method with actual params
                    // m.invoke(o, "testparam");
                    m.invoke(o);

                } 
                }
                catch (Exception e) {
                    // System.out.println("  509 Exception Method NOT exists: "+$fn);
                    sm_other( $v );
                }  
                  
                /*  
                if ($v.equals("bv:")) {
                    BV.put( S.pop(), S.pop() );
                    System.out.println("  bv: sm_bv " );
                    System.out.println( BV ); // + S.pop() +" "+ S.pop() );
                }  
                
				else if ($v.equals("copy:")) {
					
                    // System.out.println( S.pop() + " " + S.pop() );
                    
                    String[] s_args = new String[1];
                    s_args[0] = ( S.pop() );
				
				    // if (false) {
				    if (true) {
				            String s = new CUrl().opt(s_args).exec(null);
                
                            System.out.println(s);
                            
                            try {
               
                                // BufferedWriter writer = new BufferedWriter( new FileWriter( "o_java.html" ));
               
                                BufferedWriter writer = new BufferedWriter( new FileWriter( S.pop() ));
                            
                                writer.write( s );
                                // do stuff 
                                writer.close();
                            }
                            catch ( Exception e ) {}
                            
                    }
                }
				else if ($v.equals("fgc:")) sm_fgc();
				else if ($v.equals("preg_replace:")) sm_preg_replace();
				else if ($v.equals("commanl:")) sm_commanl();
				else if ($v.equals("peek:"))                             
				    System.out.println( S.peek() );
				*/

                /*        
                if (function_exists("fgl_" . $fn)) {
                
                    call_user_func("fgl_" . $fn);
					
					if (is_array(end($S))) { // xif: executes TRUE or FALSE part, push prg_ctr to stack
						$va = end($S);
						
						// if (in_array("prg_ctr", end($S))) { 
						if (isset($va[0])) if ($va[0]=="prg_ctr") {
							$va = array_pop($S);
							$vk = $va[1]; $xk=$vk;
						}
					}
										
                }
                */

/*                
                else if (in_array($fn.":", array_keys($CDW))) { // $CDW colon defined words
                
                    echo __LINE__." in CDW ".var_src($CDW[$fn.":"]);
                    
                    // $S[]=
                    $WA = $CDW[$fn.":"]; array_pop($WA); // remove semicolon;
                    // FGLA($CDW[$fn.":"]);
                    FGLA($WA);
                
                }

                
                else if ($fn=="r") {
                
                    echo __LINE__." r: ";
                    // fgl_s();
                    
                    // push remainder of command string to stack?
                    $s=array_pop($S);
                    // $S[]=$xk; // $S[]=$xs; 
                    $S[]=implode(' ', array_slice($xs, $xk+1));
                    
                    // $S[]='$S[]=$'.array_pop($S).'; ';
                    $S[]='$S[]=$'.$s.'; '; $S[]=':r:'; // flag, swap after eval()
                    fgl_s(); return;
                
                
                }
                
                else if ($fn=="v") {
                
                    echo "\n".__LINE__." v: ";
                    // fgl_s();
                    
                    // push remainder of command string to stack?
                    $sa=array_pop($S);
                    $sb=array_pop($S);

                    // $S[]=$xk; // $S[]=$xs; 
                    $S[]=implode(' ', array_slice($xs, $xk+1));
                    
                    // $S[]='$S[]=$'.array_pop($S).'; ';
                    // $S[]='$S[]=$'.$s.'; ';
                    $S[]='$'.$sa.'='.$sb.'; '; $S[]=':v:'; // flag, no swap after eval()
                    fgl_s(); return;
                
                
                }
                
                else if ($fn=="a") {
                
                    echo "\n".__LINE__." v: ";
                    // fgl_s();
                    
                    // push remainder of command string to stack?
                    $sa=array_pop($S);
                    $sc=count($S);
                    $se=$S[ $sc - $sa ];
                    
                    for ($si=0; $si<$sa; $si++) {
                    
                    }
                    
                    $sb=array_pop($S);

                    // $S[]=$xk; // $S[]=$xs; 
                    $S[]=implode(' ', array_slice($xs, $xk+1));
                    
                    // $S[]='$S[]=$'.array_pop($S).'; ';
                    // $S[]='$S[]=$'.$s.'; ';
                    $S[]='$'.$sa.'='.$sb.'; '; $S[]=':v:'; // flag, no swap after eval()
                    fgl_s(); return;
                
                
                }
                
                else if ($fn=="count") {
                
                    echo __LINE__." r: ";
                    fgl_s();
                    
                    $S[]='$S[]=count('.array_pop($S).'); ';
                
                
                
                }
                
               else if ($fn=="bz")
               {
               
               fgl_s();
               
               $bx = array_pop($S);
               
              // if (array_pop($S)==0) $xk=$SL[ array_pop($S) ];
              if (array_pop($S)==0) $xk = $bx;
              continue;
               
               }    
           
               else if ($fn=="bnz")
               {

               $bx = $SL[ array_pop($S) ]; // array_pop($S);
               
              fgl_dup();
              if (array_pop($S)!=0)  { $xk = $bx + 1; continue; }
               
               }    
                
                
                else {
                    // echo " line ".__LINE__ . " fgl_" . $fn . " error.\n";
                }
 */               
            } 
            
            else {
                // System.out.println("  437 " + $v );
                S.push( $v );
            }
/*            
            else {

                if (ord($v)==0) echo " null char ";
                else
                if ($v[0] == '_') {
		
					if ($v=='_') $S[]=$v;
					
                } else {
                    if ($v == '.s') {
                        echo "\nline " . __LINE__ . " {$v} ";
                        fgl_s();
                    } else {
                        if ($v == '-') {
                            // $S[] = array_pop($S) - array_pop($S);
                            $sa = array_pop($S);
                            $sb = array_pop($S);
                            // echo gettype($sb) ." ". $sb ." ". gettype($sa) ." ". $sa ." ";
                            $S[] = (int) $sb - (int) $sa; 
                        } 
                        else if ($v == '+') {
                            // $S[] = array_pop($S) - array_pop($S);
                            $sa = array_pop($S);
                            $sb = array_pop($S);
                            $S[] = $sb + $sa; 
                        }
                        else if ($v == '.') {

//                        fgl_stv(); 

                            array_pop($S);
                        }
                        else {
                            if ($v == '===') {
                                $S[] = array_pop($S) === array_pop($S);
                            } else {
                                $S[] = $v;
                            }
                        }
                    }
                }
            }
            */
        }

        $xk++;
        if ($xk >= $xl) {
            break;
        } 


    } while ($vk < $xl);
    
                System.out.println( CDW.keySet() );

    }


}
