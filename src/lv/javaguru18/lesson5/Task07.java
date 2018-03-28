package lv.javaguru18.lesson5;

import java.util.Random;

/** Uzrakstīt konsole programmu, kurā
 Izveidot veselo skaitļu masīvu, kura lielums ir 10 elementi.
 Aizpildīt masīvu ar nejauši izvelētiem skaitļiem.
 Izvadīt masīvu konsolē.
 Sakārtot masīvu izmantojot ātrās kārtošanas algortimu.
 Uzziņas materiāli par algoritmu ir šeit un šeit
 Izvadīt sakārtoto masīvu konsolē.

 */

public class Task07 {
    public static void main(String[] args) {
        int length = 10;

        System.out.println("Random array: ");
        int[] arr = createRandomArray(length);

        quicksort(arr,0,arr.length-1);

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

    private static int[] quicksort(int[] array, int left, int right) {
        int pivot, leftIdx = left, rightIdx = right;
        if (right - left > 0) {
            pivot = (left + right) / 2;
            while ((leftIdx <= pivot) && (rightIdx >=pivot)){
                while ((array[leftIdx] < array[pivot]) && (leftIdx <= pivot)){
                    leftIdx = leftIdx + 1;
                }
                while ((array[rightIdx] > array[pivot]) && (rightIdx >=pivot) ){
                    rightIdx = rightIdx - 1;
                }
                int tmp = array[leftIdx];
                array[leftIdx] = array[rightIdx];
                array[rightIdx] = tmp;
                leftIdx = leftIdx + 1;
                rightIdx = rightIdx - 1;
                if (leftIdx - 1 == pivot) {
                    pivot = rightIdx = rightIdx + 1;
                }
                else if (rightIdx + 1 == pivot) {
                    pivot = leftIdx = leftIdx - 1;
                }
            }
            quicksort(array, left, pivot - 1);
            quicksort(array, pivot + 1, right);
        }
        return array;
    }

}
