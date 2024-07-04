package programs.casting;

public class CastingTest {
    public static void main(String[] args) {

        //upcasting
        ParentClass p = new ChildClass();
        System.out.println(" "+p.getClass());

        //downcasting
        ChildClass c = (ChildClass) p;
        System.out.println(" "+c.getClass());
    }
}

class ParentClass{

}

class ChildClass extends ParentClass{

}