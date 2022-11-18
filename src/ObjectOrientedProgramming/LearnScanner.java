package ObjectOrientedProgramming;

import java.util.Scanner;

public class LearnScanner {
    public static void main(String[] args) {
        // Scanner is a class
        // always create an obj to access Scanner class
        // system.in = in the system i am running on input the data
        // scanner is used to get user inputs from outside
        Scanner s = new Scanner(System.in);
        // next () will onlu go untill it sees a space
        //

       System.out.println("please enter a value");

        int x = s.nextInt();
        System.out.println("enter anothor value");
        int y = s.nextInt();



        System.out.println(x+y);

    }
}
