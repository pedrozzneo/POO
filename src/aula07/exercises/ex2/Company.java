package aula07.exercises.ex2;

import java.time.LocalDate;
import java.util.*;

public class Company {
    private final Map<String, Employee> employees;

    public Company(){
        employees = new HashMap<>();
    }

    public void hire(Employee employee){
        employees.put(employee.getId(), employee);
    }

    public void fire(String id){
        employees.remove(id);
    }
}
