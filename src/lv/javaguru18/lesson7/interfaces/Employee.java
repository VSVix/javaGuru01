package lv.javaguru18.lesson7.interfaces;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by Vix on 3/22/2018.
 */
public abstract class Employee implements Human {

    public static final float TAX_RATE = 0.33f;

    private static final DateTimeFormatter BD_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public abstract float getSalary();

    private String name;
    private LocalDate birthDate;

    public Employee(String name, String birthDate) {
        this.name = name;
        this.birthDate = LocalDate.parse(birthDate,BD_FORMAT);
    }

    public float calculateTax() {
        return getSalary() * TAX_RATE;
    }

    @Override
    public String getName() { return name; }

    @Override
    public int getAge() {
        return LocalDate.now().minusYears(birthDate.getYear()).getYear();
    }
}
