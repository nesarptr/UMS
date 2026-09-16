package contact;

public class Contact {
    private final String id;
    private String email;
    private String phone;
    private String alternativePhone;
    private Address address;


    public Contact(String id, String email, String phone, Address address) {
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAlternativePhone() {
        return alternativePhone;
    }

    public void setAlternativePhone(String alternativePhone) {
        this.alternativePhone = alternativePhone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nEmail: " + email + "\nPhone: " + phone + "\nAlternative Phone: " + alternativePhone + "\nAddress:\n" + address;
    }
}
