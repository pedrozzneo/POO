package aula06.exSlide48;

import aula06.exSlide48.interfaces.Repository;
import aula06.exSlide48.models.Employee;
import aula06.exSlide48.models.FakeEmployeeRepository;
import aula06.exSlide48.services.FindEmployeeService;
import aula06.exSlide48.services.RegisterEmployeeService;

public class Main {
    static void main() {
        FakeEmployeeRepository fakeEmployeeRepository = new FakeEmployeeRepository();
        RegisterEmployeeService registerEmployeeService = new RegisterEmployeeService(fakeEmployeeRepository);
        FindEmployeeService findEmployeeService = new FindEmployeeService(fakeEmployeeRepository);

        Employee employee1 = new Employee("1");
        registerEmployeeService.register(employee1);

        Employee employee2 = new Employee("2");
        registerEmployeeService.register(employee2);

        Employee employee3 = new Employee("3");
        Employee employee4 = new Employee("4");

        Employee employeeFound1 = findEmployeeService.findById("1");

        if(employee1.equals(employeeFound1)){
            System.out.println("1 is equal");
        }
        else{
            System.out.println("1 not found");
        }

        Employee employeeFound2 = findEmployeeService.findById("2");

        if(employee2.equals(employeeFound2)){
            System.out.println("2 is equal");
        }
        else{
            System.out.println("2 not found");
        }

        Employee employeeFound3 = findEmployeeService.findById("3");

        if(employee3.equals(employeeFound3)){
            System.out.println("3 is equal");
        }
        else{
            System.out.println("3 not found");
        }
    }
}
