package out.production.collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class VehicleCollection implements Cloneable{

    private int wheel = 0;
    private String colour = "red";

    public VehicleCollection(int wheel, String colour) {
        this.wheel = wheel;
        this.colour = colour;
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

    @Override
    public String toString() {
        return "VehicleCollection{" +
                "wheel=" + wheel +
                ", colour='" + colour + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VehicleCollection)) return false;
        VehicleCollection that = (VehicleCollection) o;
        return wheel == that.wheel && Objects.equals(colour, that.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheel, colour);
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}

    public class ArrayListTest {


        public static void test(List<Integer> arr){

        }

        public static void main(String[] args) throws CloneNotSupportedException {

            ArrayList<Integer> intList1 = new ArrayList<>();

            //integer list

            List<Integer> intList = new ArrayList<>();
            intList.add(10);

            intList.add(20);
            System.out.println(intList);
            intList.add(0,100);
            System.out.println(intList);
            intList.set(0,200);
            System.out.println(intList);

            for(int i = 0; i < intList.size(); i++){
                System.out.println("normal for loop " +intList.get(i));
            }

            for(Integer i : intList){
                System.out.println("for each loop "+i);
            }

            List<Integer> intList3 = Arrays.asList(1,2,3);
            intList.addAll(intList3);

            System.out.println(intList);

            //String list

            ArrayList<String> strList = new ArrayList<>();

            strList.add("hello");
            strList.add("hi");
            strList.add(1,"world");

            System.out.println(strList);

            List<VehicleCollection> vehicleList = new ArrayList<>();

            VehicleCollection v1 = new VehicleCollection(4,"red");
            VehicleCollection v2 = new VehicleCollection(3,"yellow");

            vehicleList.add(v1);
            vehicleList.add(v2);

            System.out.println(vehicleList);

            VehicleCollection v3 = (VehicleCollection) vehicleList.get(0).clone();

            v3.setWheel(10);
            System.out.println(vehicleList);
        }
    }
