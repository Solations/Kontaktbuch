package kontaktbuch;

class Name {

    private String name;
    private String surname;

    /*
     * @param name
     *          The name as a string.
     */
    Name(String name){
        this(name, "");
    }

    /*
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

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString(){
        if (surname.isEmpty()){
            return name;
        }
        return name + " " + surname;
    }

}
