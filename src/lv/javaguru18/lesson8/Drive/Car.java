package lv.javaguru18.lesson8.Drive;
/**
 * Created by Vix on 3/29/2018.
 */
public abstract class Car implements Vehicle, Beepable {

    private final int wheelCount;

    public Car(int wheelCount) {this.wheelCount = wheelCount;}

    @Override
    public void beep() {
        System.out.println("Beep-Beeps!");
    }

}
