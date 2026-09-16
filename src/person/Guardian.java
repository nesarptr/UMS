package person;

import java.util.LinkedList;
import java.util.List;

public class Guardian extends Person{
    private String profession;
    private double income;
    private List<Student> children;


    public Guardian(String id, String name, String profession, double income) {
        super(id, name);
        this.profession = profession;
        this.income = income;
        this.children = new LinkedList<>();
    }


    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public List<Student> getChildren() {
        return children;
    }

    public void setChildren(List<Student> children) {
        this.children = children;
    }

    public void setChildren(Student ward) {
        children.add(ward);
    }

    @Override
    public String toString() {
        return super.toString() + "Profession: " + profession + "\nIncome: " + income + "\n" ;
    }

}
