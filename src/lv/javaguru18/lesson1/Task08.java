package lv.javaguru18.lesson1;

import java.util.Scanner;
import static java.lang.StrictMath.sqrt;

/**
 * Created by Vix on 2/5/2018.
 */
public class Task08 {
    public static void main(String[] args) {
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
        int discriminant = getDiscriminant(a, b, c);
        if (discriminant >= 0) {
            double root1 = (-b+sqrt(discriminant))/(2*a);
            double root2 = (-b-sqrt(discriminant))/(2*a);
            System.out.println("The roots of Quadratic equation are: "+root1+" and "+root2);
        } else {
            System.out.println("There are no real roots of Quadratic equation");
        }
    }

    private static int getDiscriminant(int a, int b, int c) {
        return b*b-4*a*c;
    }
}
