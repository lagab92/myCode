package ObjectOrientedProgramming.review;

// as soon as we implaments the methodes we have to implamnet its methodes

public class MainClass2 implements  MyInterface2 {
    @Override
    public void myM() {
        System.out.println(1);

    }

    @Override
    public void myM2() {
        System.out.println(2);

    }

    @Override
    public void myM3() {
        System.out.println(3);

    }

    @Override
    public void myM4() {
        System.out.println(4);

    }

    public static void main(String[] args) {
        MainClass2 obj = new MainClass2();

    }
}
