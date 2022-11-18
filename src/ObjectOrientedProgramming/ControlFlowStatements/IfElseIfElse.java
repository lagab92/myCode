package ObjectOrientedProgramming.ControlFlowStatements;

public class IfElseIfElse {

    void ifElse (int x, int y) {



        if (x>y){
            System.out.println("x has a bigger value");
        }else if (y>x){
            System.out.println("y has a bigger value");
        }else if (x==y){
            System.out.println("equal");
            // else here means if all what is above is wrong then print something is wrong
        }else {
            System.out.println("something is wrong");
        }



    }
    public static void main(String[] args) {
        IfElseIfElse obj= new IfElseIfElse();
        obj.ifElse(20,10);

    }

}
