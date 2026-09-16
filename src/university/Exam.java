package university;

public class Exam {
    private final String id;
    private String name;
    private double passMark;
    private Subject subject;

    public Exam(String id, String name, double passMark, Subject subject) {
        this.id = id;
        this.name = name;
        this.passMark = passMark;
        this.subject = subject;
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

    public double getPassMark() {
        return passMark;
    }

    public void setPassMark(double passMark) {
        this.passMark = passMark;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nPass Mark: " + passMark + "\nSubject:" + subject.getName() + "\n";
    }
}
