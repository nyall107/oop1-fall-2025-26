class Position {
    String title;
    double salary;

    Position(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    void showPosition() {
        System.out.println("   Position Title: " + title);
        System.out.println("   Salary: " + salary);
    }
}

class Employee {
    String name;
    int id;
    Position position;  

    Employee(String name, int id, Position position) {
        this.name = name;
        this.id = id;
        this.position = position;
    }

    void showEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("ID: " + id);
        position.showPosition();   
        System.out.println("---------------------------------");
    }
}

class Company {
    String companyName;
    Employee[] employees; 
    int count = 0;

    Company(String companyName, int size) {
        this.companyName = companyName;
        this.employees = new Employee[size];
    }

    void addEmployee(Employee e) {
        if (count < employees.length) {
            employees[count] = e;
            count++;
        }
    }

    void showCompany() {
        System.out.println("Company: " + companyName);
        System.out.println("Employees List:");
        for (int i = 0; i < count; i++) {
            employees[i].showEmployee();
        }
    }
}

public class AssoComEmpl {
    public static void main(String[] args) {

        Position p1 = new Position("Manager", 40000);
        Position p2 = new Position("Software Engineer", 55000);
        Position p3 = new Position("Accountant", 30000);

        Employee e1 = new Employee("Rahim", 101, p1);
        Employee e2 = new Employee("Karim", 102, p2);
        Employee e3 = new Employee("Hasan", 103, p3);

        Company c = new Company("TechNova Ltd.", 5);

        c.addEmployee(e1);
        c.addEmployee(e2);
        c.addEmployee(e3);

        c.showCompany();
    }
}
