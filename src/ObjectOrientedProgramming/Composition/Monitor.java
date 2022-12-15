package ObjectOrientedProgramming.Composition;

public class Monitor {

    int size;
    String brand;
    String  resoulution;

    public  Monitor( String brand, String resoulution, int size){
         this.brand=brand;
         this.resoulution=resoulution;
         this.size=size;

    }
    void turnOff(){
        System.out.println(" turning off monitor");
    }
    void  turnOn(){
        System.out.println("turning on monitor");
    }




}
