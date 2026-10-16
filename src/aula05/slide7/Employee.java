package aula05.slide7;

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

    public double getSalary(){
        return salary;
    }
}
