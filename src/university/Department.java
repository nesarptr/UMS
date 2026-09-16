package university;

import person.Student;
import person.Teacher;

import java.util.LinkedList;
import java.util.List;

// id name subject dean teacher
public class Department {
    private final String id;
    private String name;
    private List<Subject> subjects;
    private Teacher dean;
    private List<Teacher> teachers;
    private List<Student> students;

    public Department(String id, String name, Teacher dean) {
        this.id = id;
        this.name = name;
        this.subjects = new LinkedList<>();
        this.dean = dean;
        this.teachers = new LinkedList<>();
        this.students = new LinkedList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Teacher getDean() {
        return dean;
    }

    public void setDean(Teacher dean) {
        this.dean = dean;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setStudents(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nDean: " + dean.getName() + "\n";
    }


}
