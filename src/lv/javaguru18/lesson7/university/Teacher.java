package lv.javaguru18.lesson7.university;

/**
 * Created by Vix on 3/22/2018.
 */
public class Teacher extends Student {

    public Teacher() {
        System.out.println("I became a Teacher!");
    }
    public Teacher(int age) {
        super(age);
        System.out.println("I became a Teacher!");
    }
    public void teach() {
        System.out.println("I'm a teacher and I'm teaching!");
    }

    public void study(String message){
        System.out.println("Teacher is leveling Up on "+message);
    }

}
