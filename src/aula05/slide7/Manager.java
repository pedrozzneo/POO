package aula05.slide7;

public sealed class Manager extends Employee permits Test{
    private Employee[] managedEmployees = new Employee[10];

    Manager(String name, double salary){
        super(name, salary);
    }

    @Override
    public double calculateBonus(){
        return super.getSalary() * 0.3;
    }
}
