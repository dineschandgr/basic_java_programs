package programs.inheritance;

class Vehicle {

    //instance variables
    public int wheel = 10;
    public String colour = "red";

    Vehicle(){
        System.out.println("Parent no-arg constructor");
    }

    public Vehicle(int w, String c){
        this.wheel = w;
        this.colour = c;
        System.out.println("Parent param Constructor ");
    }


    public void displayVehicle() {
        System.out.println("parent "+this.wheel + " "+this.colour );
    }

    public final void run(){
        System.out.println("Vehicle Running");
    }

    public final void run(int a){
        System.out.println("Vehicle Running");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheel=" + wheel +
                ", colour='" + colour + '\'' +
                '}';
    }
}

class Car extends Vehicle {

    //instance variable
    String name = "KIA";

    public Car() {
        System.out.println("Car Constructor");
    }

    public Car(String name){
        this.name = name;
        System.out.println("Car Constructor 1 param");
    }

    public Car(int wheel, String colour, String name) {

        super(wheel, colour);

        //this.wheel = wheel;
        //this.colour = colour;
        this.name = name;
        System.out.println("Child Param Constructor " + this.name);
    }

    public void display() {
        System.out.println("child ");
    }

    public void displayCar() {
        System.out.println("child car");
    }



    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", wheel=" + wheel +
                ", colour='" + colour + '\'' +
                '}';
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
        //Vehicle v = new Vehicle(4,"blue");
        //System.out.println(v);

        Car c1 = new Car();

        Car c2 = new Car("Ferrari");

        Car c3 = new Car(4, "green", "Maruti");

        System.out.println("c1 "+c1);
        System.out.println("c2 "+c2);
        System.out.println("c3 "+c3);

        System.out.println(c3);

        c3.colour = "blue";

        Vehicle v = new Vehicle();
        v.run();

        //v = new Car();
        c3.run();



      /*  Car c1 = new Car(4, "red", "Maruti");
        System.out.println(c1);

        c.displayVehicle();
        c.displayCar();

        //v.displayVehicle();
*/
        Auto a = new Auto(4, "yellow");
        System.out.println(a);

        c3.colour = "green";

        System.out.println(c3);

    }
}


class Auto extends Vehicle {

    String type;

    public Auto(){
        System.out.println("Auto Constructor");
    }

    public Auto(int wheel, String colour){
        //super(wheel, colour);
        this.wheel = wheel;
        this.colour = colour;
        System.out.println("Child Param Constructor Auto ");
    }

    public static void printAuto(){
        System.out.println("print auto");
    }

    @Override
    public String toString() {
        return "Auto{" +
                "type='" + type + '\'' +
                ", wheel=" + wheel +
                ", colour='" + colour + '\'' +
                '}';
    }
}
