package ObjectOrientedProgramming.Encapsulation;

public class GettersAndSettersReview {

    private int acc;// second step 123456
    private int pass;
     // in this methode i am refering to the varible int acc
    public void setAcc( int acc){
        this.acc=acc;// first step i assign this value 123456 to the first acc

    }

    public int getAcc() {

        return acc;
    }

    public static void main(String[] args) {

        GettersAndSettersReview obj = new GettersAndSettersReview();
        obj.setAcc(123456);
        System.out.println(obj.getAcc());




    }



}
