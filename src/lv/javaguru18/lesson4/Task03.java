package lv.javaguru18.lesson4;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Vix on 2/17/2018.
 * 1. Programma pati izvēlas vienu skaitli no 1 līdz 100
 * 2. Lietotājs ievada skaitli. Programma atbild vai ievadītais skaitlis bija lielāks, mazāks vai vienāds ar tās izvēlēto skaitli.
 * 3. Ja skaitlis nav atminēts, tad pārejam pie soļa #2.
 */
public class Task03 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = randomGenerator.nextInt(100);
        int userNumber;
        do {
            System.out.println("Ievadiet veselu skaitli: ");
            userNumber = scanner.nextInt();
            if (randomNumber < userNumber)
                System.out.println("Ievaditais skaitlis ir par lielu!");
            else if (randomNumber > userNumber)
                System.out.println("Ievaditais skaitlis ir par mazu!");
            else
                System.out.println("Skaitlis uzminets! "+randomNumber);
        } while (randomNumber != userNumber);
    }
}
