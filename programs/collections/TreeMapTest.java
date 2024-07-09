package programs.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//maintains the insertion order
public class TreeMapTest {
    public static void main(String[] args) {

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(8,"Alex");
        treeMap.put(99,"Leandro");
        treeMap.put(2,"John");
        treeMap.put(9,"Andy");

        System.out.println(treeMap);

    }
}
