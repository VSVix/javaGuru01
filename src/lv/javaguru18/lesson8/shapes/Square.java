package lv.javaguru18.lesson8.shapes;

public class Square extends Shape implements Edgable {
    private static final int CORNER_COUNT = 4;

    private final double sideA;
    public Square (double sideA) {this.sideA = sideA;}

    @Override
    public int cornerCount() {
        return CORNER_COUNT;
    }

    @Override
    public double calculateP() {
        return sideA*CORNER_COUNT;
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideA,2);
    }

}
