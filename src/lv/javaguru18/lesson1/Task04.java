package lv.javaguru18.lesson1;

import java.util.Scanner;

/**
 * Created by Vix on 2/5/2018.
 */
public class Task04 {
    public static void main(String[] args) {
        //        Uzrakstīt konsoles programmu, kura prasa lietotājam ievadīt skaitli un izvada to konsolē.
        System.out.println("- 4. Uzdevums -");
        Scanner scanner = new Scanner(System.in );
        System.out.println("Input natural number!");
        int output = scanner.nextInt();
        System.out.println("Inputted natural number is: "+output);
    }
}
