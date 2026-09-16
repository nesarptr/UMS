package person;

public class Employee extends UniPerson{
    private final String employeeId;
    private double salary;


    public Employee(String id, String name, String employeeId, double salary) {
        super(id, name);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "Employee ID: " + employeeId + "\nSalary: " + salary + "\n";
    }
}
