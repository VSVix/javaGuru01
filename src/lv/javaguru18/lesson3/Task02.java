package lv.javaguru18.lesson3;

import java.util.Scanner;

/**
 * Created by Vix on 2/17/2018.
 * Uzrakstīt konsoles programmu, kas pieprasa lietotājam ievadīt divus skaitļus.
 * Ja pirmais skaitlis ir mazāks par otro, tad izmantojot ciklu “for”, programma
 * konsolē izvada skatļus no pirmā ievadītā skaitļa līdz otram.
 */
public class Task02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet veselu skaitli A!");
        int numA = scanner.nextInt();
        System.out.println("Ievadiet veselu skaitli B!");
        int numB = scanner.nextInt();

        if (numA < numB) {
            for (int i = numA; i <= numB; i++) {
                System.out.println(i);
            }
        }

    }
}
