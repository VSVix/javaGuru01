package lv.javaguru18.lesson1;

import java.util.Random;
import java.util.Scanner;
import static java.lang.StrictMath.sqrt;

/**
 * Created by Vix on 2/5/2018.
 */
public class HomeWork {
    public static void main(String[] args) {
        task03();
        task04();
        task05();
        task06();
        task07();
        task08();
        task09();
    }

    private static void task09() {
//        Uzrakstīt konsoles programmu, kas ģenerē 3 nejaušus skaitļus no 0 līdz 100, izvada tos konsolē un aprēķina un izvada to summu.
        System.out.println("- 9. Uzdevums -");
        Random randomGenerator = new Random();
        int randomNumber1 = randomGenerator.nextInt(100);
        int randomNumber2 = randomGenerator.nextInt(100);
        int randomNumber3 = randomGenerator.nextInt(100);
        int summ = randomNumber1+randomNumber2+randomNumber3;
        System.out.println("Three random numbers: "+randomNumber1+"; "+randomNumber2+"; "+randomNumber3);
        System.out.println("Summ of random numbers: "+summ);
    }

    private static void task08() {
//        Uzrakstīt konsoles programmu, kas izskaitļo kvadrātvienādojuma saknes pie nosacījuma, ka D(diskriminants) lielāks vienāds ar nulli.
//        Saknes izskaitļošanai, programmai ir jāļauj lietotājam ievadīt trīs skaitļus: a, b, c.
//        Gadījumā, ja:
//          D>=0 tad izrēķināt saknes uz izvadīt tās konsolē.
//          D<0 tad konsolē izvadīt tekstu “Saknes nav”.
        System.out.println("- 8. Uzdevums -");
        Scanner scanner = new Scanner(System.in );
        System.out.println("Input a of Quadratic equation:");
        int a = scanner.nextInt();
        System.out.println("Input b of Quadratic equation:");
        int b = scanner.nextInt();
        System.out.println("Input c of Quadratic equation:");
        int c = scanner.nextInt();
        int discriminant = b*b-4*a*c;
        if (discriminant >= 0) {
            double root1 = (-b+sqrt(discriminant))/(2*a);
            double root2 = (-b-sqrt(discriminant))/(2*a);
            System.out.println("The roots of Quadratic equation are: "+root1+" and "+root2);
        } else {
            System.out.println("There are no real roots of Quadratic equation");
        }
    }

    private static void task07() {
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
        int discriminant = b*b-4*a*c;
        System.out.println("The Quadratic equation discriminant is: "+discriminant);
    }

    private static void task06() {
//        Uzrakstīt konsoles programmu, kas lietotājam ļauj ievadīt veselu skaitli, kāpina to otrajā pakāpe un izvada rezultātu konsolē.
        System.out.println("- 6. Uzdevums -");
        Scanner scanner = new Scanner(System.in );
        System.out.println("Input natural number:");
        int inputNumber = scanner.nextInt();
        int powerOfTwo = inputNumber*inputNumber;
        System.out.println("The square of "+inputNumber+" is: "+powerOfTwo);
    }

    private static void task05() {
//        Uzrakstīt konsoles programmu, kura prasa lietotājam ievadīt divus skaitļus, saskaita tos un izvada rezultātu konsolē.
        System.out.println("- 5. Uzdevums -");
        Scanner scanner = new Scanner(System.in );
        System.out.println("Input first natural number!");
        int inNum1 = scanner.nextInt();
        System.out.println("Input second natural number!");
        int inNum2 = scanner.nextInt();
        int sum = inNum1+inNum2;
        System.out.println("Sum of two inputted numbers is: "+sum);
    }

    private static void task04() {
//        Uzrakstīt konsoles programmu, kura prasa lietotājam ievadīt skaitli un izvada to konsolē.
        System.out.println("- 4. Uzdevums -");
        Scanner scanner = new Scanner(System.in );
        System.out.println("Input natural number!");
        int output = scanner.nextInt();
        System.out.println("Inputted natural number is: "+output);
    }

    private static void task03() {
//        Uzrakstīt programmu, kura konsolē izvada tekstu “Hello world!”.
        System.out.println("- 3. Uzdevums -");
        System.out.println("Hello world!");
    }
}
