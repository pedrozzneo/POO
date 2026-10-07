package aula06.exSlide48.services;

import aula06.exSlide48.interfaces.Repository;
import aula06.exSlide48.models.Employee;
import aula06.exSlide48.models.FakeEmployeeRepository;

public class RegisterEmployeeService {
    public Repository<Employee> repository;

    RegisterEmployeeService(Repository<Employee> repository){
        this.repository = repository;
    }

    void register(Employee employee){
        FindEmployeeService findEmployeeService = new FindEmployeeService(repository);

        if(!findEmployeeService.employeeInRepository(employee)) return;

        FakeEmployeeRepository fakeEmployeeRepository = new FakeEmployeeRepository();
        fakeEmployeeRepository.save(employee);
    }
}
