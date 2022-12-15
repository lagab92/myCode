package SecondProject.Final_Keyword;

public class FinalWithInstanceMain {
    public static void main(String[] args) {
        FinalKeyWithInstance jaguar = new FinalKeyWithInstance();
        FinalKeyWithInstance rr = new FinalKeyWithInstance();
        FinalKeyWithInstance nissan = new FinalKeyWithInstance();
         // always create a differnet instance  if you want to use
        // difernt scenerios

        jaguar.color = "red";
        jaguar.brand = "jaguar";
        jaguar.numOfDoors = 2;
        System.out.println(jaguar.color);

        rr.color = "blue";
        rr.brand = "range rover";
        rr.numOfDoors = 5;

        System.out.println(rr.color );

        nissan.color= "silver";
        nissan.brand= "Nissan";
        nissan.numOfDoors = 2;


        System.out.println(nissan.color);



















    }
}
