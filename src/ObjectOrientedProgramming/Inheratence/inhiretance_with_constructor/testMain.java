package ObjectOrientedProgramming.Inheratence.inhiretance_with_constructor;

public class testMain {

    public static void main(String[] args) {
        foodParent tuna = new foodParent(10, "tuna");
        tunaFoodChild myTuna= new tunaFoodChild(true,5,10, "tuna");
        System.out.println( myTuna.weight);
        System.out.println(myTuna.isItFrozen);
        System.out.println(myTuna.nameOfFood);
        System.out.println(myTuna.size);
        myTuna.eatinMyTuna();


    }
}
