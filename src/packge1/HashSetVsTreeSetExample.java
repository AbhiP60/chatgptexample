package packge1;

import java.util.*;

public class HashSetVsTreeSetExample {
    public static void main(String[] args) {
       
    	// HashSet
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(2);
        hashSet.add(1); // Duplicate is ignored
        System.out.println(hashSet);
        
        // TreeSet
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3); // Duplicate is ignored, elements are sorted

      System.out.println(treeSet);
    }
}
