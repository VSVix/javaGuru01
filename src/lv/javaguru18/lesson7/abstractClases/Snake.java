package lv.javaguru18.lesson7.abstractClases;

/**
 * Created by Vix on 3/22/2018.
 */
public class Snake extends Animal {
    @Override
    public void eat() {
        System.out.println("Snake is eating...");
    }

    @Override
    public void poop() {
        System.out.println("Snake is puuping *#@^,..");
    }

    public void skin(){
        System.out.println("Snake is skinned.  .___.__/\\_/\\_/`'°°");
    }
}
