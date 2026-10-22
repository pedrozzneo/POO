package aula07.exercises.ex2;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private String id;
    private String name;
    private String jobTitle;
    private Double salary;
    private LocalDate dateOfEmployment;

    public Employee(String id, String name, String jobTitle, Double salary, LocalDate dateOfEmployment) {
        this.id = id;
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.dateOfEmployment = dateOfEmployment;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public Double getSalary() {
        return salary;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
