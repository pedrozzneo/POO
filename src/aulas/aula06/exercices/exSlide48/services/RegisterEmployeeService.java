package aulas.aula06.exercices.exSlide48.services;

import aulas.aula06.exercices.exSlide48.interfaces.Repository;
import aulas.aula06.exercices.exSlide48.models.Employee;

public class RegisterEmployeeService {
    public Repository<Employee, String> repository;

    public RegisterEmployeeService(Repository<Employee, String> repository){
        this.repository = repository;
    }

    public void register(Employee employee){

        if(repository.getById(employee.getId()) != null) throw new IllegalStateException("id already existed");

        repository.save(employee);
    }
}
