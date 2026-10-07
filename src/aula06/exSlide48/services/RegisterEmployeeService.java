package aula06.exSlide48.services;

import aula06.exSlide48.interfaces.Repository;
import aula06.exSlide48.models.Employee;

public class RegisterEmployeeService {
    public Repository repository;

    RegisterEmployeeService(Repository repository){
        this.repository = repository;
    }

    void register(Employee employee){
        // fazer verificação se existe no sistema com o find
    }
}
