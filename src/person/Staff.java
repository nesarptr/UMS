package person;

public class Staff extends Employee{

    private String title;

    public Staff(String id, String name, String employeeId, double salary, String title) {
        super(id, name, employeeId, salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() + "Title: " + title + "\n";
    }
}
