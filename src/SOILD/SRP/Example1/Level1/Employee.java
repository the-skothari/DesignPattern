package SOILD.SRP.Example1.Level1;

public class Employee {
    private int id;
    private String name;
    private String address;
    private double salary;

    public Employee(int id, String name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    //getters and setters.

    public double computeSalary() {
        return 100.0;
    }

    public void printPerformance() {
        System.out.println("Performance report of employee "+this.name+" :");
    }

    public void updatEmployeeData(Employee emp) {
        System.out.println("Employee Data updated sucessfully.");
    }

    public void fetchEmployeeData(Employee emp) {
        System.out.println("Employee Data fetched successfully.");
    }
}
