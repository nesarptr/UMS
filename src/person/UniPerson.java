package person;

import university.Department;

public class UniPerson extends Person{
    private Department department;


    public UniPerson(String id, String name) {
        super(id, name);
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + "Department: " + department.getName() + "\n";
    }
}
