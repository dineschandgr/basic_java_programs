package out.production.encapsulation;


class Vehicle{
    private int wheel;
    private String colour;

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
        if(wheel > 4)
            this.colour = colour;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheel=" + wheel +
                ", colour='" + colour + '\'' +
                '}';
    }
}
public class TestEncapsulation {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.setWheel(4);
        v.setColour("red");
        System.out.println(v);
        v.setWheel(5);
        v.setColour("green");

        System.out.println(v);

        //v.getColour();

    }
}
