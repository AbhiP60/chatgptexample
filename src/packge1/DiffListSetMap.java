package packge1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DiffListSetMap {
	
	public static void main(String[] args) {
		
        // List
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");
        myList.add("Apple"); // Duplicates are allowed
        System.out.println("List: " + myList);

        // Set
        Set<String> mySet = new HashSet<>();
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Cherry");
        mySet.add("Apple"); // Duplicates are not allowed
        System.out.println("Set: " + mySet);

        // Map
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);
        myMap.put("two", 22); // Duplicate keys are not allowed, value is updated
        System.out.println("Map: " + myMap);
    }
	}


