package kontaktbuch;

class Person extends Contact {

    /**
     * Constructs a new Person with the attributes set to the given parameters.
     * @param name
     *          The name of the contact
     * @param address
     *          The address of the contact
     */
    Person(Name name, Address address) {
        super(name, address);
    }

}
