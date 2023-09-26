package de.gypsilon.java_2;

import java.util.Scanner;

/*Aufgabe 2
Erstelle zwei Eingabemethoden in einer Klasse TemperaturUtilities des Projekts LS02_Temperatur.
Schreiben Sie Testaufrufe in einer Main-Methode.
1.	Eine soll mit Hilfe einer zu übergebenden Eingabeaufforderung ein Zeichen vom User einlesen.
2.	Eine soll mit Hilfe einer zu übergebenden Eingabeaufforderung eine Dezimalzahl vom User einlesen.
*/
public class TemperaturUtilities {

    public static String zeichenEingabemethoden() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Zeichen");
        return userInput.nextLine();
    }

    public static double dezimalzahlEingabemethoden() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Dezimalzahl");
        return userInput.nextDouble();
    }

    public static double zahlEingabemethoden() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Zahl");
        return userInput.nextInt();
    }

//Die Methoden in class Main aufrufen
/*public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(TemperaturUtilities.zeichenEingabemethoden());
        System.out.println(TemperaturUtilities.dezimalzahlEingabemethoden());
    }
}*/


    /*
    Aufgabe 3
    Erstelle in der Klasse TemperaturUtilities, eine oder mehrere Methoden,
    welche die geforderten Umrechnungen ermöglichen:
    Formeln:
    Gradzahl in °C = (Gradzahl in °F -32)/ 1,8
    Gradzahl in °F = Gradzahl in °C *1,8  + 32
    In Kelvin: K = Gradzahl in °C + 273,15
    */
    public static double gradZahlFahrenheitInCelsius() {
        System.out.println("Enter Zahl in Fahrenheit -> Celsius");
        double zahl = dezimalzahlEingabemethoden();
        zahl = (zahl - 32) / 1.8;
        return zahl;
    }

    public static double gradZahlCelsiusInFahrenheit() {
        System.out.println("Enter Zahl in Celsius -> Fahrenheit");
        double zahl = dezimalzahlEingabemethoden();
        zahl = zahl * 1.8 + 32;
        return zahl;
    }

    public static double gradZahlCelsiusInKelvin() {
        System.out.println("Enter Zahl in Celsius -> Kelvin");
        double zahl = dezimalzahlEingabemethoden();
        zahl = zahl + 273.15;
        return zahl;
    }

    /*Aufgabe 4
Erstelle eine Methode, welche das Menü der zur Verfügung stehenden Funktionen anzeigt
und eine der in Aufgabe 2 erstellten Methoden nutzt,
um die Auswahl des Benutzers einzulesen.
Mit Hilfe der Menüauswahl soll in main dann die gewünschte Operation durchgeführt werden.
Wiederhole das solange der Benutzer das möchte.
*/
    public static void menueauswahl() {
        System.out.println("Was möchten Sie umrechnen? c-Celsius, f-Fahrenheit, k-Kelvin");
        String einheit1 = zeichenEingabemethoden();
        System.out.println("In welche Einheit möchten Sie umrechnen? c-Celsius, f-Fahrenheit, k-Kelvin");
        String einheit2 = zeichenEingabemethoden();

        if (einheit1.equals("f") && einheit2.equals("c")) {
            System.out.println(TemperaturUtilities.gradZahlFahrenheitInCelsius() + " Celsius");
        } else if (einheit1.equals("c") && einheit2.equals("f")) {
            System.out.println(TemperaturUtilities.gradZahlCelsiusInFahrenheit() + " Fahrenheit");
        } else if (einheit1.equals("c") && einheit2.equals("k")) {
            System.out.println(TemperaturUtilities.gradZahlCelsiusInKelvin() + " Kelvin");
        }
        System.out.println("Solche Variant momentan nicht möglich.");

        System.out.println("Möchten Sie noch mal rechnen? j oder n");
        Scanner userInput = new Scanner(System.in);
        String jaNeinFrage = userInput.nextLine();
        while (jaNeinFrage.equals("j")) {
            menueauswahl();
            jaNeinFrage = "n";
        }

    }
    //Die Methoden in class Main aufrufen
/*public class Main {
    public static void main(String[] args) {

    TemperaturUtilities.menüauswahl();
    }
}*/

    /*
    Aufgabe 5
    Erstelle eine Methode, welche eine Zahl auf eine angegebene Anzahl Nachkommastellen rundet.
        Die Methode Math.round() rundet auf volle Ganzzahlen.
        Beispiel zum Runden auf 2 Nachkommastellen: 123,456
     123.456*100 = 12345.6
     gerundete Ganzzahl: 12346
    12345 /100.0 = 123,46 = 12.3%
    */
    public static double zahlRunden(double zahl) {
        System.out.println("Wie viel Zahlen nach der Komma möchten Sie Haben? Maximal Rundung bis Vier!");
         int rundeZahl= (int) zahlEingabemethoden();
        switch ( rundeZahl){
            case 1:
                zahl = (Math.round(zahl * 10));
                zahl = zahl / 10;
                break;
            case 2:
                zahl = (Math.round(zahl * 100));
                zahl = zahl / 100;
                break;
            case 3:
                zahl = (Math.round(zahl * 1000));
                zahl = zahl / 1000;
                break;
            case 4:
                zahl = (Math.round(zahl * 10000));
                zahl = zahl / 10000;
                break;
            default:
                System.out.println("Maximal Rundung bis Vier ");
        }
        return zahl   ;

    }

}