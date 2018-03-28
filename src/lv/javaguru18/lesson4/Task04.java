package lv.javaguru18.lesson4;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Vix on 2/28/2018.
 * 1. Lietotājs izvēlās skaitli no 1 līdz 100.
 * 2. Programma izvada skaitli. Lietotājs atbild, vai skaitlis ir lielāks, mazāks vai vienāds ar izvēlēto.
 * 3. Ja skaitlis nav uzminēts, pārejiet pie soļa 2.

 * Iespējamas realizācijas:
 * 1. Programma mēģina izmantot minimālo gājienu skaitu.
 * 2. Programma izvēlas skaitļus nejauši.

 * Jebkurā gadījumā var pieņemt, ka lietotājs nemelo, t.i. ja lietotājs uz skaitli
 * 50 atbildēja, ka izvēlētais skaitlis ir lielāks, programmai nevajadzētu
 * pārbaudīt skaitļus mazākus par 51.
 */
public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Izvelaties speles veidu: \n" +
                " 1 - Programma mēģina izmantot minimālo gājienu skaitu.  \n" +
                " 2 - Programma izvēlas skaitļus nejauši. \n = ");
        int gameType = scanner.nextInt();
        if (gameType == 1) firstGameType();
            else secondGameType();

    }

    private static void firstGameType() {
        Scanner scanner = new Scanner(System.in);
        String userNumber;
        int currentNumber, leftBoundary = 1, rightBoundary = 100;
        do {
            currentNumber = (leftBoundary + rightBoundary) / 2;
            System.out.println("Vai iedomatais skaitlis ir '>' , '<' vai '=' ar "+currentNumber+" ?");
            userNumber = scanner.next();
            switch (userNumber.charAt(0)){
                case '<' : rightBoundary = currentNumber - 1; break;
                case '>' : leftBoundary = currentNumber + 1; break;
                case '=' : System.out.println("Skaitlis uzminets! "+currentNumber); break;
                default: System.out.println("Nepareiza atbilde! \nIevadiet: '>' vai '<' vai '=' ");
            }
            if (leftBoundary > rightBoundary) System.out.println("Iedomatais skaitlis neeksiste robezas 1 - 100!!");
        } while ((userNumber.charAt(0) != '=')&&(leftBoundary <= rightBoundary));
    }

    private static void secondGameType() {
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();
        int randomNumber, leftBoundary = 1, rightBoundary = 100;
        String userNumber;
        do {
            randomNumber = randomGenerator.nextInt(rightBoundary - leftBoundary + 1) + leftBoundary;
            System.out.println("Vai iedomatais skaitlis ir '>' , '<' vai '=' ar "+randomNumber+" ?");
            userNumber = scanner.next();
            switch (userNumber.charAt(0)){
                case '<' : rightBoundary = randomNumber - 1; break;
                case '>' : leftBoundary = randomNumber + 1; break;
                case '=' : System.out.println("Skaitlis uzminets! "+randomNumber); break;
                default: System.out.println("Nepareiza atbilde! \nIevadiet: '>' vai '<' vai '=' ");
            }
            if (leftBoundary > rightBoundary) System.out.println("Iedomatais skaitlis neeksiste robezas 1 - 100!!");
        } while ((userNumber.charAt(0) != '=')&&(leftBoundary <= rightBoundary));

    }
}
