package lv.javaguru18.lesson3;

import java.util.Scanner;

/**
 * Created by Vix on 2/17/2018.
 * Uzrakstīt konsoles programmu, kas pieprasa lietotājam ievadīt divus veselus skaitļus.
 * Ja pirmais skaitlis ir mazāks par otro, tad izmantojot ciklu “for”, programma summējot
 * skaitļus no pirmā skaitļa līdz otram konsolē izvada šo skaitļu summu.
 * Atrisināt šo uzdevumu divos veidos:
 * 1. Izmantojot ciklu
 * 2. ...
 */
public class Task04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet veselu skaitli A!");
        int numA = scanner.nextInt();
        System.out.println("Ievadiet veselu skaitli B!");
        int numB = scanner.nextInt();

        CycleSum(numA, numB);
        EquationSum(numA, numB);
    }

    private static void EquationSum(int numA, int numB) {
        int sum2 = (numA+numB)*(numB-numA+1)/2;
        System.out.println(sum2);
    }

    private static void CycleSum(int numA, int numB) {
        int sum = 0;
        if (numA < numB) {
            for (int i = numA; i <= numB; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
