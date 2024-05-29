package out.production.abstraction;

abstract class MobilePhone{
    abstract void display();

    public void name(){
        System.out.println("Name");
    }
}

class Xiaomi extends MobilePhone{

    @Override
    void display() {
        System.out.println("Xiaomi Phone Display");
    }
}

class Redmi extends MobilePhone{

    @Override
    void display() {
        System.out.println("Redmi Phone Display");
    }
}



public class AbstractTest {
    public static void main(String[] args) {

        Xiaomi x = new Xiaomi();
        x.display();

        Redmi r = new Redmi();
        r.display();

        MobilePhone m = new Xiaomi();
        //m.display();
        MobileRepair.repair(m);
        m = new Redmi();
       // m.display();

        MobileRepair.repair(m);
    }
}

class MobileRepair{

    public static void repair(MobilePhone m){
        System.out.println("repair method");
        m.display();
    }
}
