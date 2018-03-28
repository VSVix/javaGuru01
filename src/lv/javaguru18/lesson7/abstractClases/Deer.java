package lv.javaguru18.lesson7.abstractClases;

/**
 * Created by Vix on 3/22/2018.
 */
public class Deer extends Animal{

    @Override
    public void eat() {
        System.out.println("Deer is eating...");
    }

    @Override
    public void poop() {
        System.out.println("Deer is puuping *#@^,..");
    }
}
