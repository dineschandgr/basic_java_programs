package programs.abstraction;



 interface MobilePhoneInt{
     public static final String city = "cbe";
      abstract void display();
}

interface MusicInt{
    void play();
}
class XiaomiInt implements MobilePhoneInt, MusicInt{


    @Override
    public void display() {
        System.out.println("Xiaomi display");
    }

    @Override
    public void play() {
        System.out.println("Xiaomi play");
    }
}

class RedmiInt implements MobilePhoneInt{

    @Override
    public void display() {
        System.out.println("Redmi Phone Display");
    }
}



public class TestInterface {
    public static void main(String[] args) {

        String city = MobilePhoneInt.city;
        XiaomiInt x = new XiaomiInt();
        x.display();
        x.play();

        RedmiInt r = new RedmiInt();
        r.display();

        MobilePhoneInt m = new XiaomiInt();
        m.display();

        MusicInt music = new XiaomiInt();
        music.play();

        m = new RedmiInt();
        m.display();

        MobileRepairInt.repair(m);
    }
}

class MobileRepairInt{

    public static void repair(MobilePhoneInt m){
        System.out.println("repair method");
        m.display();
    }
}