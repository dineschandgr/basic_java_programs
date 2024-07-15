package programs.nested.classes;

class Nested{

        public static int a = 10;

        //static class
        public static class Nested1{
            public void print(){
                System.out.println("print nested");
            }
        }

        public class InnerClass{

            public void inner(){
                System.out.println("test inner");
                test1();
            }

        }

        public void test1(){
            System.out.println("test public method");
        }


        }

public class TestNested {

    static{
        System.out.println("heee");
    }

    public static void main(String[] args) {

        Nested.Nested1 obj = new Nested.Nested1();
        obj.print();
        System.out.println(Nested.a);

        Nested.InnerClass inner = new Nested().new InnerClass();
        inner.inner();

        Nested nested = new Nested();
        nested.test1();

    }
}
