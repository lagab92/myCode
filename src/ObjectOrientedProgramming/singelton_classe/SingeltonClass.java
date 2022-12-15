package ObjectOrientedProgramming.singelton_classe;

public class SingeltonClass {

    int x = 50;

    static SingeltonClass obj = new SingeltonClass();

    private SingeltonClass(){


    }
    public static SingeltonClass getInstance(int x ){

        return obj;
    }

}
