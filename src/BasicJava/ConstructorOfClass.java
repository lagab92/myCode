package BasicJava;

public class ConstructorOfClass {

    int x=200;
    String str = "name";
   public ConstructorOfClass( int x2, String str2){
       // constructor does'nt need a data type
       x=x2;
       str=str2;


   }
   void mOne () {

   }

    public static void main(String[] args) {
        ConstructorOfClass obj = new ConstructorOfClass( 10,  "hello");
        System.out.println(obj.x);
        System.out.println(obj.str);
    }
}
