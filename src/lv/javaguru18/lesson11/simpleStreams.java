package lv.javaguru18.lesson11;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class simpleStreams {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        for (int i = 0; numbers.size() < i; i++) {
            int number = numbers.get(i);
            System.out.println(number);
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        numbers.forEach(new Consumer<Integer>(){
                    @Override
                    public void accept(Integer value) {
                        System.out.println(value);
                    }
                });

        numbers.forEach((Integer value) -> System.out.println(value));

        numbers.forEach((value) -> System.out.println(value));

        numbers.forEach(value -> System.out.println(value));

        numbers.forEach(System.out::println);



    }

    public static void args(String... args) {

    }

}
