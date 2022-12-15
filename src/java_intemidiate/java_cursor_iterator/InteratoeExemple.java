package java_intemidiate.java_cursor_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class InteratoeExemple {
    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<>();

        states.add("NY");
        states.add("AZ");
        states.add("NJ");
        states.add("TX");


        Iterator it = states.iterator();

        while (it.hasNext()) {// hasnext

            System.out.println(it.next());

    }}
}
