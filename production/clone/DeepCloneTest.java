package out.production.clone;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DeepType implements Cloneable{

    String typeStr;
    List<Integer> types = new ArrayList<>(100);

    List<Animal> animalList = new ArrayList<>(100);

    DeepType(String typeStr, List<Integer> list, List<Animal> animalList){
        this.typeStr = typeStr;
        this.types.addAll(list);
        this.animalList.addAll(animalList);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        DeepType deep = (DeepType) super.clone();
        deep.types = new ArrayList<>(this.types);
        deep.animalList = new ArrayList<>(this.animalList);
        return deep;
    }

    @Override
    public String toString() {
        return "DeepType{" +
                "typeStr='" + typeStr + '\'' +
                ", types=" + types +
                ", animalList=" + animalList +
                '}';
    }
}

class Animal{

    List<Integer> animalTypeList = new ArrayList<>(100);

    Animal(List<Integer> animalTypeList){
        this.animalTypeList.addAll(animalTypeList);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalTypeList=" + animalTypeList +
                '}';
    }
}

public class DeepCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Animal a1 = new Animal(List.of(1, 2, 3, 4, 5));
        Animal a2 = new Animal(List.of(6,7,8,9,10));

        DeepType t1 = new DeepType("test", List.of(1, 2, 3, 4, 5), List.of(a1,a2));
        DeepType t2 = (DeepType) t1.clone();

        //after clone
        t1.typeStr = "hello";
        t1.types.add(100);

        t1.animalList.add(new Animal(List.of(100,200)));

        System.out.println(" t1 obj " +t1);
        System.out.println(" t2 obj " +t2);
    }
}
