package out.production.untitled;


  class Vehicle {

    //instance variables
      private int wheel = 10;
      private String colour = "red";
      private String type;


    public Vehicle(){
         System.out.println("Vehicle Constructor");
     }

     public Vehicle(int w, String c){
         this.wheel = w;
         this.colour = c;
         System.out.println("Parent param Constructor ");
     }


     public void display() {
         System.out.println("parent "+this.wheel + " "+this.colour );
     }

      public int getWheel() {
          return wheel;
      }

      public void setWheel(int wheel) {
          this.wheel = wheel;
      }

      public String getColour() {
          return colour;
      }

      public void setColour(String colour) {

        this.colour = colour;
      }

      public String getType() {
          return type;
      }

      public void setType(String type) {
          this.type = type;
      }
  }

 class Car extends Vehicle {

     String name = "KIA";

     public Car() {
         System.out.println("Car Constructor");
     }

     public Car(int wheel, String colour, String n) {
         super(wheel, colour);
         //super()
         this.name = n;
         System.out.println("Child Param Constructor " + this.name);
     }

     public void display() {
         System.out.println("child ");
     }

     public void displayCar() {
         System.out.println("child car");
     }

 }

    class Auto extends Car{

        public Auto(){
            System.out.println("Auto Constructor");
        }

        public Auto(int wheel, String colour){
            //super();
            //super(wheel, colour);
            System.out.println("Child Param Constructor Auto ");
        }

        public static void printAuto(){
            System.out.println("print auto");
        }

    }

    public class Test{

        public static void main(String[] args) {

            /*Car c = new Car(4,"blue","Maruti");

            System.out.println("car values "+c.name + " "+c.colour+ " "+c.wheel);
*/
            Auto a = new Auto();
            a.setColour("red");
            System.out.println("Auto colour is "+a.getColour());
            a.getColour();

            display();

            Auto.printAuto();
        }

        public static void display(){

            System.out.println("Test display");
        }


        static{

            System.out.println("static blocks");
        }
}