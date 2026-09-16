package university;

public class Subject {
    private final String id;
    private String name;
    private double credit;


    public Subject(String id, String name, double credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;
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

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nCredit: " + credit + "\n";
    }
}
