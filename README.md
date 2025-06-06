# Technische Details
## Java Version
openjdk version 21.0.7
## Entwicklungsumgebung 
IntelliJ IDEA Ultimate Edition

# Benutzung des Adressbuchs
## Anlegen eines leeren Addressbuchs
Ein leeres Addresbuch wird über aufrufen des leeren Konstruktors angelegt. (new Addressbuch())

## addContact()
Über die Funktion addContact kann dem Addressbuch interaktiv über das Terminal ein Kontakt hinzugefügt werden.

Der User wird zunächst gebeten, anzugeben, ob er eine Person (Eingabe: 1) oder eine Firma (Eingabe: 2) anlegen möchte.

Nach einer gültigen Eingabe wirde der User nach und nach gebeten, die benötigten Informationen einzugeben. Für Name und Addresse werden dabei keine Einschränkungen gemacht, jede Eingabe ist gültig.

Bei ungültiger Eingabe auf die Frage, welche Form von Kontakt angelegt werden sool, erfpolgt ein Hinweis ("Please enter a valid option") und die Funktion wird neu gestartet.

## deleteContact()
Über die Funktion deleteContact() kann ein beliebiger Kontakt interaktiv gelöscht werden.

Zunächst werden alle Kontakte numeriert ausgegeben. Der User wird danach aufgefordert, als Zahl anzugeben welcher der Kontakte gelöscht werden soll. Mit der Eingabe -1 wird die Funktion abgebrochen. Bei ungültiger Eingabe erfolgt ein Hinweis und die Funtion wird neu gestartet.

Bei gültiger Eingabe einer Zahl wird der entsprechende Kontakt gelöscht, eine weitere Interaktion erfolgt nicht.

## search(String s)
Über die Funktion search(String s) werden alle Kontakte leserlich auf der Konsole übergeben, die den übergebenen String in irgendeiner Form enthalten. Enthält das Addressbuch keine Kontakte oder enthält keiner der Kontakte den Suchstring wird der Hinweis "No such Contacts." ausgegeben.

## printContacts()
Die Funktion printContacts() gibt alle Kontakte leserlich auf der Konsole aus. Enthält das Addressbuch keine Kontakte, wird der Hinweis "No contacts" ausgegeben.

# Annahmen
Wir haben keinerlei Annahmen gemacht, die nicht aus der Aufgabenstellung hätten abgeleitet werden können. 

Es gibt keine ungültigen Eingaben, ein Name, eine Addresse, ein ganzer Kontakt können letztlich "leer" sein. Bei allen Attributen handelt es sich lediglich um Strings, werden sie nicht übergeben, so werden sie mit dem leeren String gefüllt. Ungültige Eingaben gibt es nicht.