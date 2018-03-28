package lv.javaguru18.lesson4;

import java.util.Scanner;

/**
 * Created by Vix on 2/17/2018.
 * Uzrakstīt konsoles programmu, kas pieprasa lietotājam ievadīt divus skaitļus.
 * Ja pirmais skaitlis ir mazāks par otro, tad izmantojot ciklu “while”, programm konsolē
 * izvada skatļus no pirmā ievadītā skaitļa līdz otram.
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet veselu skaitli A!");
        int firstNumber = scanner.nextInt();
        System.out.println("Ievadiet veselu skaitli B!");
        int secondNumber = scanner.nextInt();
        int i = firstNumber;
        if (firstNumber < secondNumber) {
            while ( i <= secondNumber) {
                System.out.println(i);
                i++;
            }
        }
    }
}
