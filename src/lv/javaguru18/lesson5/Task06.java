package lv.javaguru18.lesson5;

import java.util.Random;

/** Uzrakstīt konsole programmu, kurā
Izveidot veselo skaitļu masīvu, kura lielums ir 10 elementi.
Aizpildīt masīvu ar nejauši izvelētiem skaitļiem.
Izvadīt masīvu konsolē.
Sakārtot masīvu izmantojot Burbuļa kārtošanas algortimu.
Uzziņas materiāli par algoritmu ir šeit un šeit
Izvadīt sakārtoto masīvu konsolē.

*/

public class Task06 {
    public static void main(String[] args) {
        int length = 10;

        System.out.println("Random array: ");
        int[] arr = createRandomArray(length);

        bubbleSort(arr);
        System.out.println("Sorted array: ");
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

    private static int[] bubbleSort(int[] array) {
        int arrayLength = array.length;
        while (arrayLength!=0) {
            int unsortedLength = 0;
            for (int i = 1; i < arrayLength; i++ ){
                if (array[i - 1] > array[i]) {
                    int tmp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = tmp;
                    unsortedLength = i;
                }
            }
            arrayLength = unsortedLength;
        }
        return array;
    }

}
