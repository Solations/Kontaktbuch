package kontaktbuch;

public class Address {

    private String street;
    private String city;
    private String postalCode;
    private String houseNumber;

    Address(String street, String city, String postalCode, String houseNumber) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.houseNumber = houseNumber;
    }

    String getStreet() {
        return street;
    }

    String getCity() {
        return city;
    }

    String getPostalCode() {
        return postalCode;
    }

    String getHouseNumber() {
        return houseNumber;
    }

    void setStreet(String street) {
        this.street = street;
    }

    void setCity(String city) {
        this.city = city;
    }

    void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return street + " " + houseNumber + " " + postalCode + " " + city;
    }
}
