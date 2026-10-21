package aula06.exSlide48.services;
import aula06.exSlide48.interfaces.Repository;
import aula06.exSlide48.models.Employee;

public class FindEmployeeService {
    public Repository<Employee> repository;

    public FindEmployeeService(Repository<Employee> repository){
        this.repository = repository;
    }

    public Employee findById(String id){
        return repository.getById(id);
    }
}
