package OOPS;

// Defining a class
class Car {
    // Fields (attributes)
    String brand;
    String color;
    int year;

    // Constructor
    Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    // Method
    void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
        System.out.println("-------------------");
    }
}

// Main class to run the program
public class CarTest {
    public static void main(String[] args) {
        // Creating objects of Car class
        Car car1 = new Car("Toyota", "Red", 2020);
        Car car2 = new Car("Honda", "Blue", 2022);

        // Calling methods using objects
        car1.displayDetails();
        car2.displayDetails();
    }
}
