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

// import java.io.FileWriter;
import java.io.*;
import java.net.*;
import java.io.IOException; import java.nio.file.Files; import java.nio.file.Paths;

public class ImgCopy {

    public static void main(String[] args) {
    
        // String s;
        
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        
        // System.out.println(new CUrl().opt(args).exec(null));
        
        // String s = new CUrl().opt(args).exec(null);
        
        // System.out.println(s);
 
        String url = "https://instagram.fkul4-2.fna.fbcdn.net/vp/34854b7e925181670c1e2cadb1de9872/5E42DA32/t51.2885-15/e35/p1080x1080/72703005_418674925489247_2184660954511026364_n.jpg?_nc_ht=instagram.fkul4-2.fna.fbcdn.net&_nc_cat=111"; 
        
        String fn = "shanghai.jpg";
 
        try(InputStream in = new URL( url ).openStream()){
    Files.copy(in, Paths.get( fn ));
}
        
        catch ( Exception e ) {}
    }

}
