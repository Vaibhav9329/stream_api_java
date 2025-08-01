package streamsjava.terminalOperations;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByExample {
    public static void main(String[] args) {


        List<Employee> employees = Arrays.asList(
                new Employee("alice", "HR", 33000),
                new Employee("boob", "IT", 55000),
                new Employee("charlie", "finance", 40000),
                new Employee("dave", "HR", 60000),
                new Employee("eve", "IT", 80000)

        );

        //Partition numbers into even and odd
        Map<Boolean, List<Employee>> partBysal =
                employees.stream()
                        .collect(Collectors.partitioningBy(employee -> employee.getSalary() > 50000));


        System.out.println("Employee with salary > 50000");
        partBysal.get(true).forEach(System.out::println);

        System.out.println("\nEmployee with salary <= 50000");
        partBysal.get(false).forEach(System.out::println);
    }
}
