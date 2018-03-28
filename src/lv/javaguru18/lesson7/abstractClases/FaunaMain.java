package lv.javaguru18.lesson7.abstractClases;

/**
 * Created by Vix on 3/22/2018.
 */
public class FaunaMain {
    public static void main(String[] args) {
        Deer deer = new Deer();
//        deer.eat();
//        deer.poop();
        functioning(deer);

        System.out.println();

//        Snake snake = new Snake();
        functioning(new Snake());
//        snake.skin();

        System.out.println();

        Salmon salmon = new Salmon();
        salmon.makeBubbles();
        salmon.swim();

        System.out.println();

    }

    public static void functioning(Animal animal){
        animal.eat();
        animal.poop();
        if (animal instanceof Snake) {
            Snake snake = (Snake)animal;
            snake.skin();
        }
        if (animal instanceof Salmon) {
            ((Fish)animal).swim();
//            salmon.makeBubbles();
        }
    }
}
