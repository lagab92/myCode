package java_intemidiate.data_structure;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        // gets added on top
        // last in first out

        Stack<String>  myShoppingList = new Stack<>();

        myShoppingList.push("milk");
        myShoppingList.push("sugar");
        myShoppingList.pop();


        for (String a : myShoppingList){
            System.out.println(a);
        }




    }
}
