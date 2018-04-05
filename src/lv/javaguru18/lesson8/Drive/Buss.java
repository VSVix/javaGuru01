package lv.javaguru18.lesson8.Drive;

public class Buss extends Car {
    public Buss(int wheelCount) {
        super(wheelCount);
    }

    @Override
    public void beep() {
        System.out.println("Buss Beep-Beeps!");
    }

    @Override
    public void turnRight() {
        System.out.println("Buss Turning Right!!");
    }

    @Override
    public void turnLeft() {
        System.out.println("Buss Turning Left!!");
    }
}
