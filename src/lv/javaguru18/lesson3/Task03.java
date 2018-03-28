package lv.javaguru18.lesson3;

import java.util.Scanner;

/**
 * Created by Vix on 2/17/2018.
 * Uzrakstīt konsoles programmu, kas pieprasa lietotājam ievadīt divus veselus skaitļus.
 * Ja pirmais skaitlis ir mazāks par otro, tad izmantojot ciklu “for”, programma konsolē
 * izvada pāra skatļus no pirmā ievadītā skaitļa līdz otram (ieskaitot).
 */
public class Task03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet veselu skaitli A!");
        int numA = scanner.nextInt();
        System.out.println("Ievadiet veselu skaitli B!");
        int numB = scanner.nextInt();

        if (numA < numB) {
            for (int i = numA; i <= numB; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }

}
