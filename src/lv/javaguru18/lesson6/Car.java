package lv.javaguru18.lesson6;

import java.awt.*;

/**
 * Created by Vix on 3/15/2018.
 */
public class Car {
    private final Color color;
    private int horsePower;
    private GearShifterState gearShifter;
    private boolean isOn;

    public Car(Color color, int horsePower) {
        this.color = color;
        this.horsePower = horsePower;
        this.gearShifter = GearShifterState.P;
    }

    public void drive(){
        System.out.println(isReadyToDrive()
                                ? "Let\'s Go!"
                                : "Go to driving school!");
    }

    public void engineOn(){
        System.out.println(isOn
                            ? "Ghzzzz!! Im already ON!"
                            : "Brumm, ready to go!");
        isOn = true;
    }

    public void engineOff(){
//TODO gearShifter check?
        if (!isReadyToDrive()) {
            System.out.println(isOn
                    ? "Shutting down!"
                    : "Already OFF!!!");
            isOn = false;
        } else {
            System.out.println("Didn\'t you forgot something!?");
        }
    }

    public void shiftGear(GearShifterState gearShifter){
        if (isSwitchingR2D(gearShifter) || isSwitchingD2R(gearShifter)) {
            System.out.println("Where did you learn to drive");
        } else {
            this.gearShifter = gearShifter;
            System.out.println("Changed gear to "+gearShifter);
        }

    }

    public String getInteriorLightColor() {
        String interiorColor;
        if (horsePower < 50) {
            interiorColor = "green";
        } else if (horsePower < 150) {
            interiorColor = "green";
        } else if (horsePower < 250) {
            interiorColor = "lightGray";
        } else {
            interiorColor = "red"; }
        return interiorColor;
    }

    private boolean isSwitchingD2R(GearShifterState gearShifter) {
        return GearShifterState.D == gearShifter && GearShifterState.R == this.gearShifter;
    }

    private boolean isSwitchingR2D(GearShifterState gearShifter) {
        return GearShifterState.R == gearShifter && GearShifterState.D == this.gearShifter;
    }

    private boolean isReadyToDrive() {
        return isOn && (GearShifterState.D == gearShifter
                        || GearShifterState.R == gearShifter);
    }
}
