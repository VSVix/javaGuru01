package lv.javaguru18.lesson8.shapes;

import com.sun.org.apache.xerces.internal.xs.ShortList;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(4,5,7);
        Square square = new Square(5);
        Circle circle = new Circle(6);
//        triangle.printMe();
//        square.printMe();
//        circle.printMe();

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(triangle);
        shapeList.add(square);
        shapeList.add(circle);

        System.out.println("\nLambda print-");
        shapeList.stream().forEach(shape -> shape.printMe());

        System.out.println("\nLambda print-");
        shapeList.stream().forEach(Shape::printMe);

        System.out.println("\nPrinting FOR long-");
        for (int i=0; i<shapeList.size(); i++){
            shapeList.get(i).printMe();
        }

        System.out.println("\nPrinting FOR each-");
        for (Shape shape : shapeList){
            shape.printMe();
        }

        try {
            System.out.println(" Line 1 ");
            printCornersCount(shapeList);
            System.out.println(" Line 2 ");
        } catch (ClassCastException ex){
            throw new WrongShape("This shape is without corners!", ex);
        } finally {
            System.out.println("Always will be executed.");
        }

    }

    private static void printCornersCount(List<Shape> shapeList) {
        for (Shape shape : shapeList){
            System.out.println(
                    "My corner count is: "+
                            ((Edgable)shape).cornerCount()
            );
        }
    }

}
