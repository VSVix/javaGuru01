package lv.javaguru18.lesson6;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;

/**
 * Created by Vix on 3/15/2018.
 */
public class StringPlay {
    public static void main(String[] args) {
//        playStringEqualPrint();
//        equalsExample();
//        stringPrint();

//        playWithSubstring();
        playWithStringBuilder();



    }

    private static void playWithStringBuilder() {
        StringBuilder urlBuilder = new StringBuilder("someDomain/service");
        urlBuilder.append("?");
        urlBuilder.append("id=");
        urlBuilder.append(15);
        System.out.println("URL= "+urlBuilder.toString());
    }

    private static void playWithSubstring() {
        String example = "exampleCharSequence";
        int charIndex = example.indexOf('C');

        System.out.println(example.indexOf('C'));

        System.out.println(example.substring(charIndex,charIndex+"Char".length()));
        System.out.println(example.substring(example.indexOf('C'),example.indexOf('C')+"Char".length()));

    }

    private static void playStringEqualPrint() {
        String myName = "Janizz";
        String myName2 = "Janizz1";
        String msg = "My name is "+ myName + "My age is " + 44;

        myName2 = "Janizz";
        System.out.println(myName == myName2);
        System.out.println(myName.equals(myName2));
        System.out.println(myName.hashCode());
    }

    private static void stringPrint() {
        String numbers = "1,5,7,au,9,tk";
        String[] numArr = numbers.split(",");

        for (String element : numArr){
            System.out.println(element);
        }
        System.out.println("-----------");
        Arrays.stream(numArr).forEach(element -> System.out.println(element));

        System.out.println("-----------");

        Arrays.stream(numArr).forEach(System.out::println);

        System.out.println("");
    }

    private static void equalsExample() {
        String myName = new String("Janiz");
        boolean isMyNameJaniz = myName == "Janiz";
        System.out.println("Incorrect comparisson \"==\" :" + isMyNameJaniz);

        isMyNameJaniz = myName.equals("Janiz");
        System.out.println("Correct comparisson equals.() :" + isMyNameJaniz);


    }
}
