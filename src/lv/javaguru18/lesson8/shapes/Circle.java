package lv.javaguru18.lesson8.shapes;

public class Circle extends Shape implements Roundable{

    private final double radiuss;
    public Circle (double radiuss) {this.radiuss = radiuss;}

    @Override
    public double radius() {
        return radiuss;
    }

    @Override
    public double calculateP() {
        return Math.round(2*Math.PI*radiuss);
    }

    @Override
    public double calculateArea() {
        return Math.round(Math.PI*Math.pow(radiuss,2));
    }

}
