package programs.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GenericsTest {
    public static void main(String[] args) {

      /*  List<String> l = new ArrayList<String>();
        l.add("one");
        l.add(10);
        l.add('c');
        Integer i = (Integer)l.get(0);*/

        Map<String,Integer> map = new LinkedHashMap<>();
        //map.put(10,"s");

        List<Integer> l1 = new ArrayList<>();
        l1.add(10);

        Integer a = (Integer) l1.get(0);
        Integer b = (Integer) l1.get(1);


        List<Integer> list = new ArrayList<>();
        list.add(10);

        System.out.println(list);
        Integer i = (Integer) list.get(0);
        Integer i2 = (Integer) list.get(1);
    }
}
