package aula07.practices;
import java.util.*;

public class Main {

    static void main() {
//        List<Employee> employess = new ArrayList<>();
//
//        Employee employee1 = new Employee("pedro", 1);
//        Employee employee2 = new Employee("anao", 4);
//        Employee employee3 = new Employee("zango", 2);
//        Employee employee4 = new Employee("nicolas", 3);
//
//        employess.add(employee1);
//        employess.add(employee2);
//        employess.add(employee3);
//        employess.add(employee4);
//        List<Employee> list = List.of(employee1, employee2, employee3, employee4);
//
//        Collections.sort(employess, new ComparatorByName());
//        System.out.println(employess);
//
//
//        Collections.sort(employess, new ComparatorBySalary());
//        System.out.println(employess);

        TechnicalSkills technicalSkills2 = new TechnicalSkills("run");
        TechnicalSkills technicalSkills3 = new TechnicalSkills("punch");
        TechnicalSkills technicalSkills1 = new TechnicalSkills("fly");

        Set<TechnicalSkills> unorderedTechnicalSkills = new HashSet<>();
        unorderedTechnicalSkills.add(technicalSkills2);
        unorderedTechnicalSkills.add(technicalSkills3);
        unorderedTechnicalSkills.add(technicalSkills1);

        Set<TechnicalSkills> insertionOrderedTechnicalSkills = new LinkedHashSet<>();
        insertionOrderedTechnicalSkills.add(technicalSkills2);
        insertionOrderedTechnicalSkills.add(technicalSkills3);
        insertionOrderedTechnicalSkills.add(technicalSkills1);

        Set<TechnicalSkills> comparableOrderedTechnicalSkills = new TreeSet<>();
        comparableOrderedTechnicalSkills.add(technicalSkills2);
        comparableOrderedTechnicalSkills.add(technicalSkills3);
        comparableOrderedTechnicalSkills.add(technicalSkills1);

        System.out.println(unorderedTechnicalSkills);
        System.out.println(insertionOrderedTechnicalSkills);
        System.out.println(comparableOrderedTechnicalSkills);

//        List<Names> names = new ArrayList<>();
//        names.add(new Names("pedro"));
//        names.add(new Names("anao"));
//        names.add(new Names("zango"));
//        names.add(new Names("nicolas"));
//        Collections.sort(names);

//        for (int i = 0; i < 4; i++) {
//            System.out.println(names.get(i).name);
//        }




//        for (int i = 0; i < 10; i++) {
//            employess.add(new Employee("dunga", i));
//        }
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(employess.get(i));
//        }
//
//        List<Employee> fixedSizeEmployees = List.of(new Employee("pedro", 1), new Employee("pedro", 2), new Employee("pedro", 3));
//        for (int i = 0; i < fixedSizeEmployees.toArray().length; i++) {
//            System.out.println(fixedSizeEmployees.get(i));
//        }


    }
}
