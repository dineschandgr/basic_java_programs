import java.util.Objects;

public class DataTypes {


    int one;
    int two;
    int three;

    public static void main(String a[]){

      //integer

      //char
    Integer i = 10;
    i.compareTo(20);

       


    }

    static void test(){

    }

    @Override
    public String toString() {
        return "DataTypes{" +
                "one=" + one +
                ", two=" + two +
                ", three=" + three +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DataTypes)) return false;
        DataTypes dataTypes = (DataTypes) o;
        return one == dataTypes.one && two == dataTypes.two && three == dataTypes.three;
    }

    @Override
    public int hashCode() {
        return Objects.hash(one, two, three);
    }
}
