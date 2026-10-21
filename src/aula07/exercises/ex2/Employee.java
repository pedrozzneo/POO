package aula07.exercises.ex2;

import java.util.Objects;

public class Employee {
    String name;
    String cpf;
    Double salary;

    public Employee(String name, String cpf, Double salary) {
        this.name = name;
        this.cpf = cpf;
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }
}
