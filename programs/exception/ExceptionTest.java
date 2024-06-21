package programs.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest {
    public static void main(String[] args) {

       int[] arr1 = {10,20,30 };

        checkArray(arr1);

        System.out.println("hi");


        //d if d > 100, print somehting, if d > 1 print something
        //if(d > 100)
        //do somethigng
        //else if (d > 1)

        System.out.println("after try");

        try {
            int result = testException();
            //int a1 = testException1();
        }catch(ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println("end");


        try {
            FileReader reader = new FileReader("");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


       /* if(arr1.length == 2)
            throw new NullPointerException();

        System.out.println("program ended");*/
    }

    public static void checkArray(int[] arr2){

        try {
            //int c = 10 / 0;
            if(arr2.length < 3)
                throw new RuntimeException("3rd value not found");
            System.out.println(arr2[2]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index");
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("General Exception");
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }

    public static int testException() throws ArithmeticException{

        int d = 10 / 0;


        /*try {
            if (true)
                throw new ArithmeticException();
        }catch(ArithmeticException e){
            System.out.println("inside test exception");
            e.printStackTrace();
        }*/

       /* try {
            d = 10 / 0;
        }catch(ArithmeticException e){
            e.printStackTrace();
        }*/
        return 0;
    }

    public static int testException1() throws ArithmeticException{

        int d = 10 / 0;

       /* try {
            d = 10 / 0;
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
*/
        return d;
    }
}
