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

    public static double getAverageSalary(double... salary){
        double sum = 0;
        for (double v : salary) {
            sum += v;
        }
        return sum/salary.length;
    }

    public String getName() {
        return name;
    }

    static void main() {
        System.out.println(Employee.getAverageSalary(1000, 2000));
        System.out.println(Employee.getAverageSalary(1000, 2000, 3000));
        System.out.println(Employee.getAverageSalary(1000, 2000, 3000, 7000));
    }
}
