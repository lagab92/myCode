package ObjectOrientedProgramming.Polymorphism;

import java.util.concurrent.Callable;

public class ConstructorOverLoading {
    // we call constructor by calling class name
    int one;
    double two;
     String three;
    public ConstructorOverLoading(int one){
        this.one=one;



    }

    public static void main(String[] args) {
         ConstructorOverLoading obj= new ConstructorOverLoading(50);
        System.out.println(obj.one);
        System.out.println(obj.ConstructorOverLoading(10,5.5, "tizi ouzou"));


    }
    public  double ConstructorOverLoading(int one,double two, String three ){
        this.one=one;
        this.two=two;
        this.three=three;
        System.out.println(three);
        return one+two;

    }









}
