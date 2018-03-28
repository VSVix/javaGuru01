package lv.javaguru18.lesson5;

import java.util.Random;

/**
 * Created by Vix on 3/1/2018.
 * Uzrakstīt konsole programmu, kurā
 1. Izveidot veselo skaitļu masīvu, kura lielums ir 10 elementi.
 2. Aizpildīt masīvu ar nejauši izvelētiem skaitļiem.
 3. Izvadīt masīvu konsolē.
 4. Saskaitīt masīva elementu skaitļu summu.
 */
public class Task02 {
    public static void main(String[] args) {
        createRandomArray(10);
    }

    private static void createRandomArray(int length) {
        Random randomGenerator = new Random();
        int sum = 0;
        int[] arr = new int[length];
        for(int i=0; i<arr.length; i++) {
            arr[i] = randomGenerator.nextInt(100);
            sum += arr[i];
            System.out.println(i+": "+arr[i]);
        }
        System.out.println("Summa="+sum);
    }
}
