package day12.DefiningClassesExercises.Demo;

public class Employee {
    private String name;
    private double salary;
    private String position;
    private String department;
    //optional
    private String email;
    private int age;

    public Employee(String name, double salary, String position, String department,
                    String email, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }


    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %d", this.name, this.salary,
                this.email, this.age);
    }
}
