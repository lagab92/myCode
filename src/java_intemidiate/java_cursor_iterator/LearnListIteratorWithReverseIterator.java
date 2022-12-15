package java_intemidiate.java_cursor_iterator;

import java.util.*;

public class LearnListIteratorWithReverseIterator {

    public static void main(String[] args) {

        // exemple of list interator
        // with list iterator we could interat on both direction
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);


        Iterator abc = al.iterator();// iterator can be used to iterat in one direction

        ListIterator li = al.listIterator();// listintertor can be used to iterat throuht both direction


        System.out.println("---print forward---(top to bottom)");
        while (li.hasNext()) {


         //   System.out.println(li.next());
        }
        System.out.println("---print backward---(bottom to top)----");
        while (li.hasPrevious()){

          //  System.out.println(li.hasPrevious());
        }

        HashMap <Integer,String> hm = new HashMap<>();

        hm.put(1,"NY");
        hm.put(2,"TX");
        hm.put(3,"MN");

        Iterator<HashMap.Entry<Integer, String>> tr = hm.entrySet().iterator();

  while (tr.hasNext()){

      System.out.println(tr.next());
  }












    }
}
