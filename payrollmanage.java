class Employee {
    String employeeId;
    String name;
    String role;
    double baseSalary;
    double finalSalary;

    Employee(String employeeId, String name, String role, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.role = role;
        this.baseSalary = baseSalary;
    }

    void calculateSalary() {
        switch (role) {
            case "Manager":
                finalSalary = baseSalary + (baseSalary * 0.20);
                break;

            case "Developer":
                finalSalary = baseSalary + (baseSalary * 0.10);
                break;

            case "Designer":
                finalSalary = baseSalary + (baseSalary * 0.05);
                break;

            case "Intern":
                finalSalary = 1000;
                break;

            default:
                finalSalary = baseSalary;
        }
    }

    void applyDeduction(double amount) {
        finalSalary = finalSalary - amount;
    }

    void displayEmployeeDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + finalSalary);
        System.out.println();
    }
}

class Payroll {

    Employee e1;
    Employee e2;
    Employee e3;

    void addEmployees(Employee emp1, Employee emp2, Employee emp3) {
        e1 = emp1;
        e2 = emp2;
        e3 = emp3;
    }

    void calculateAllSalaries() {
        e1.calculateSalary();
        e2.calculateSalary();
        e3.calculateSalary();

        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();
        e3.displayEmployeeDetails();
    }

    Employee findEmployeeById(String id) {
        if (e1.employeeId.equals(id)) return e1;
        if (e2.employeeId.equals(id)) return e2;
        if (e3.employeeId.equals(id)) return e3;
        return null;
    }
}

public class payrollmanage{
    public static void main(String[] args) {

        Payroll payroll = new Payroll();

        Employee emp1 = new Employee("101", "Mishti", "Manager", 5000);
        Employee emp2 = new Employee("102", "Rahul", "Developer", 4000);
        Employee emp3 = new Employee("103", "Anita", "Intern", 2000);

        payroll.addEmployees(emp1, emp2, emp3);

        System.out.println("All Salaries:");
        payroll.calculateAllSalaries();

        System.out.println("Applying deduction to Rahul...");
        Employee found = payroll.findEmployeeById("102");

        if (found != null) {
            found.applyDeduction(500);
            found.displayEmployeeDetails();
        }
    }
}
