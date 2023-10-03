package packge1;

import java.util.*;

public class ArrayListVsLinkedListExample {
    public static void main(String[] args) {
        // ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        // LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("X");
        linkedList.add("Y");
        linkedList.add("Z");

        // Accessing elements
        String element1 = arrayList.get(1); // Fast random access
        String element2 = linkedList.get(1); // Slower random access

        System.out.println("ArrayList Element: " + element1);
        System.out.println("LinkedList Element: " + element2);
    }
}
