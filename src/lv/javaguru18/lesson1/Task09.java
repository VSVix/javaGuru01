package lv.javaguru18.lesson1;

import java.util.Random;

/**
 * Created by Vix on 2/5/2018.
 */
public class Task09 {
    public static void main(String[] args) {
//        Uzrakstīt konsoles programmu, kas ģenerē 3 nejaušus skaitļus no 0 līdz 100, izvada tos konsolē un aprēķina un izvada to summu.
        System.out.println("- 9. Uzdevums -");
        Random randomGenerator = new Random();
        int randomNumber1 = randomGenerator.nextInt(100);
        int randomNumber2 = randomGenerator.nextInt(100);
        int randomNumber3 = randomGenerator.nextInt(100);
        int sum = randomNumber1+randomNumber2+randomNumber3;
        System.out.println("Three random numbers: "+randomNumber1+"; "+randomNumber2+"; "+randomNumber3+";");
        System.out.println("Sum of random numbers: "+randomNumber1+"+"+randomNumber2+"+"+randomNumber3+" = "+sum);
    }
}
