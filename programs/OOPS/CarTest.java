package OOPS;

// Defining a class
class Car {
    // Fields (attributes)
    String brand;
    String color;
    int year;

    // no args Constructor
    Car() {

    }

    // Constructor
    Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

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
        //Car car1 = new Car("Toyota", "Red", 2020);


        Car car1 = new Car();
        Car car2 = new Car("Honda", "Blue", 2022);

        // Calling methods using objects
        car1.displayDetails();
        car2.displayDetails();


        car1.brand = "Toyota";
        car1.year = 2020;
        car1.color = "Red";
        car1.displayDetails();

        Car car3 = new Car("Mercedes", "Yellow");
        car3.displayDetails();


    }
}
