package production.streams.api;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {


        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);

        // Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);

        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfListofInts =
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

        System.out.println(" listOfListofInts "+ listOfListofInts);

        List<Integer> intList = listOfListofInts.stream().flatMap(list -> list.stream()).collect(Collectors.toList());

       // List<Integer> intList =  stream.collect(Collectors.toList());
        System.out.println("intlist is "+intList);


        //reduce
        List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8);

        // Finding sum of all elements
        int sum = array.stream().reduce(0,
                (element1, element2) -> element1 + element2);


    }
}
