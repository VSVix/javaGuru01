package lv.javaguru18.lesson1;

import java.util.Scanner;

/**
 * Created by Vix on 2/5/2018.
 */
public class Task07 {
    public static void main(String[] args) {
//        Uzrakstīt konsoles programmu, kas izrēķina kvadrātvienādojuma diskriminantu un izvada to konsolē.
//        Saknes izskaitļošanai, programmai ir jāļauj lietotājam ievadīt trīs skaitļus: a, b, c.
        System.out.println("- 7. Uzdevums -");
        Scanner scanner = new Scanner(System.in );
        System.out.println("Input a of Quadratic equation:");
        int a = scanner.nextInt();
        System.out.println("Input b of Quadratic equation:");
        int b = scanner.nextInt();
        System.out.println("Input c of Quadratic equation:");
        int c = scanner.nextInt();
        int discriminant = getDiscriminant(a, b, c);
        System.out.println("The Quadratic equation discriminant is: "+discriminant);
    }

    private static int getDiscriminant(int a, int b, int c) {
        return b*b-4*a*c;
    }
}
