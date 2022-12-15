package ObjectOrientedProgramming.Inheratence.inhiretance_with_constructor;

public class tunaFoodChild extends foodParent{


    boolean isItFrozen;
    int weight;

    public tunaFoodChild( boolean isItFrozen, int weight, int size, String nameOfFood){

        super(size, nameOfFood);
        this.isItFrozen= isItFrozen;
        this.weight=weight;


    }
   void  eatinMyTuna(){
        super.eatFood();
       System.out.println("eating tuna");

   }
}
