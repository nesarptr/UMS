package person;

import contact.Contact;

public abstract class Person {
    private final String id;
    private String name;
    private String bloodGroup;
    private Contact contact;


    public Person(String id, String name) {
        this.id = id;
        this.name = name;
        this.bloodGroup = null;
        this.contact = null;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public Contact getContact() {
        return contact;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup =  bloodGroup;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\n";
    }
}


