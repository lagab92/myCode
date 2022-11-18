package ObjectOrientedProgramming.ControlFlowStatements;

public class DoWhileLoop {
    public static void main(String[] args) {
        int a=1;
        // the purpose of dowhile will print out the
        // first line of code no matter the conditions
        do{
            System.out.println("printing without checking the condition");
            a++ ;// add increment if the statemnt is true
        } while (a<10);
    }
}
