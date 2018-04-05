package lv.javaguru18.lesson8.shapes;

public class Triangle extends Shape implements Edgable {
    private static final int CORNER_COUNT = 3;

    private final double sideA, sideB, sideC;
    public Triangle (double sideA, double  sideB, double  sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public int cornerCount() {
        return CORNER_COUNT;
    }

    @Override
    public double calculateP() {
        return sideA+sideB+sideC;
    }

    @Override
    public double calculateArea() {
        double halfP = calculateP()/2;

        return Math.round(Math.sqrt( halfP * (halfP - sideA) * (halfP - sideB) * (halfP - sideC)));
    }



}
