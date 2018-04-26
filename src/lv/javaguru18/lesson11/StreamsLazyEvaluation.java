package lv.javaguru18.lesson11;

import java.util.Arrays;
import java.util.List;

public class StreamsLazyEvaluation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        int result = 0;
        for (int num : numbers) {
            if (num > 3 && (num % 2 == 0)) {
                result = num * 2;
                break;
            }
        }
        System.out.println(result);

        result = numbers.stream()
                .filter(num -> num > 21)
                .filter(num -> num % 2 == 0)
                .map(num -> num * 2)
                .findFirst()
//                .get(); //will be exception if wont find anything
                .orElse(-1);

        System.out.println(result);

    }
}
