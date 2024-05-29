package out.production.strings;

import java.util.Arrays;

public class StringsTest {

    public static void main(String[] args) {
        String s = new String("Hello");
        String s1 = "Hello";
        String s2 = "Hello";

        //s2.concat("world");
        System.out.println("mem "+(s==s1));
        System.out.println("s equals s1 "+s.equals(s1));

        System.out.println(s1==s2);

        char[] arr = s2.toCharArray();

        System.out.println(Arrays.toString(arr));

        s2 = "Hello";
        String[] arr1 = s2.split("e");
        System.out.println(Arrays.toString(arr1));

        for(String str : arr1){
            System.out.println("foreach "+ str);
        }
        for(char c : s.toCharArray()){
            System.out.println("foreach ch array "+c);
        }

        System.out.println( "equals " +s2.equals("HELLO"));
        System.out.println( "upper " +s2.toUpperCase().equals("HELLO"));
        System.out.println( "ignore case " +s2.equalsIgnoreCase("HELLO"));

    }
}
