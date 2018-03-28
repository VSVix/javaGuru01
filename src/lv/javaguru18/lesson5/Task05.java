package lv.javaguru18.lesson5;

import java.util.Random;

/**
 * Created by Vix on 3/14/2018.
 * Izveidot veselo skaitļu masīvu, kura lielums ir 10 elementi.
 Aizpildīt masīvu ar nejauši izvelētiem skaitļiem.
 Izvadīt masīvu konsolē.
 Atrast lielāko skaitli masīvā
 Samainīt vietām atrasto lielāko skaitli ar masīva pirmo elementu.
 Izvadīt masīvu konsolē.
 */
public class Task05 {
    public static void main(String[] args) {
        int length = 10;
        int[] arr = createRandomArray(length);

        int maxNum = arr[0], pos = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
                pos = i;
            }
        }

        int firstNum = arr[0];
        arr[0] = maxNum;
        arr[pos] = firstNum;

        System.out.println("Highest number is: "+maxNum);
        printArray(arr);
    }

    private static int[] createRandomArray(int length) {
        Random randomGenerator = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomGenerator.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        return arr;
    }
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
