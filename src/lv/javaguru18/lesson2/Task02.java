package lv.javaguru18.lesson2;

import java.util.Scanner;

/**
 * Created by Vix on 2/16/2018.
 * Uzrakstiet konsoles programmu,
 * kura pieprasa lietotājam ievadīt divus veselus skaitļus un izvada konsolē lielāko no tiem.
 * Ja skaitļi ir vienādi, tad konsolē izvada tekstu "A == B".
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet veselu skaitli A!");
        int numA = scanner.nextInt();
        System.out.println("Ievadiet veselu skaitli B!");
        int numB = scanner.nextInt();

        if (numA == numB) {
            System.out.println("A == B");
        } else if (numA > numB) {
            System.out.println("Lielakais skaitlis ir A: "+numA);
        } else {
            System.out.println("Lielakais skaitlis ir B: "+numB);
        }
    }
}
