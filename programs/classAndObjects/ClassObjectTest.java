package programs.classAndObjects;

import java.util.Objects;

public class ClassObjectTest {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(4, "red");
        v1.print();
        Vehicle v2 = new Vehicle(3);
        v2.print();

        System.out.println("v2 "+v2);
        System.out.println("v1 "+v1);

        System.out.println("v1 == v2 "+ (v1==v2));
        v2.wheel = 4;
        v2.colour = "red";
        System.out.println("v1 equals v2 "+ (v1.equals(v2)));

        Vehicle v3 = new Vehicle(4, "green");
        System.out.println("v3 equals v2 "+ (v3.equals(v2)));

        Vehicle v4 = v3;
        System.out.println("v3 == v4 "+ (v3 == v4));

        System.out.println("v3 equals v4 "+ (v3.equals(v4)));

        ClassObjectTest c = new ClassObjectTest();
        c.test();

        test(v4);
        System.out.println("final "+v4);


    }

    public void test(){

    }

    public static void test(Vehicle v5){
        v5.colour = "Yellow";
    }

}

 class Vehicle{

    //class variable
    static String type;

    //instance variable
    int wheel;
    String colour;

    //no args constructor
    public Vehicle(){
        System.out.println("no arg constructor");
    }

     //1 args constructor
     public Vehicle(int wheel){
        this.wheel = wheel;
         System.out.println("1 arg constructor "+this.wheel);
     }

    // args constructor
    public Vehicle(int w, String colour){
        System.out.println("args constructor");
        this.wheel = w;
        this.colour = colour;
    }

    // instance method
    public void print(){
        System.out.println("Wheel is "+this.wheel + " colour is "+this.colour);
    }

    //class method
     public static int move(){
        System.out.println("move method");
        return 0;
     }

     @Override
     public String toString() {
         return "Vehicle values are{ " +
                 "wheel=" + this.wheel +
                 ", colour='" + this.colour + '\'' +
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
 }
