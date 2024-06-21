package out.production.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapTest {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(8, "Alex");
        hashMap.put(99, "Leandro");
        hashMap.put(2, "John");
        hashMap.put(9, "Andy");

        String name = hashMap.get(2);

        System.out.println(hashMap);

        //to retrieve keys and values for map
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            String name1 = entry.getValue();
            System.out.println("key is " + entry.getKey() + " value is " + entry.getValue());
        }

        //to retrieve keys for map
        for (Integer k : hashMap.keySet()) {
            System.out.println("key is " + k);
        }

        //retrieve values for hashmap
        for (String s : hashMap.values()) {
            System.out.println("Value is " + s);
        }

        Student s1 = new Student(1, "Alex");
        Student s2 = new Student(1, "Andy");
        Student s3 = new Student(1, "Andy");

        Map<Student, String> studentMap = new HashMap<>();
        studentMap.put(s1, "S1");
        studentMap.put(s2, "S2");
        System.out.println("before adding s3 "+studentMap);

        studentMap.put(s3, "S3");

        for (Map.Entry<Student, String> entry : studentMap.entrySet()) {
            String name1 = entry.getValue();
            System.out.println("key is " + entry.getKey() + " value is " + entry.getValue());
        }
    }
}
    class Student{
        int rollNo;
        String name;

        public Student(int rollNo, String name) {
            this.rollNo = rollNo;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return rollNo == student.rollNo && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(rollNo, name);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "rollNo=" + rollNo +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
