package java_intemidiate.exption_handling.learning_to_readwrite;

import javax.imageio.IIOException;
import java.io.FileWriter;

public class textFilewrite  {
    public static void main(String[] args) throws Exception {



    FileWriter write1 = new FileWriter("C:\\myfolder2\\abc.txt"); // in this line we are creating a file


    write1.write("everyone , this is written by machine!"); // in this line we are writing in the file

    write1.close();

}}
