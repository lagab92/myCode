package ObjectOrientedProgramming.ControlFlowStatements;

public class SwitchStatements {
    public static void main(String[] args) {
        int dayOfWeek = 7;
        switch (dayOfWeek){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
            case 3:
                System.out.println("wednesday");
                break;// this means you stop here
            case 4 :
                System.out.println("thursday");
            case 5:
                System.out.println("friday");
            case 6 :
                System.out.println("saturday");
            case 7 :
                System.out.println("sunday");

            default: // if no result found print this
                System.out.println("can not find ");


        }

        }






}
