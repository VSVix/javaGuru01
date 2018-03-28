package lv.javaguru18.lesson1;//package java.javaguru1;
import java.util.Scanner;

/**
 * Created by java1 on 2/1/2018.
 */

public class TriangleAreaCalc {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in );
//        System.out.println("Input Triangle Height:");
//        double height = scanner.nextDouble();
//        System.out.println("Input Triangle Width:");
//        double width = scanner.nextDouble();
//        //int width, height, area;
        double height = requestInput("height");
        double width = requestInput("width");
        double area = calcuateArea(height, width);
        System.out.println("Triangle Area is: "+area);

    }

    public static double calcuateArea(double height, double width) {
        double area = width * height / 2;
        return area;

    }

    public static double requestInput(String input){
        Scanner scanner = new Scanner(System.in );
        System.out.println("Input Triangle "+input+":");
        double output = scanner.nextDouble();
        return output;

    }
}
