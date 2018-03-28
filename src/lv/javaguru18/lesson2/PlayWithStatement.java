package lv.javaguru18.lesson2;

import java.util.Scanner;

/**
 * Created by Vix on 2/8/2018.
 */
public class PlayWithStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message;
//        IfElseIf();
       int httpCode = 501;

       switch (httpCode) {
           case 200: message = "Ok"; break;
           case 201: message = "Created"; break;
           case 400: message = "Bad Request"; break;
           case 404: message = "Not Found"; break;
           case 500:
           case 501: message = "Server unreachable";
           case 502: message = "Server error"; break;
           default:
               message = "There is no such error.";
       }
        System.out.println(message);


//        switchCase(httpCode);

    }

    private static void switchCase(int input) {

        switch (input) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default");

        }
    }

    private static void IfElseIf() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a natural number:");
        int input = scanner.nextInt();
        input = 8;
        System.out.println(isInInterval(input) ? "GOOD" : "BAD");
//        if (isInInterval(input)) {
//            System.out.println("GOOD");
//        } else {
//            System.out.println("BAD");
//        }

//        boolean isGreen = true;
//
//        if (isGreen)
//            System.out.println("Is green!");
//        else
//            System.out.println("Isn't green!");
//
//        if (isGreen) System.out.println("Is green!");
//
//        System.out.println(
//                isGreen ? "Is green!" : "Isn't green!"
//        );
    }

    private static boolean isInInterval(int input) {
        return input < 5
                || (input > 8 && input < 10)
                || input > 33;
    }
}
