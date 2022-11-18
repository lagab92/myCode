package BasicJava;

public class LearnKeyWords {
    // methode are used to execute codes with one line
      // access modifier are public , private, protected . default
    // public everyone can see it

    public static void myMethode(){



         System.out.println("hello senior");
      }

    public static void main(String[] args) {
        myMethode();
        myProtected();
        myPrivate();
        myDefault();
        System.out.println(myVoidExample());
        System.out.println(holla());
        System.out.println(hilla());
        System.out.println(methodex2());
        System.out.println(youth());
    }
    // protected can be accessed within the package

     protected static void myProtected(){

         System.out.println("algeria where are you");
     }
    // private can only be used within the class
    private static void myPrivate (){
        System.out.println("HELLO THIS IS PRIVATE ");
    }
      // default is to declare a method without access modifier and it can be used within the package
    static void myDefault(){
        System.out.println("please call your dad asap");

    }



           //  if the void is in the methode the return will not return anythinh
           //  in order for the return to work we need to specify what can of data we need to have
    // in order to get a result
    // as long as we use return keyword we have to declare the type of data we want
         public static int myVoidExample(){


          int x=5;
          int y=10;

            return x+y; }
     static boolean holla() {
         int u=5;
         int x=8;
         return u>x;

    }
    static int hilla() {
        int l= 5;
        int v = 8;
        return v+l;}
    public static int methodex2(){

        int h=5;
        int d=8;
        return h+d;
    }
    protected static int youth(){
        int b=8;
        int g=4;
         return b+g;



    }
    public int methode (){
        int a=5;
        int b=4;
        return a+b;
    }








}
