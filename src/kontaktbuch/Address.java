package kontaktbuch;

public class Address {

    /**
     * The street of the address.
     */
    private String street;
    /**
     * The city of the address.
     */
    private String city;
    /**
     * The postal code of the address.
     */
    private String postalCode;
    /**
     * The house number of the address
     */
    private String houseNumber;

    /**
     * Constructs a new empty address.
     */
    Address(){
        this("","","","");
    }

    /**
     * Constructs a new address with the attributes filled by the provided parameters.
     * @param street
     *          The street as a String.
     * @param city
     *          The city as a String.
     * @param postalCode
     *          The postal code as a String.
     * @param houseNumber
     *          The house number as a String.
     */
    Address(String street, String city, String postalCode, String houseNumber) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.houseNumber = houseNumber;
    }

    /**
     * Returns the street attribute of the Address.
     * @return the street
     */
    String getStreet() {
        return street;
    }

    /**
     * Returns the city attribute of the Address.
     * @return the city
     */
    String getCity() {
        return city;
    }

    /**
     * Returns the postalCode Attribute of the Address.
     * @return the postal code
     */
    String getPostalCode() {
        return postalCode;
    }

    /**
     * Returns the houseNumber attribute of the Address.
     * @return the house number
     */
    String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the street of the address.
     * @param street
     *      The new street
     */
    void setStreet(String street) {
        this.street = street;
    }

    /**
     * Sets the city of the address.
     * @param city
     *      The new city
     */
    void setCity(String city) {
        this.city = city;
    }

    /**
     * Sets the postal code of the address.
     * @param postalCode
     *      The new postal code
     */
    void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Sets the house number of the address.
     * @param houseNumber
     *      The new house number
     */
    void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    /**
     * Returns the Address as a readable String.
     * @return The Address as a readable String
     */
    @Override
    public String toString() {
        return street + " " + houseNumber + "\n" + postalCode + " " + city;
    }
}
