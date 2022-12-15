package BasicJava.Learn_keyword_final;

public class FinalWithMtwo extends  FinalWithMethod {

    void mOne (){
        System.out.println("seconde");
        super.mOne();

    }

    public static void main(String[] args) {
         FinalWithMethod obj = new FinalWithMtwo();
         obj.mOne();
    }
}
