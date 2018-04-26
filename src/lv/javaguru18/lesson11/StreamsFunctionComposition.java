package lv.javaguru18.lesson11;

import java.util.Arrays;
import java.util.List;

public class StreamsFunctionComposition {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int result = 0;
        for (int number : numbers ) {
            if (number % 2 == 0){
                result += number * 2;
            }
        }
        System.out.println(result);

        result = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(num -> num * 2)
                .sum();

        result = numbers.stream()
//                .filter(num -> isEven(num))
                .filter(StreamsFunctionComposition::isEven) // jo static metode, un nav objekts, tad varetu this:isEven
//                .mapToInt(num -> doubleIt(num))
                .mapToInt(StreamsFunctionComposition::doubleIt)
                .sum();


        System.out.println(result);

    }

    private static int doubleIt(Integer num) {
        return num * 2;
    }

    private static boolean isEven(Integer num) {
        return num % 2 == 0;
    }
}
