package ObjectOrientedProgramming.Encapsulation;

public class CallingGettersAndSetters {
    public static void main(String[] args) {
      GetterAndSetters obj = new GetterAndSetters();
      // getssn means set a value for this variable we are calling
      obj.setSsn(4561);
      System.out.println(obj.getSsn());
   obj.setAcc(66666);
        System.out.println(obj.getAcc());



    }
}
