package streamsjava.terminalOperations;

public class Employee {
    String name;
    String deepartment;
    int salary;

    public Employee(String name, String deepartment, int salary){
        this.name = name;
        this.deepartment = deepartment;
        this.salary = salary;
    }

    public String getDeepartment() {
        return deepartment;
    }

    public void setDeepartment(String deepartment) {
        this.deepartment = deepartment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", deepartment='" + deepartment + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
