package BasicJava;

public class Phone {

    // this class is the blueprint of all the phone that ever existed or
    //will exist

    String color;
    String brand;
    int size;
    int weight;

     static String typeOfPhone;

    void turnOn(){
        System.out.println("turns on the phone");

    }
    void turnOff(){
        System.out.println("turns off the phone");

    }
    void phoneCall (){
        System.out.println("making a phone call");

    }

    public static void main(String[] args) {

   // every instance is created to access non-staitc variable.

        Phone myPhone = new Phone();

        Phone myphone2 = new Phone();
        myPhone.brand="apple";
        myPhone.color="grey";
        myPhone.size+=7;
        myPhone.weight=238;

        // anathor phone
        //
        myphone2.brand = "samsung";
        myphone2.color = "silver";
        myphone2.size = 8;
        myphone2.weight= 300;
         typeOfPhone= "smart phone";
        System.out.println(typeOfPhone);
    }

}
