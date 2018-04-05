package lv.javaguru18.lesson8.Drive;

public class LawMower implements Vehicle {
    @Override
    public void turnRight() {
        System.out.println("LawMower Turning Right!!");
    }

    @Override
    public void turnLeft() {
        System.out.println("LawMower Turning Left!!");
    }
}
