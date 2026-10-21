package aula07.practices;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return String.format("%s - %.2f", name, salary);
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
