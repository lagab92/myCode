package BasicJava;

public class JavaRecap {

    int  age;
    int  height;
    String  name;
    String feedback;
     static String typeOfLaptop;

    public static void main(String[] args) {
        JavaRecap myLaptop = new JavaRecap();

        myLaptop.age = 2;
        myLaptop.height = 25;
        myLaptop.feedback = "perfect";
        myLaptop.name = "azex";
         typeOfLaptop = "hp";
        System.out.println(typeOfLaptop);


        // incremetal +=
        // decremental -=
        //multiplication *=
          int x = 10;
          x+=5;
        System.out.println(x);
        int l=10;
        l-=5;
        System.out.println(l);
        int k=12;
        k*=1475;
        System.out.println(k);
         int n=5; // to add value by one use ++ then +
        System.out.println(n++);
        System.out.println(n);



        // String is a class and  data type at the same time
        // you don't need to create a class to call string you can just type string


        String g= "yannel";
        String g2 = "is my daughter";

        System.out.println(g.length()); // count the number of charchter

        System.out.println(g+ g2); // concat is to join to value
        //or

        System.out.println(g+" is my daughter");
        //or
        System.out.println(g. concat(g2));

        System.out.println(g.trim()); // trim removes the white spaces after and before the string
        System.out.println(g2.toUpperCase());
        System.out.println(g2.toLowerCase());
        System.out.println(g.substring(2)); // it starts counting from 0 and then beginindex 2 is inclusive
        System.out.println(g.substring(3));// it starts counting from 0 then beginidex 3 is inclusive ( the
        // the letter from 3 will be included)
        System.out.println(g.substring(2,5));// it will include letter number 2 but it will not include letter number 5

        String m = "yannel";

        System.out.println(g.equals(m));

        int h = 5;
        int d = 8;

                // Comparison Operator
        System.out.println(h==d); // equal tp
        System.out.println(h!=d);// not equal tp
        System.out.println(h<=d);// less than  or equal to
        System.out.println(h>=d);// greater than or equal
        System.out.println(h<d);// less than
        System.out.println(h>d);// greater than


            // lets practice
      ;










    }
                 // lets practice
    public void myPractice (){
        String kinder;


    }





}
