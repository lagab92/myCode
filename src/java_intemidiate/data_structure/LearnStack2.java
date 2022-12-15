package java_intemidiate.data_structure;

import java.util.Stack;

public class LearnStack2 {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        myStack.push(10);
        myStack.push(20);
        myStack.pop();
        myStack.pop();
        myStack.push(30);
        myStack.push(40);


        for (int a : myStack){
            System.out.println(a);
        }
        System.out.println(myStack.peek());

    }
}
