package lv.javaguru18.lesson5;

import java.util.Random;

/**
 * Created by Vix on 3/1/2018.
 * Uzrakastiet kosnoles programmu, kas izveido veselo skaitļu masīvu un
 var saturēt 10 elementus. Aizpildīt masīvu ar nejaušiem cipariem un izvadīt
 to konsolē.
 */
public class Task01 {
    public static void main(String[] args) {
        createRandomArray(10);
    }

    private static void createRandomArray(int length) {
        Random randomGenerator = new Random();
        int[] arr = new int[length];
        for(int i=0; i<arr.length; i++) {
            arr[i] = randomGenerator.nextInt(100);
            System.out.println(i+": "+arr[i]);
        }
    }
}
