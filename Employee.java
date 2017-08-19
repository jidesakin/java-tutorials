public class Employee {

    String name;
    int age;
    String designation;
    double salary;

    public Employee(String name) {
        this.name = name;
    }

    public void empAge(int empAge) {
        age = empAge;
    }

    public void empDesignation(String empDesignation) {
        designation = empDesignation;
    }

    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    public void printEmployeeDetails() {
        System.out.println("Employee Name:" + name);
        System.out.println("Employee Designation:" + designation);
        System.out.println("Employee Age:" + age);
        System.out.println("Employee Salary:" + salary);
    }
}