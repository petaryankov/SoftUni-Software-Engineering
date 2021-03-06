package day12.DefiningClassesExercises.Demo;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private List<Employee> employees;
    private String name;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public double getAverageSalary() {
        return this.employees.stream()
                .mapToDouble(Employee::getSalary).average().orElse(0);
    }

    public String getName() {
        return name;
    }
}
