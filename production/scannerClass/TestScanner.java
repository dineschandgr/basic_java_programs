package out.production.scannerClass;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        int num = scanner.nextInt();
        System.out.println("output: "+ TimeConvert(num));
        scanner.close();
    }

    public static String TimeConvert(int num){
        int hours = num / 60;
        int minutes = num % 60;
        return hours+":"+minutes;
    }
}
