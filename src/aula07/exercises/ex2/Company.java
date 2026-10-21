package aula07.exercises.ex2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Company {
    private final Set<Employee> employees;

    public Company(){
        employees = new HashSet<>();
    }

    public void hire(String name, String cpf, double salary){
        Employee employee = new Employee(name, cpf, salary);
        employees.add(employee);
    }

    public void fire(String cpf){

        employees.remove(cpf);
    }


}
