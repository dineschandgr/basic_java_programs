package out.production.defaultpackage;


import out.production.Class.Object.ProtectedTest;
import out.production.Class.Object.Test;

public class TestDefault extends ProtectedTest{
    public static void main(String[] args) {
        //VehicleDefault vehicleDefault = new Veh
        Test test = new Test();



        test.test = 10;

    }

    public void display(){
        System.out.println(this.legs + this.type);
    }

}
