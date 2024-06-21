package out.production.untitled;

import java.util.Arrays;

public class PassByRef {

    public static void main(String[] args) {
        String s = new String("Hello");
        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println("s mem s1 "+s==s1);
        System.out.println("s equals s1 "+s.equals(s1));

        System.out.println(s1==s2);

        //hello
        char[] arr = s2.toCharArray();

        //hello
        char[] ch2 = arr;
        System.out.println("value of arr before "+Arrays.toString(arr));

       // print(arr);


        //zello
        ch2[0] = 'z';


        System.out.println("value of arr after "+Arrays.toString(arr));


        System.out.println( "upper " +s2.toUpperCase().equals("HELLO"));
        System.out.println( "upper " +s2.equalsIgnoreCase("HELLO"));

        int b = 10;
        //autoboxing
        Integer a = 20;



        int c = a + b;
        //unboxing


    }

    public static void print(char[] ch){
        ch[0] = 'Z';

    }
}
