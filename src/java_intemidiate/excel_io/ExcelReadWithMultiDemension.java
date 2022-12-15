package java_intemidiate.excel_io;

public class ExcelReadWithMultiDemension {

    public static void main(String[] args) {

         int[] arr = {10,20,30}; // regular array

         int [][] multiarr = {{10,20,30},{100,200,300},{1000,2000,3000}}; // It's a combination of column and rown

        //System.out.println(multiarr[2][1]);
        for (int row = 0; row<multiarr.length; row++){
            for (int column = 0 ; column < multiarr[row].length;column++){

                System.out.print(multiarr[row][column ]+ "\t\t");
        }
            System.out.println();
    }
}}
