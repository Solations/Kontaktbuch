package kontaktbuch;

class Name {

    /**
     * The name of the name.
     */
    private String name;
    /**
     * the surname of the name.
     */
    private String surname;

    /**
     * Constructs a new name with only the name attribute set to the name parameter.
     * @param name
     *          The name as a string.
     */
    Name(String name){
        this(name, "");
    }

    /**
     * Constructs a new name with the attributes set to the parameters.
     * @param name
     *          The name as a string.
     * @param surname
     *          The optional surname as a string.
     *          The Addressbuch only fills this for persons.
     */
    Name(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    /**
     * Gets the name attribute of the name
     * @return the name
     */
    String getName() {
        return name;
    }

    /**
     * Gets the surname of the name.
     * @return the surname
     */
    String getSurname() {
        return surname;
    }

    /**
     * Sets the name attribute of the Name.
     * @param name
     *          The new name
     */
    void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the surname of the Name.
     * @param surname
     *          the new surname
     */
    void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Returns the Name as a readable String.
     * @return the Name as a readable String
     */
    @Override
    public String toString(){
        if (surname.isEmpty()){
            return name;
        }
        return name + " " + surname;
    }

}
