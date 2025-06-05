package kontaktbuch;

class Company extends Contact{

    /**
     * Constructs a new Company with the attributes set to the passed by parameters.
     * @param name
     *          The name of the contact
     * @param address
     *          The address of the contact
     */
    Company(Name name, Address address) {
        super(name, address);
    }

}
