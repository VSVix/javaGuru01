package lv.javaguru18.lesson1;

import java.util.Scanner;

/**
 * Created by Vix on 2/5/2018.
 */
public class Task06 {
    public static void main(String[] args) {
//        Uzrakstīt konsoles programmu, kas lietotājam ļauj ievadīt veselu skaitli, kāpina to otrajā pakāpe un izvada rezultātu konsolē.
        System.out.println("- 6. Uzdevums -");
        Scanner scanner = new Scanner(System.in );
        System.out.println("Input natural number:");
        int inputNumber = scanner.nextInt();
        int powerOfTwo = powOfTwo(inputNumber);
        System.out.println("The square of "+inputNumber+" is: "+powerOfTwo);
    }

    private static int powOfTwo(int inputNumber) {
        return inputNumber*inputNumber;
    }
}
