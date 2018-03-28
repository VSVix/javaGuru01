package lv.javaguru18.lesson7.abstractClases;

/**
 * Created by Vix on 3/22/2018.
 */
public abstract class Fish extends Animal{
    public abstract void swim();

    @Override
    public void eat() {
        System.out.println("Fish is eating...");
    }

    public void makeBubbles(){
        System.out.println("Fish is making Bubbles °°° °°° °");
    }
}
