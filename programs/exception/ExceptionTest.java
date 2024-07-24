package programs.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

class MyCustomException extends Exception{

    MyCustomException(String message){
        super(message);
    }

}

public class ExceptionTest {
    public static void main(String[] args) {

        System.out.println("after try");

        try {
            int result = testExceptionNotHandled();
        }catch(ArithmeticException e){
            System.out.println("inside catch block of caller testExceptionNotHandled");
           // e.printStackTrace();
        }

        int val = testExceptionHandled();

        System.out.println("val testExceptionHandled "+val);

        testExceptionThrows();

        try {
            fun();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /*public static void checkArray(int[] arr2){

        try {
            //int c = 10 / 0;
            if(arr2.length < 3)
                throw new RuntimeException("3rd value not found");
            System.out.println(arr2[2]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index");
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("General Exception");
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }*/

    public static int testExceptionNotHandled(){

            int d = 10 / 0;
            return 0;
    }

    public static int testExceptionHandled(){

        try {
            int d = 10 / 0;
        }catch(Exception e){
            System.out.println("exception inside testExceptionHandled method");
            e.printStackTrace();
        }finally {
            System.out.println("finally testExceptionHandled");
        }

        return 0;
    }

    public static int testExceptionThrows() throws RuntimeException{


        try {
            if (true)
                throw new MyCustomException("hello");
        }catch(ArithmeticException e){
            System.out.println("inside test exception");
            e.printStackTrace();
        }catch(MyCustomException e){
            System.out.println("inside MyCustomException");
            e.printStackTrace();
            throw new RuntimeException();
        }

        return 0;

    }

    static void fun() throws IllegalAccessException
    {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }


}
