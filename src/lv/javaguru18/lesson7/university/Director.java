package lv.javaguru18.lesson7.university;

/**
 * Created by Vix on 3/22/2018.
 */
public class Director extends Teacher {

    public Director() { System.out.println("I promoted to a Director!"); }
    public void hire(){ System.out.println("A Teacher is hired!"); }
    public void fire(){ System.out.println("A Teacher is fired!"); }
    public void fire(Teacher teacher){ System.out.println("THE Teacher is FIRED!!"); }

    @Override
    public void study(){
        System.out.println("I'm smartest one, I don't study!");
    }


}
