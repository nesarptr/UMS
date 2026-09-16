package person;

import university.Subject;

import java.util.LinkedList;
import java.util.List;

public class Teacher extends Employee{

    private List<Subject> subjects;

    public Teacher(String id, String name, String employeeId, double salary) {
        super(id, name, employeeId, salary);
        subjects = new LinkedList<>();
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public void setSubjects(Subject subject) {
        subjects.add(subject);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
