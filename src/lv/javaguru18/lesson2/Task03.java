package lv.javaguru18.lesson2;

import java.util.Scanner;

/**
 * Created by Vix on 2/16/2018.
 * Uzrakstiet konsoles programmu, kura pieprasa lietotājam
 * ievadīt trīs dažādus veselus skaitļus un izvada konsolē lielāko no tiem.
 * Ja skaitļi ir vienādi, tad konsolē izvada tekstu "A == B == С".
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet trīs dažādus veselus skaitļus!");
        System.out.println("Ievadiet veselu skaitli A!");
        int numA = scanner.nextInt();
        System.out.println("Ievadiet veselu skaitli B!");
        int numB = scanner.nextInt();
        System.out.println("Ievadiet veselu skaitli C!");
        int numC = scanner.nextInt();

        if (numA == numB && numA == numC) {
            System.out.println("A == B == C");
        } else if ((numA >= numB)&&(numA >= numC)) {
            System.out.println("Lielakais skaitlis ir A: "+numA);
        } else if ((numB >= numA)&&(numB >= numC)){
            System.out.println("Lielakais skaitlis ir B: "+numB);
        } else {
            System.out.println("Lielakais skaitlis ir C: "+numC);
        }

    }
}
