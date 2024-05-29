package out.production.Class.Object;

import java.io.Serializable;
import java.util.Objects;


class VehicleDefault{

    int wheel;
    String name;
}
class Vehicle {

    // instance variable
    int wheel = 0;
    String colour = "";

    // class variable
    static String type;

    // constructor

    Vehicle(){
        System.out.println("no arg constructor");
    }
    Vehicle(int w, String c){
        System.out.println("args constructor");
        this.wheel = w;
        this.colour = c;
    }

    // instance method
    public int print(){
        System.out.println("Instance Method");
        return print1();
    }

    public int print1(){
        System.out.println("Instance Method 2");
        return 2;
    }

    // class method
    public static void printStatic(){
        System.out.println("Static Method");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "  ** wheel=" + wheel +
                ", ** colour='" + colour + '\'' +
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

    static{
        System.out.println("static block 1");
    }
}

public class Test{
    public int test;

    static{
        System.out.println("static block 2");
    }

    public static void main(String[] args) {


        Vehicle v1 = new Vehicle(4, "red");

        Vehicle v2 = new Vehicle(4,"blue");

        Vehicle v3 = v2;

        System.out.println("v1 is "+v1);
        int value = v1.print();
        System.out.println("val is "+value);


        System.out.println("v2 is "+v2);
        v2.print();

        Vehicle.type = "vehicle";
        Vehicle.printStatic();

       //checks memory location of objects
       System.out.println(" v1 = v2 "+(v1 == v2));

       //checks value inside objects
       System.out.println(" v1 eq v2 "+(v1.equals(v2)));
    }
}
