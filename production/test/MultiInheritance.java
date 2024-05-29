package out.production.test;


import java.io.Serializable;
import java.util.EnumSet;
import java.util.List;

interface VehicleInterface{

    final int wheel = 4;
    final String colour = "red";
    static final String name = "Vehicle";

    abstract void run();
}

interface Factory extends VehicleInterface{
    abstract void run1();
}


abstract class CarAbstract{
    abstract void run2();

    public void print(){
        System.out.println("print");
    }

}
class CarInheritance extends CarAbstract implements Factory{



    @Override
    public void run1() {

    }

    @Override
    void run2() {

    }

    @Override
    public void run() {

    }
}

enum DC{

    LOW (5),
    MEDIUM (10),
    HIGH(15),
    CRITICAL(20);

    private int value;

    DC(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

   static final EnumSet<DC> passSet = EnumSet.of(LOW,MEDIUM);
   static final EnumSet<DC> failSet = EnumSet.of(HIGH,CRITICAL);

}

class AutoInheritance implements VehicleInterface{

    @Override
    public void run() {
        System.out.println("Auto running");
    }
}

class RepairShopIntf{
    public static void repair(VehicleInterface v){
        v.run();
    }
}


public class MultiInheritance {

    public static void main(String[] args) {
        System.out.println(Vehicle.name );
        System.out.println(Vehicle.wheel );

        VehicleInterface v = new CarInheritance();
        RepairShopIntf.repair(v);

        v = new AutoInheritance();
        RepairShopIntf.repair(v);

        System.out.println(DC.LOW.getValue());
        System.out.println(DC.LOW);

        for(DC d : DC.values()){
            System.out.println(d.getValue());
        }


        CarAbstract cb = new CarInheritance();
        Factory f = new CarInheritance();

        System.out.println(DC.LOW.getValue());
        System.out.println(DC.LOW);

        for(DC d : DC.values()){
            System.out.println(d.getValue());
        }
        int value = 10;
        if(DC.passSet.contains(DC.MEDIUM)){
            System.out.println("pass");
        }
    }
}
