package aulas.aula06.exercices.exSlide48.services;
import aulas.aula06.exercices.exSlide48.interfaces.Repository;
import aulas.aula06.exercices.exSlide48.models.Employee;

public class FindEmployeeService {
    public Repository<Employee, String> repository;

    public FindEmployeeService(Repository<Employee, String> repository){
        this.repository = repository;
    }

    public Employee findById(String id){
        return repository.getById(id);
    }
}
