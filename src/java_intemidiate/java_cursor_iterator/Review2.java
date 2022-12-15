package java_intemidiate.java_cursor_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Review2 {
    public static void main(String[] args) {



    // exemple of list interator
    // with list iterator we could interat on both direction
    ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);

        Iterator abc = al.iterator();
        ListIterator li = al.listIterator();
        System.out.println("---print top to bottom");


        while (li.hasNext()){
            System.out.println(li.hasNext());
        }




}}
