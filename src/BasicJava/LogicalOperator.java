package BasicJava;

public class LogicalOperator {


    public static void main(String[] args) {

        welcome ();
        // and && : true if two expression are right / false if one oth expression is wrong


              int g=100;


              System.out.println(g<50 && g<200);

        // OR || means one of them is correct
        // if both of them are correct the result will be true
        // but if both are not correct then the result will be false

        int i=4;
        int n=6;
        System.out.println(i>n || n<i) ;


        // ! not operator : this means that the expression is true but the result is false and verse versa
        boolean u = 5<10;
        System.out.println(!u);


    }

    public static void welcome () {
        System.out.println("welcome to the word");
        System.out.println("I LOVE YOU");

    }








}
