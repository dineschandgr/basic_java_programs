package programs.Class.Object;

import programs.classAndObjects.ClassObjectTest;

public class TestAccess {

    public static void main(String[] args) {
        VehicleDefault vehicleDefault = new VehicleDefault();

        ClassObjectTest classObjectTest = new ClassObjectTest();
        classObjectTest.a = 10;

        Vehicle v = new Vehicle();

    }
}
