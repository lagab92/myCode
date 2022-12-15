package ObjectOrientedProgramming.Inheratence.LearninigINherentce;

public class TestInhertance {

    // with inheratance you will have all access to
    // all classes that extend from the foodParent
    // but with object you can only see what is inside one class at a time



    public static void main(String[] args) {
//      data type //refreenece// instance
              Bread br = new Bread();
              Apples a = new Apples();


              // we are baying bread

        br.name ="wonder";
        br.size = 12;
        br.weight= 500;

        br.madeBy = "homemade";

        System.out.println(br.name);

        // we rae bying apples

        a.name= "red apples";
        a.size= 4;
        a.weight=1000;
        a.isRed = true;

        a.drinkingJuiceOfApple();
    }
}
