import kontaktbuch.Addressbuch;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final Addressbuch addressbuch = new Addressbuch();
        addressbuch.addContact();
        addressbuch.addContact();
        addressbuch.printContacts();
        addressbuch.search("Test");
        addressbuch.deleteContact();
        addressbuch.printContacts();
    }
}