package ObjectOrientedProgramming.Polymorphism;

public class MethodeLoading {

    // overloding is adding more parametre or change the data type
    //to the same methode in order to use it again
    public int add(int one , int two){
        return one +two ;

    }



    public static void main(String[] args) {

        MethodeLoading obj = new MethodeLoading();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20,30));
        System.out.println( obj.add(40,20,30,"this is mustapha "));
        System.out.println( obj.add(10,50,14.2,"dont call me"));

    }

    public int add(int one, int two, int three) {
        return one + two + three;

    }
     public double add(double one, int two, int three) {
        return one + two+ three;

    }
    public int add(int one, int two,int three,String str){
         // ALWAYS PUT SOUR FIRST BEFORE RETURN
        System.out.println(str);
        return one + two+ three;
    }
      public double add ( int one , int two, double three, String str){
          System.out.println(str);
          return one + two+ three;

      }








}



