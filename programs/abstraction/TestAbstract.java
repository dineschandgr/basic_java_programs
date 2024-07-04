package programs.abstraction;



    interface VehicleInterface {

        int wheel = 4;
        final String colour = "red";
        static final String name = "Vehicle";

        abstract void run();
    }

    interface Factory extends VehicleInterface{
        abstract void run1();
    }

abstract class CarAbstract {

        static int a = 10;
        static final int b = 20;
    abstract void run2();

    public void print() {
        System.out.println("print");
    }

}

    class Intf extends CarAbstract implements Factory{

        @Override
        public void run1() {

        }
        @Override
        public void run() {

        }

        public void print() {
            System.out.println("print");
        }

        @Override
        void run2() {
            System.out.println("from car abstract class");
        }
    }

public class TestAbstract {

    public static void main(String[] args) {
        CarAbstract ca = new Intf();

        ca.run2();

        Factory f = new Intf();
        f.run1();
        f.run();

        Intf f1 = new Intf();

        CarAbstract.a = 40;

    }
}


    class AutoInheritance implements VehicleInterface {

        @Override
        public void run() {
            System.out.println("Auto running");
        }
    }

    class RepairShopIntf {
        public static void repair(VehicleInterface v) {
            v.run();
        }
    }




