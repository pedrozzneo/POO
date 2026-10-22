package aula07.exercises.ex2;

import java.time.LocalDate;

public class Main {
    static void main() {
        Company company = new Company();
        Employee employee = new Employee("1", "pedro", "developer", 12830312.00, LocalDate.now());
        Employee employee2 = new Employee("2", "lucas", "Software developer", 312312.13, LocalDate.now());


        company.hire(employee);
        company.hire(employee2);
        Employee[] employees = company.getEmployees();
        for (Employee employee1 : employees) {
            System.out.println(employee1);
        }
        company.fire(employee.getId());
        company.fire(employee2.getId());
    }
}
