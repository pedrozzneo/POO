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

    public Employee[] getEmployees(){
        return employees.values().toArray(new Employee[0]);
    }

    public Employee[] getEmployees(String jobTitle){
        Employee[] employeesArray = employees.values().toArray(new Employee[0]);
        List<Employee> employeeList = new ArrayList<>();

        for (Employee employee : employeesArray) {
            if(Objects.equals(employee.getJobTitle(), jobTitle)){
                employeeList.add(employee);
            }
        }

        return employeeList.toArray(new Employee[0]);
    }
}
