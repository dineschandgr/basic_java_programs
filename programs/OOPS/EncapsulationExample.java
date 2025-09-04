package OOPS;

class Student {
    private String name;  // private data (hidden)

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("John"); // setting value
        System.out.println("Student name: " + s.getName());
    }
}
