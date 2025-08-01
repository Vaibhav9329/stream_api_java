package streamsjava.terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByDemo {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("alice", "HR", 3000),
                new Employee("boob", "IT", 4000),
                new Employee("charlie", "finance", 3000),
                new Employee("dave", "HR", 3000),
                new Employee("eve", "IT", 3000)

        );

//        Group employees by department
        Map<String,List<Employee> > empp =
                employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDeepartment));

//        print the grouped employee
        empp.forEach((dep,emplist) -> {
            System.out.println("Department: " + dep);
            emplist.forEach(System.out::println);
        });

        
    }
}
