package out.production.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

class Vehicle{

    int wheel = 0;
    String colour = "red";

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheel=" + wheel +
                ", colour='" + colour + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return wheel == vehicle.wheel && Objects.equals(colour, vehicle.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheel, colour);
    }

    public static void test(List list){
        System.out.println("list is "+list);
    }

}

public class ArrayListTest_old {
    public static void main(String[] args) {


        ArrayList<Vehicle> vehiclesList = new ArrayList<>();

        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        Vehicle v3 = new Vehicle();
        Vehicle v4 = new Vehicle();
        Vehicle v5 = new Vehicle();

        vehiclesList.add(v1);
        vehiclesList.add(v2);
        vehiclesList.add(v3);
        vehiclesList.add(v4);
        vehiclesList.add(v5);

        Vehicle fourthVehicle = vehiclesList.get(3);

        System.out.println(vehiclesList);

        ArrayList<String> strList = new ArrayList<>();

        strList.add("hello");
        strList.add("hi");
        strList.add(1,"world");

        System.out.println(strList);

        Collection<String> c = new ArrayList<>(strList);

        ArrayList<String> strList1 = new ArrayList<>();
        strList1.addAll(c);

        System.out.println(strList1);

        List<Integer> intList = new LinkedList<>();

        List<Integer> intList1 = new ArrayList<>();

        List<Integer> linkedList = new LinkedList<>(intList1);

        Vehicle.test(intList);
        Vehicle.test(linkedList);

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        Queue<Integer> queue = new ArrayDeque<>();

        System.out.println();

        for(Integer i : stack)
            System.out.println(i);



        List<Integer> intList2 = List.of(100,10,20,30,40,50,10,20,10,20);

        Set<Integer> set = new LinkedHashSet<>(intList2);
        Set<Integer> set1 = new TreeSet<>(intList2);
        Set<Integer> set2 = new HashSet<>(intList2);

        System.out.println("linked " +set);
        System.out.println("tree "+set1);
        System.out.println("hash "+set2);

        List<Integer> uniqueList = new ArrayList<>(set1);

        Map<String, Vehicle> vehicleMap = new HashMap<>();
        vehicleMap.put("car", v1);
        vehicleMap.put("auto", v2);
        vehicleMap.put("jeep", v3);

        System.out.println(vehicleMap);

        for(Map.Entry<String,Vehicle> entry : vehicleMap.entrySet()){
            Vehicle v = entry.getValue();
            System.out.println("key is " +entry.getKey() +  " value is "+entry.getValue());
        }

        for(Vehicle v : vehicleMap.values()){
            System.out.println("key is " +v);
        }

        Vehicle[] varr = new Vehicle[10];

        List<Integer> arrList = new ArrayList<>();

        for(int i = 0; i < 1000000; i++){
            arrList.add(i);
            linkedList.add(i);
        }

        long startTime = System.nanoTime();

        //System.out.println(arrList.get(50000));
        arrList.add(500000, 50000);
        // Stop measuring execution time
        long endTime = System.nanoTime();

        // Calculate the execution time in milliseconds
        long executionTime
                = (endTime - startTime) / 1000000;

        System.out.println("Counting in ArrayList takes "
                + executionTime + "ms");

        //linked list time

        startTime = System.nanoTime();

        //System.out.println(linkedList.get(50000));
        linkedList.add(500000, 50000);
        // Stop measuring execution time
        endTime = System.nanoTime();

        // Calculate the execution time in milliseconds
        executionTime
                = (endTime - startTime) / 1000000;

        System.out.println("Counting in LinkedList takes "
                + executionTime + "ms");






    }
}
