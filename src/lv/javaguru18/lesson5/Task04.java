package lv.javaguru18.lesson5;

import java.util.Random;

/**
 * Created by Vix on 3/14/2018.
 * Izveidot veselo skaitļu masīvu, kura lielums ir 10 elementi.
 * Aizpildīt masīvu ar nejauši izvelētiem skaitļiem.
 * Izvadīt masīvu konsolē.
 * Atrast masīvā lielāko skaitli un izvadīt to konsolē.
 */
public class Task04 {
    public static void main(String[] args) {
        int length = 10;
        int[] arr = new int[length];
        arr = createRandomArray(length);

        System.out.println("Highest number is: "+findMaxNum(arr));
    }

    private static int findMaxNum(int[] arr) {
        int maxNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNum) maxNum = arr[i];
        }
        return maxNum;
    }

    private static int[] createRandomArray(int length) {
        Random randomGenerator = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomGenerator.nextInt(100);
            System.out.println(i + ": " + arr[i]);
        }
        return arr;
    }

}

