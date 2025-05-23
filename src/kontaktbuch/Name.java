package kontaktbuch;

class Name {

    private String name;
    private String surname;

    Name(String name){
        this(name, "");
    }

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
        return name + " " + surname;
    }

}
