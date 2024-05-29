package out.production.scannerClass;

public class BitWiseTwo {

    public static String BitwiseTwo(String[] strArr) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < strArr[0].length(); i++) {

            if (strArr[0].charAt(i) == '1' && strArr[1].charAt(i) == '1') {
                result.append("1");
            } else {
                result.append("0");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String[] A = {"10111", "01101"};
        String[] B = {"10100", "11100"};
        System.out.println(BitwiseTwo(A));
        System.out.println(BitwiseTwo(B));
    }
}
     /*   string A[] = { "10111", "01101" };
        string B[] = { "10100", "11100" };
        cout << BitwiseTwo(A) << endl; // 00101
        cout << BitwiseTwo(A) << endl; // 10100
        return 0;*/