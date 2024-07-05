package programs.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(0,3);
        System.out.println(linkedList);
        linkedList.set(2,100);
        linkedList.clear();
        System.out.println(linkedList);

        for(Integer i : linkedList){
            System.out.println("i is "+i);
        }

    }
}
