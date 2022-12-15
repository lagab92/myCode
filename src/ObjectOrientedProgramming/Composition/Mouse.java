package ObjectOrientedProgramming.Composition;

import java.lang.invoke.StringConcatException;

public class Mouse {
    String brand;
    String color;
    Boolean isWirelesss;
    Boolean hasScrolWheel;

    public Mouse(String brand, String color , Boolean isWirelesss, boolean hasScrolWheel){
        this.brand =brand;
        this.color = color;
        this.isWirelesss = isWirelesss;
        this.hasScrolWheel= hasScrolWheel;

    }
    void  leftClick(){
        System.out.println(" left button click");
    }
    void rightClick(){
        System.out.println("right button click");


    }
    void scrolUp(){
        System.out.println("scrolling up");

    }
    void  scrollDown(){
        System.out.println(" scrolling down");
    }
}
