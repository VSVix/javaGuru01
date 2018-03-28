package lv.javaguru18.lesson2;

/**
 * Created by Vix on 2/8/2018.
 */
public class PlayWithPrimitiveTypes {
    public static void main(String[] args) {
        overfillByte();
//        char myNameFirstChar = 'V';
//        int myNameFirstCharNumber = (int)myNameFirstChar;
//        System.out.println(myNameFirstChar);
//        System.out.println(myNameFirstCharNumber);
//        System.out.println((char) 86);

    }

    public static void overfillByte() {
        byte mySmallNumber = 50;
        byte myLargeNumber = (byte)300;
        System.out.println("Mans mazais skaitlis: "+mySmallNumber);
        System.out.println("Mans mazais skaitlis ir pieaudzis: "+myLargeNumber);
        System.out.println("Mans mazais skaitlis ir pieaudzis: "+ (mySmallNumber + 300));

    }
}
