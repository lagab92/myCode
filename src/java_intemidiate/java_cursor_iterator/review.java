package java_intemidiate.java_cursor_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class review {


    public static void main(String[] args) {
        ArrayList<String> towns = new ArrayList<>();

        towns.add("alger");
        towns.add("tizi");
        towns.add("benidouala");
        towns.add("TO");
        Iterator<String> it = towns.iterator(); // get the iterator
        System.out.println(it.next());// print the first item

        while (it.hasNext()){// will read more elements if there is any
            System.out.println(it.next());
        }
     }
}
