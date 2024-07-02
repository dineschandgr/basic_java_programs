package programs.statictest;

public class StaticTest {

    public static void main(String[] args) {
        Vehicle.run();

    }

    static{
        System.out.println("static block");
    }

}

 class Vehicle{
    int wheel;
    static String name = "hello";

    public static void run(){
        System.out.println("static method");
    }

     public  void display(){
         System.out.println("display method");
     }

}
