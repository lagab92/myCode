package BasicJava;

public class CastingLearning {

    public static void main(String[] args) {
        int i=50;
        short s= 5;
        long l=10l;
        float f=5.5f;
        double d = 7.774;
        System.out.println(i+l);

        // when we are converting a large data to a small data  is called narrowing
        //  when we are converting a small data to a large data is called widening

        System.out.println((int) (d));//   narrowing  (int) type we want to convert it to and
        // (b) means we want to convert from
        System.out.println((double) (i));// widening
        System.out.println((float) (l));// narrowing


        int a=10;
        long b=6413265l;
        System.out.println((int) (b));


        float j = 4.5f;
        double  k = 5.2225626662;
        System.out.println((float)(k));

        // primitive to non-premitive
        //concat
        String str = "hello";
        String str2 = "this java";
        System.out.println(str + str2);
        String str3="5+5";
        int inti =40;
        String convertostr = String.valueOf(inti);
        System.out.println(5+convertostr);
        int additionint = 100+100 ;
        String contost2 = String.valueOf(additionint);
        System.out.println(5+contost2);
        System.out.println(5+"200");

        boolean bl =false;
        System.out.println(String.valueOf(bl)+"yes");

        String str4= "hello";
        char ch2= str4.charAt(0);

        System.out.println(String.valueOf(ch2));


        // non perimitive to perimitive

       // if you want to use int as a class you have to write Integer as whole word\
       Integer myInt = 5;

       String myStr5 = "5";
        System.out.println(Integer.parseInt(myStr5)+5);

        System.out.println((int)(d));
        System.out.println((double) (f));










    }

}
