package lv.javaguru18.lesson7.interfaces;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by Vix on 3/22/2018.
 */
public class Accounting {


    public static void main(String[] args) {

        Manager manager = new Manager("Jack","01.12.1960");
        Worker worker = new Worker("Hulio","01.12.1989");
        Gardner gardner = new Gardner("Horhe","01.12.1995");

        System.out.println(worker.getClass().getCanonicalName());

        printAccData(manager);
        printAccData(worker);
        printAccData(gardner);
    }

    private static void printAccData(Employee employee) {
        String message =  new StringBuilder("Employee: ").append(employee.getName())
                .append(", Age:").append(employee.getAge())
                .append(", Salary:").append(employee.getSalary())
                .append(", Tax:").append(employee.calculateTax()).toString();
        System.out.println(message);
    }
}
