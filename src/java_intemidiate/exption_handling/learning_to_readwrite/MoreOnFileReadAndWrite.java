package java_intemidiate.exption_handling.learning_to_readwrite;

import javax.imageio.IIOException;
import java.io.*;

public class MoreOnFileReadAndWrite {

    public static void main(String[] args) throws IOException {

        String path = "C:\\myfolder2\\lagab.txt";

        try {
            FileInputStream musta = new FileInputStream(path);
            InputStreamReader lagab = new InputStreamReader(musta);
            BufferedReader br = new BufferedReader(lagab);
            String myRead;

            while ((myRead = br.readLine()) != null) {
                System.out.println(myRead);


            }


        } catch (FileNotFoundException f) {

            System.out.println(" file not found ");
        }catch (IOException I){
            System.out.println("cant read the file ");
        }

    }
}
