package kontaktbuch;

abstract class Contact {

    protected Name name;
    protected Address address;

    Contact(Name name, Address address) {
        this.name = name;
        this.address = address;
    }

    Name getName() {
        return name;
    }

    Address getAddress() {
        return address;
    }

    void setAddress(Address address) {
        this.address = address;
    }

    void setName(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name.toString() + "\nAddress: " + address.toString();
    }

}
