package aulas.aula06.exercices.exSlide48.models;

import aulas.aula06.exercices.exSlide48.interfaces.Repository;

import java.util.LinkedHashMap;
import java.util.Map;

public class FakeEmployeeRepository implements Repository<Employee, String>{
    Map<String, Employee> employees = new LinkedHashMap<>();
    int counter;

    @Override
    public void save(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    @Override
    public Employee getById(String id) {
       return employees.get(id);
    }
}
