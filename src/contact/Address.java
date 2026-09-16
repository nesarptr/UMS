package contact;

public class Address {
    private final String id;
    private String roadNo;
    private String city;
    private String region;
    private String country;
    private String postalCode;


    public Address(String id, String roadNo, String city, String region, String country, String postalCode) {
        this.id = id;
        this.roadNo = roadNo;
        this.city = city;
        this.region = region;
        this.country = country;
        this.postalCode = postalCode;
    }

    public Address(String id) {
        this.id = id;
        this.roadNo = null;
        this.city = null;
        this.region = null;
        this.country = null;
        this.postalCode = null;
    }

    public String getId() {
        return id;
    }

    public String getRoadNo() {
        return roadNo;
    }

    public void setRoadNo(String roadNo) {
        this.roadNo = roadNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nRoad No.: " + roadNo + "\nCity: " + city + "\nRegion: " + region + "\nCountry: " + country + "\nPostal Code: " + postalCode + "\n";
    }
}
