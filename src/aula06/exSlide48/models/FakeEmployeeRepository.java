package aula06.exSlide48.models;

import aula06.exSlide48.interfaces.Repository;

import java.util.Objects;

public class FakeEmployeeRepository implements Repository<Employee>{
    Employee[] employees = new Employee[100];

    @Override
    public void save(Employee employee) {
        employees[employees.length - 1] = employee;
    }

    @Override
    public Employee getById(String id) {
        for (Employee employee : employees) {
            if (Objects.equals(employee.getId(), id)) {
                return employee;
            }
        }
        return null;
    }

    public boolean employeeInRepository(Employee targetEmployee){
        for (Employee employee : employees) {
            if(employee.equals(targetEmployee)){
                return true;
            }
        }
        return false;
    }
}
