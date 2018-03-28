package lv.javaguru18.lesson7.interfaces;

import java.time.LocalDate;

/**
 * Created by Vix on 3/22/2018.
 */
public class Worker extends Employee {

    public Worker(String name, String birthDate) {
        super(name, birthDate);
    }

    @Override
    public float getSalary() {
        return 1000;
    }
}
