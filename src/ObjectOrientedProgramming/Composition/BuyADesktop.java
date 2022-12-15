package ObjectOrientedProgramming.Composition;

public class BuyADesktop {
    public static void main(String[] args) {
        Keybord dellKeyboard = new Keybord("dell",  true,true);
        Mouse hpMouse = new Mouse("hp", "blue", true,true);
        Monitor asusMonitor= new Monitor( "asus", "4k",27);

        Computer deskTpPc = new Computer( dellKeyboard, hpMouse, asusMonitor);
        deskTpPc.myKeyboard.typingWithKeyboard();
        deskTpPc.myMouse.leftClick();
        deskTpPc.monitor.turnOff();
    }
}
