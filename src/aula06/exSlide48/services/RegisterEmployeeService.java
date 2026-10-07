package aula06.exSlide48.services;

import aula06.exSlide48.interfaces.Repository;
import aula06.exSlide48.models.Employee;
import aula06.exSlide48.models.FakeEmployeeRepository;

public class RegisterEmployeeService {
    public Repository<Employee> repository;

    public RegisterEmployeeService(Repository<Employee> repository){
        this.repository = repository;
    }

    public void register(Employee employee){
        FindEmployeeService findEmployeeService = new FindEmployeeService(repository);

        if(findEmployeeService.findById(employee.getId()) != null) return;

        repository.save(employee);
    }
}
