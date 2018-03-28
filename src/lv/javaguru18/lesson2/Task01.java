package lv.javaguru18.lesson2;

import java.util.Scanner;

/**
 * Created by Vix on 2/16/2018.
 * Uzrakstiet konsoles programmu, kura pieprasa lietotājam ievadīt veselu skaitli:
 * Ja skaitlis ir mazāks par 0 - izvadiet paziņojumu: “Skaitlis ir negativs”
 * Ja skaitlis ir vienāds ar 0 - izvadiet paziņojumu: “Skaitlis ir nulle”
 * Ja skaitlis ir lielāks par 0 - izvadiet paziņojumu: “Skaitlis ir pozitivs”
 */
public class Task01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet veselu skaitli!");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Skaitlis ir negativs.");
        } else if (number == 0) {
            System.out.println("Skaitlis ir nulle.");
        } else {
            System.out.println("Skaitlis ir pozitivs.");
        }

    }
}

