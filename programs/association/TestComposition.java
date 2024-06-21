package out.production.association;

import java.util.List;

public class TestComposition{

    public static void main(String[] args) {

        Car c = new Car("Audi", " red");
    }
}

class Car{
    private String name;
    private String colour;

    //it can be referred as Has-A or Part-Of
    private Engine engine;
    private Wheel wheel;

    public Car(String name, String colour) {

        this.name = name;
        this.colour = colour;
        this.engine = new Engine();
        this.wheel = new Wheel();
    }

}


class Engine{
    private String name;
    private int cylinder;

}

class Wheel{
    private String name;
    private int size;

}

