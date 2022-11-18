package ObjectOrientedProgramming;

public class ThisKeyword {

     // fielled of this class
     int a =100;
     String s = "hello";


     int x = 10;


     public ThisKeyword(int a, String s){
          // this keyword points to the class level varaible
          this.a=a;
          this.s=s;


     }

     public static void main(String[] args) {
          ThisKeyword obj = new ThisKeyword(1000, "java");
          System.out.println(obj.a);
          System.out.println(obj.s);
     }
}
