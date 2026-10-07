package aula06.exSlide48.services;
import aula06.exSlide48.interfaces.Repository;
import aula06.exSlide48.models.Employee;
import aula06.exSlide48.models.FakeEmployeeRepository;

public class FindEmployeeService {
    public Repository<Employee> repository;

    FindEmployeeService(Repository<Employee> repository){
        this.repository = repository;
    }

    Employee findById(String id){
        FakeEmployeeRepository fakeEmployeeRepository = new FakeEmployeeRepository();
        return fakeEmployeeRepository.getById(id);
    }

    boolean employeeInRepository(Employee employee){
        FakeEmployeeRepository fakeEmployeeRepository = new FakeEmployeeRepository();
        return fakeEmployeeRepository.employeeInRepository(employee);
    }
}
