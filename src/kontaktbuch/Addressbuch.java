package kontaktbuch;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Addressbuch {

    private final ArrayList<Contact> contacts = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    /*
     * Allows the user to interactively add a contact.
     */
    public void addContact() {
        System.out.println("What kind of contact would you like to add? 1: Person 2: Company");
        final String input = scanner.nextLine();
        if(input.equals("1")) {
            System.out.println("Please enter the first name: ");
            final String name = scanner.nextLine();
            System.out.println("Please the last name: ");
            final String surname = scanner.nextLine();
            final Address address = readAddress();
            contacts.add(new Person(new Name(name, surname), address));
        } else if (input.equals("2")) {
            System.out.println("Please enter the name: ");
            final String name = scanner.nextLine();
            final Address address = readAddress();
            contacts.add(new Person(new Name(name), address));
        } else {
            System.out.println("Please enter a valid option");
            addContact();
        }
    }

    /*
     * Allows the user to interactively delete a contact.
     */
    public void deleteContact() {
        System.out.println("Which contact would you like to delete? (-1: Exit)");
        printContacts();
        try {
            final int selected = scanner.nextInt();
            if (selected == -1) {
                return;
            }
            contacts.remove(selected);
        } catch (NoSuchElementException | IndexOutOfBoundsException e){
            System.out.println("Please enter a valid option!");
            deleteContact();
        } catch (Exception e){
            System.out.println("Sorry something went wrong!");
        }
    }

    /*
     * Searches for all contacts containing the query String and prints them to the console.
     *
     * @param query
     *      The query
     */
    public void search(String query) {
        final List<Contact> searchResults = contacts.stream()
            .filter(contact -> contact.toString().toLowerCase().contains(query.toLowerCase()))
            .toList();
        if (searchResults.isEmpty()) {
            System.out.println("No such contact");
        }
        printListOfContacts(searchResults);
    }

    /*
     * Pretty prints all contacts to the console.
     */
    public void printContacts() {
        if(contacts.isEmpty()) {
            System.out.println("No contacts.");
        }
        printListOfContacts(contacts);
    }

    /*
     * Pretty prints a list of contacts to the console.
     *
     * @param contactsToPrint
     *      The list of contacts that will be print.
     */
    private void printListOfContacts(List<Contact> contactsToPrint) {
        for (int i = 0; i < contactsToPrint.size(); i++) {
            System.out.println("Entry " + i + ":");
            System.out.println(contactsToPrint.get(i).toString());
        }
    }

    /*
     * Reads and returns an address from the console.
     */
    private Address readAddress() {
        final Address address = new Address();
        System.out.println("Please enter a street: ");
        address.setStreet(scanner.next().trim());
        System.out.println("Please enter a house number: ");
        address.setHouseNumber(scanner.next().trim());
        System.out.println("Please enter a zip code: ");
        address.setPostalCode(scanner.next().trim());
        System.out.println("Please enter a city: ");
        address.setCity(scanner.next().trim());
        return address;
    }

}
