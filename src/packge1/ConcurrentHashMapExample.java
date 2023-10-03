package packge1;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("one", 1);
        concurrentMap.put("two", 2);
        concurrentMap.put("three", 3);

        // Perform concurrent updates without blocking
        concurrentMap.compute("two", (key, value) -> value + 10);
        concurrentMap.put("four", 4);

//        System.out.println("ConcurrentHashMap: " + concurrentMap);
        System.out.println(concurrentMap);
    }
}
