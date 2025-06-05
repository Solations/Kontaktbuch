package kontaktbuch;

abstract class Contact {

    /**
     * The name of the contact.
     */
    protected Name name;
    /**
     * the address of the contact.
     */
    protected Address address;

    /**
     * Constructs a new contact with the attributes set to the parameters.
     * @param name
     *          The name of the contact
     * @param address
     *          The address of the contact
     */
    Contact(Name name, Address address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Gets the name of the contact.
     * @return the name
     */
    Name getName() {
        return name;
    }

    /**
     * Gets the address of the Contact.
     * @return the address
     */
    Address getAddress() {
        return address;
    }

    /**
     * Sets the address of the contact.
     * @param address
     *          The new address
     */
    void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Sets the name of the contact.
     * @param name
     *          The new name
     */
    void setName(Name name) {
        this.name = name;
    }

    /**
     * Returns the Contact as a readable String.
     * @return The Contact as a readable String
     */
    @Override
    public String toString() {
        return "Name: " + name.toString() + "\nAddress: " + address.toString();
    }

}
