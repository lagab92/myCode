package java_intemidiate.data_structure;

import java.util.AbstractList;
import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {

        ArrayList<String> towns = new ArrayList<String>();

        towns.add("tizi");
        towns.add("alger");
        towns.add("annaba");
        towns.add("oran");

        System.out.println(towns);


        int[] n = new int[3];
        n[0] = 10;
        n[1] = 20;
        n[2] = 30;


        for (int a : n) {
            System.out.println(a);


        }


    }
}
