package ObjectOrientedProgramming.Composition;

public class Keybord {
    String brand;
    Boolean isWireless;
    Boolean hasNotepad;

    public Keybord (String brand,boolean isWireless,boolean hasNotepad ){
        this.brand= brand;
        this.isWireless= isWireless;
        this.hasNotepad= hasNotepad;


    }
    void typingWithKeyboard(){
        System.out.println( " started typing with my new keyboard");

    }
    void turnOnCapsLock(){
        System.out.println(" Caps lock turned on we  are typing in all capital");
    }
    void turnOffCapsLock(){
        System.out.println( "Caps locks turned off we are typing all lowercases");
    }
}
