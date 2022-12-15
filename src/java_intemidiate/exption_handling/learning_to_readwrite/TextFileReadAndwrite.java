package java_intemidiate.exption_handling.learning_to_readwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TextFileReadAndwrite {
    public static void main(String[] args) throws Exception {
      //  System.out.println("hello everyone? \n the wetaher good");

      //  System.out.println("hello u \t thanks"); // will add space within the line
      //  System.out.println(" the current whaether is \"40 f\""); // will print in output as "40 f"
        // \n is for making new line in the output
      //  System.out.println(" delet the last caracters\b");// delet the last caracheter


      // to read the file we have to provide the path

       File f = new File("C:\\myfolder2\\myFile.txt.txt");

       Scanner s = new Scanner(f);

        while (s.hasNextLine()){
            System.out.println(s.nextLine());
        }
        System.out.println( System.getProperty("user.dir")+"\\src\\files\\myFile.txt");







    }
}
