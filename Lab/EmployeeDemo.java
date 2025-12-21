abstract class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract void calculateSalary();

    void showDetails() {
        System.out.println("Employee Name: " + name);
    }
}

class FullTimeEmployee extends Employee {

    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    void calculateSalary() {
        System.out.println("Monthly Salary: " + monthlySalary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee emp = new FullTimeEmployee("Rahim", 50000);

        emp.showDetails();
        emp.calculateSalary();
    }
}
