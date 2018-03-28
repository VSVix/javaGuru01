package lv.javaguru18.lesson1;

import java.util.Scanner;

/**
 * Created by Vix on 2/5/2018.
 */
public class Task05 {
    public static void main(String[] args) {
        //        Uzrakstīt konsoles programmu, kura prasa lietotājam ievadīt divus skaitļus, saskaita tos un izvada rezultātu konsolē.
        System.out.println("- 5. Uzdevums -");
        Scanner scanner = new Scanner(System.in );
        System.out.println("Input first natural number!");
        int inNum1 = scanner.nextInt();
        System.out.println("Input second natural number!");
        int inNum2 = scanner.nextInt();
        int sum = inNum1+inNum2;
        System.out.println("Sum of two inputted numbers is: "+sum);
    }
}
