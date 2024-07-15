package programs.nested.classes;

interface Eatable{
    void eat();
}

 class test implements  Eatable{

    @Override
    public void eat() {
        System.out.println("eat");
    }
}

public class AnonymousInnerClass {

    public static void main(String args[]) {

        Eatable t = new test();
        t.eat();

        //Anonymous Inner Class
        Eatable e = new Eatable() {
            public void eat() {
                System.out.println("nice fruits");
            }
        };
        e.eat();
    }
}
