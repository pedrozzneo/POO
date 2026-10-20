package aula05.practices;

import java.util.Objects;

public sealed class Employee permits Manager {
    private String name;
    private double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double calculateBonus(){
        return salary * 0.2;
    }

    @Override
    public boolean equals(Object object) {
        System.out.println(getSalary());
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    public double getSalary(){
        return salary;
    }
}
