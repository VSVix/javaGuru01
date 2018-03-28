package lv.javaguru18.lesson2;

import java.util.Scanner;

/**
 * Created by Vix on 2/8/2018.
 */
public class VowelChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input one letter: ");
        String character = scanner.next();
        String message = "default";
        char enteredChar = character.toLowerCase().charAt(0);

        switch (enteredChar){
            case 'a' :
            case 'e' :
            case 'i' : break;
            case 'o' :
            case 'u' : message = "Ir Patskanis"; break;
            default: message = " Ir Lidzskanis";
        }
        System.out.println(message);
    }
}
