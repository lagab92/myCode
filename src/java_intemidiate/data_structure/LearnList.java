package java_intemidiate.data_structure;

import java.util.ArrayList;

public class LearnList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
         shoppingList.add(0,"milk");
         shoppingList.add(1,"eggs");
         shoppingList.add(2,"bread");

        System.out.println(shoppingList.size());
        System.out.println(shoppingList.contains("milk"));
        System.out.println(shoppingList.indexOf("bread"));




        }}
