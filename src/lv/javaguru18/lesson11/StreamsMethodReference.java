package lv.javaguru18.lesson11;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class StreamsMethodReference {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.forEach(System.out::println);

        int number = 5;

        System.out.println(String.valueOf(number));

        numbers.stream()
                .map(num -> String.valueOf(num))
                .forEach(System.out::println);

        numbers.stream()
                .map(String::valueOf)
                .forEach(System.out::println);

        numbers.stream()
                .map(String::valueOf)
                .map(String::toString)
                .map(String::toLowerCase)
                .forEach(System.out::println);


        System.out.println(
                numbers.stream()
                        .reduce(0, (total, num) -> Integer.sum(total, num))
        );

        System.out.println(
                numbers.stream()
                        .reduce(5, Integer::sum)
        );


        System.out.println(
                numbers.stream()
                        .map(String::valueOf)
                        .reduce("", (carry, str) -> carry.concat(str))
        );

        System.out.println(
                numbers.stream()
                        .map(String::valueOf)
                        .reduce("", String::concat)
        );





    }


}
