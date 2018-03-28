package lv.javaguru18.lesson7.university;

/**
 * Created by Vix on 3/22/2018.
 */
public class University {
    public static void main(String[] args) {
        Student student = new Student();
        student.study();
        System.out.println("------------------------------");
        Teacher teacher = new Teacher(50);
        teacher.study();
        teacher.study("stamina!");
        teacher.teach();
        System.out.println("------------------------------");
        Director director = new Director();
        director.hire();
        director.fire(teacher);
        director.study();
    }
}
