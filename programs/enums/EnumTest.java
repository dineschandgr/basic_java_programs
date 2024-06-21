package out.production.enums;



import java.util.EnumSet;

enum Temperature{

    LOW (5),
    MEDIUM (10),
    HIGH(15),
    CRITICAL(20);

    private int value;

    Temperature(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    static final EnumSet<Temperature> safeRange = EnumSet.of(LOW,MEDIUM);
    static final EnumSet<Temperature> highRange = EnumSet.of(HIGH,CRITICAL);

}

class Vehicle{
    Temperature temperature;
    Vehicle(Temperature temperature){
        this.temperature = temperature;
    }

}

public class EnumTest {
    public static void main(String[] args) {


        Vehicle vehicle = new Vehicle(Temperature.LOW);

        Temperature temperature = Temperature.MEDIUM;


        switch(temperature) {

            case LOW:
                System.out.println("low");
                break;
            case MEDIUM:
                System.out.println("MEDIUM");
                break;
            case HIGH:
                System.out.println("HIGH");
                break;
            case CRITICAL:
                System.out.println("CRITICAL");
                break;
            default:
                System.out.println("low");
                break;
        }

        System.out.println(" val is "+Temperature.LOW.getValue());
        System.out.println("enum " +Temperature.LOW);

        for(Temperature temp : Temperature.values()){
            System.out.println(temp.getValue());
        }
        int value = 10;


        if(Temperature.safeRange.contains(Temperature.MEDIUM)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }


    }
}
