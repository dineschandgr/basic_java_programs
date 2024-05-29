package out.production.generics;


import java.util.ArrayList;
import java.util.List;

class PairClass {
    private Object first;
    private Object second;

    public PairClass(Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    Object getFirst() {
        return this.first;
    }

    Object getSecond() {
        return this.second;
    }

     static PairClass findMinMax(int[] array) {
         int min = Integer.MAX_VALUE;  // stores the min
         int max = Integer.MIN_VALUE;  // stores the max
         for (int i : array) {
             if (i < min)  {
                 min = i;
             }
             if (i > max) {
                 max = i;
             }
         }
         return new PairClass(min, max);
     }

    public  double sum(List<? extends Number>  list)
    {
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }

        return sum;
    }
}

public class PairTest{

    public static void main(String[] args) {

        PairClass p =PairClass.findMinMax(new int[]{10,20});

        List<Integer> list = List.of(10,20);
        List<Double> list1 = List.of(10.5,10.1);
        p.sum(list1);

    }
}