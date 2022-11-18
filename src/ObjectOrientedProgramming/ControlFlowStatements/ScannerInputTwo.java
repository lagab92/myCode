package ObjectOrientedProgramming.ControlFlowStatements;

import java.util.Scanner;

public class ScannerInputTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();// 5
        int d = sc.nextInt();// 7
        if (a<d)
            System.out.println( "a is smaller");
            else if (a>d)
            System.out.println("d is smaller");
            else
            System.out.println("equal");
            sc.close();

    }
}
