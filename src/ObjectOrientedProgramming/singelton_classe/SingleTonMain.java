package ObjectOrientedProgramming.singelton_classe;

public class SingleTonMain {

    public static void main(String[] args) {

        SingeltonClass o =SingeltonClass.getInstance(10);
        SingeltonClass o2 = SingeltonClass.getInstance(20);
        SingeltonClass o3 = SingeltonClass.getInstance(30);

        System.out.println(o.x);
        System.out.println(o2.x);
        System.out.println(o3.x);
    }
}
