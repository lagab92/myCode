package ObjectOrientedProgramming.Encapsulation;

public class EncapsulationPractice {
    //Create a class with attributes as username and password
    // and hide them from other classes, use encapsulation
    // to set the data and get the data in another class.
    private String username;
    private int password;

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public int getPassword(){
        return password;
    }
    public void setPassword(int password){
        this.password=password;
    }
}

