package programs.methods;

public class MethodTest {

    static int a = 20;

    public static void main(String[] args) {

        int a = 10;
        int b = 10;
        double d = 10.5;

       int sum = add(a,b);
        System.out.println(add(a,b));
        System.out.println(add(d,b));


    }

    public static int add(int a , int b){
        return a + b;
    }

    public static float add(int a , float b){
        return a + b;
    }

    public static int add(int c, int d, int e){
        return c + d + e;
    }

    public static double add(double d, int a){
       //return c;

       return d + a;
    }
}
