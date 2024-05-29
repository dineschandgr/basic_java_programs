package out.production.scannerClass;

import java.util.ArrayList;
import java.util.List;

public class ArrayRotation {
    public static void main(String[] args) {

        int[] arr = {2,3,4,1,6,10};
        String rotated = arrayRotation(arr, 6);
        System.out.println(rotated);
    }

    public static String arrayRotation(int arr[], int size)
    {
        // our temp list
        List<Integer> list = new ArrayList<>();

        // iterating through the array until all elements have been passed;
        int index = arr[0];
        int count = 0;

        while (count < size)
        {
            // passing the value
            list.add(arr[index]);

            // updating our index
            index = (index%size) + 1;
            if (index == size)
            {
                index = 0;
            }
            count++;
        }

        // converting result into a string
        StringBuilder sb = new StringBuilder();
        for(Integer i : list){
            sb.append(i);
        }

        return sb.toString();
    }


}


