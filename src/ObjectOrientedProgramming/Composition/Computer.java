package ObjectOrientedProgramming.Composition;

public class Computer {

    String s ;

    Keybord myKeyboard;

    Mouse myMouse;

    Monitor monitor;

    public Computer( Keybord myKeyboard, Mouse myMouse , Monitor monitor){
        this.myKeyboard = myKeyboard;
        this.myMouse  = myMouse;
        this.monitor= monitor;
    }




}
