package person;

import university.Exam;

import java.util.LinkedList;
import java.util.List;

public class Student extends UniPerson{
    private final String studentId;
    private final Guardian guardian;
    private List<Exam> exams;
    private double fee;


     public Student(String id, String name, String studentId, Guardian guardian) {
        super(id, name);
         this.studentId = studentId;
         this.guardian = guardian;
         this.exams = new LinkedList<>();
     }

    public String getStudentId() {
        return studentId;
    }

    public Guardian getGuardian() {
        return guardian;
    }

    public List<Exam> getExams() {
        return exams;
    }

    public void setExams(List<Exam> exams) {
        this.exams = exams;
    }

    public void setExams(Exam exam) {
         exams.add(exam);
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
         return super.toString() + "Student ID: " + studentId + "\n Guardian: " + guardian.getName() + "Fee: " + fee + "\n";
    }
}
