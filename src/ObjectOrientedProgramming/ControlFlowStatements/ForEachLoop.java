package ObjectOrientedProgramming.ControlFlowStatements;

public class ForEachLoop {
    public static void main(String[] args) {



        // one variable can only hold one assigned value at a time
        int x = 10;
        x = 20;
        x = 30;
        x = 40;
        x = 50;

        System.out.println(x);
         // array
         int[] a= {10,20,30,40,50,60,70,80,90,100};
         // index start from 0
        System.out.println(a[2]);

        // for each loop is used when you dont know how
        // many times you want the loop to continue

        for (int e:a){
            System.out.println(e);
        }




    }
}
