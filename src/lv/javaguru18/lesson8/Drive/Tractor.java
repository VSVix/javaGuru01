package lv.javaguru18.lesson8.Drive;

public class Tractor extends Car {

    public Tractor(int wheelCount){
        super(wheelCount);
    }

    @Override
    public void turnRight() {
        System.out.println("Tractor Turning Right!!");
    }

    @Override
    public void turnLeft() {
        System.out.println("Tractor Turning Left!!");
    }
}
