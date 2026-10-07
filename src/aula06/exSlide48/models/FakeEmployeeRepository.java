package aula06.exSlide48.models;

import aula06.exSlide48.interfaces.Repository;

import java.util.Objects;

public class FakeEmployeeRepository implements Repository<Employee>{
    Employee[] employees = new Employee[100];
    int counter;

    @Override
    public void save(Employee employee) {
        employees[counter] = employee;
        counter++;
    }

    @Override
    public Employee getById(String id) {
        for (int i = 0; i < counter; i++) {
            if ((employees[i].getId()).equals(id)) {
                return employees[i];
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
