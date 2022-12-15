package java_intemidiate.data_structure;

import java.util.ArrayList;

public class ReviewOfDataStructure {

    public static void main(String[] args) {
        int[] myNumb = new int[3];
      // myNumb[0]= 5;
       //myNumb[1]= 6;
      // myNumb[2]= 4;
      //for ( int a: myNumb){
        //System.out.println(a);


        ArrayList<String> towns = new ArrayList<>();

        towns.add(0,"paris");
        towns.add(1,"alger");
        towns.add(2,"casa");
        towns.add(3,"doha");

          System.out.println(towns.get(3));


         System.out.println(towns.size());
         System.out.println(towns.contains("doha"));





    }
}
