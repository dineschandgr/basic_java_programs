package programs.clone;


import java.util.ArrayList;
import java.util.List;

class Type implements Cloneable{

    String typeStr;
    List<Integer> types = new ArrayList<>(100);

    Type(String typeStr, List<Integer> list){
        this.typeStr = typeStr;
        this.types.addAll(list);
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Type{" +
                "typeStr='" + typeStr + '\'' +
                ", types=" + types +
                '}';
    }
}

public class ShallowCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        CloneTest c = new CloneTest(1,"A");
        CloneTest c1 = c;
        c1.id = 5;
        System.out.println("c is "+c);

        Type t1 = new Type("test", List.of(1, 2, 3, 4, 5));

        System.out.println(" before clone t1 obj " +t1);

        Type t2 = (Type) t1.clone();

        //after clone
        t1.typeStr = "hello";
        t1.types.add(100);

        System.out.println(" t1 obj " +t1);
        System.out.println(" t2 obj " +t2);

    }
}

class CloneTest{
    int id;
    String name;

    public CloneTest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "CloneTest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
