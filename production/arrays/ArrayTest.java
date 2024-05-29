package out.production.arrays;

import java.util.Arrays;

public class ArrayTest {

      protected int test;
      public int test1;
      int test2;
      private int test3;

    public static void main(String[] args) {


        int[] arr = new int[5];
        arr[0] = 10;

        int[] arr1 = {10,20,30};

        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }

        System.out.println(Arrays.toString(arr1));

        int[][] arr2 = new int[2][3];

        int[][] arr3 = {
                {1,2,3},
                {4,5,6}
        };

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(arr3[i][j]);
            }
            System.out.println();
        }
    }
}
