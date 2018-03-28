package lv.javaguru18.lesson6;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.awt.*;

/**
 * Created by Vix on 3/15/2018.
 */
public class TestDrive {
    public static void main(String[] args) {
        Car myNewCar = new Car(Color.blue, 220);
        driveNormal(myNewCar);
        System.out.println("------------------------");
        filedToChangeGears(myNewCar);
        System.out.println("------------------------");
        filedToStart(myNewCar);
        System.out.println(myNewCar.getInteriorLightColor());
    }

    private static void driveNormal(Car car) {
        car.engineOn();
        car.shiftGear(GearShifterState.D);
        car.drive();
        car.shiftGear(GearShifterState.P);
        car.engineOff();
    }
    private static void filedToStart(Car car) {
        car.engineOn();
        car.engineOn();
        car.engineOff();
    }
    private static void filedToChangeGears(Car car) {
        car.engineOn();
        car.shiftGear(GearShifterState.R);
        car.shiftGear(GearShifterState.N);
        car.shiftGear(GearShifterState.D);
        car.engineOff();
    }
}
