package programs.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//maintains the insertion order
public class LinkedHashMapTest {
    public static void main(String[] args) {

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(8,"Alex");
        linkedHashMap.put(99,"Leandro");
        linkedHashMap.put(2,"John");
        linkedHashMap.put(9,"Andy");

        System.out.println(linkedHashMap);

    }
}
