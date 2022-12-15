package java_intemidiate.data_structure;

import java.util.HashMap;
import java.util.HashSet;

public class LearnHashMap {
    // hashmap looks dor the value throuh the key
    // data is stored in the keyvalue
    // can not  have dublicate keys and can have duplicate value

    public static void main(String[] args) {
        HashMap<Integer, String> mHash = new HashMap<>();

        mHash.put(1,"milk");
        mHash.put(2,"eggs");
        mHash.put(3,"suggar");

        System.out.println(mHash.get(2));
        System.out.println(mHash.keySet());
        System.out.println(mHash.values());









    }

}
