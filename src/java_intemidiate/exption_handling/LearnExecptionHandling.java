package java_intemidiate.exption_handling;

import java.util.Scanner;

public class LearnExecptionHandling {
    public static void main(String[] args) {

      try {   // this is an array
            String[] arr = {"hi", "hello", "salam"}; // lengh of an array is always -1 than the highst element value


            System.out.println(arr[20]);


       } catch (Exception e){
            System.out.println("we cant find value");
        }

      int [] ia = null;
      try {
          System.out.println(ia [1]);
      }catch (NullPointerException e){
          System.out.println("ur array  has null value");
      }catch (ArrayIndexOutOfBoundsException a){
          System.out.println(" ur array is out of bound");

      }catch ( Exception e) {
          e.getMessage();
      }




    }
}
