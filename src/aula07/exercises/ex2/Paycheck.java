package aula07.exercises.ex2;

import java.time.LocalDate;

public class Paycheck {
    private LocalDate payday;
    private double salary;

    public Paycheck(LocalDate payday, double salary) {
        this.payday = payday;
        this.salary = salary;
    }

    public LocalDate getPayday() {
        return payday;
    }

    public double getSalary() {
        return salary;
    }
}
