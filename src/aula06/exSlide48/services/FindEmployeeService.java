package aula06.exSlide48.services;
import aula06.exSlide48.interfaces.Repository;
import aula06.exSlide48.models.Employee;

public class FindEmployeeService {
    public Repository repository;

    FindEmployeeService(Repository repository){
        this.repository = repository;
    }

    Employee findById(String id){
        return repository.getById(id);
    }
}
