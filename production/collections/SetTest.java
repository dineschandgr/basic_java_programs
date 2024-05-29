package out.production.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(100);
        integerList.add(10);
        integerList.add(10);
        integerList.add(10);
        integerList.add(10);
        integerList.add(10);
        integerList.add(20);
        System.out.println("duplicate list is " + integerList);
        Set<Integer> integerSet = new HashSet<>(integerList);
        integerSet.add(10);
        integerSet.add(20);
        integerSet.add(30);
        integerSet.add(10);
        System.out.println("integer set is " + integerSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>(integerList);
        Set<Integer> treeSet = new TreeSet<>(integerList);
        System.out.println("Hash set is " + integerSet);
        System.out.println("linked hash set is " + linkedHashSet);
        System.out.println("tree Set is " + treeSet);

        List<Integer> uniqueList = new ArrayList<>(integerSet);
        System.out.println("unique list is " + uniqueList);

        for (Integer i : integerSet)
            System.out.println("values " + i);

        Set<Student> studentSet = new HashSet<>();
        Student s1 = new Student(1, "John");
        Student s2 = new Student(1, "John");
        Student s3 = new Student(1, "Theresa");
        Student s4 = s3;
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);
        System.out.println("student set " + studentSet);

        Set<Integer> intSet = new HashSet<>();
        List<Integer> duplicateList = new ArrayList<>();
        for(int i : integerList){

            if(intSet.contains(i)){
                System.out.println("duplicate element "+i);
                duplicateList.add(i);
            }else{
                intSet.add(i);
            }
        }

        System.out.println("duplicate list "+duplicateList);
        System.out.println("unique list "+intSet);


    }
}
