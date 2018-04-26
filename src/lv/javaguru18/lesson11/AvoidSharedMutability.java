package lv.javaguru18.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AvoidSharedMutability {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// double even numbers and put item into list


        List<Integer> doubleOfEven = new ArrayList<>();

        // WRONG !!!
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * 2)
                .forEach(dNum -> doubleOfEven.add(dNum));
        System.out.println(doubleOfEven);


        numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * 2)
                .collect(Collectors.toList())
//                .forEach(System.out::println);
                .forEach(num -> System.out.print(" "+num+" "));

    }
}
