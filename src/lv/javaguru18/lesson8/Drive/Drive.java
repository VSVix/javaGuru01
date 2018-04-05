package lv.javaguru18.lesson8.Drive;

public class Drive {
    public static void main(String[] args) {

        Tractor tractor = new Tractor(8);
        LawMower lawnMover = new LawMower();
        Buss buss = new Buss(6);

        driveAVehicle(tractor);
        doBeep(tractor);

        System.out.println("--");
        doBeep(buss);
        driveAVehicle(buss);

        System.out.println("--");

        driveAVehicle(lawnMover);
        driveAVehicle(lawnMover);

        System.out.println("--");

    }

    private static void doBeep(Beepable beepable){
        beepable.beep();
    }

    private static void driveAVehicle(Vehicle vehicle){
        vehicle.turnLeft();
        vehicle.turnRight();
    }
}
