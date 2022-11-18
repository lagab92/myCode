package ObjectOrientedProgramming.Polymorphism;

public class ConsOverPractice {
    int one;
    double two;
    public ConsOverPractice(int one){
        this.one=one;

    }

    public static void main(String[] args) {
        ConsOverPractice obj = new ConsOverPractice(40);
        System.out.println(obj.one);
        System.out.println(obj.ConsOverPractice(10.5,40));

    }
    public double ConsOverPractice(double two,int one){
        this.one=one;
        this.two=two;

        return two+one;

    }
}
