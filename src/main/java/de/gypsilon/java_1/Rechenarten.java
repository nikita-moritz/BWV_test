package de.gypsilon.java_1;

import java.util.Scanner;

public class Rechenarten {
    public static void rechenarten() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie die erste Ganzzahl ein: ");
        int zahl1 = scanner.nextInt();

        System.out.print("Bitte geben Sie die zweite Ganzzahl ein: ");
        int zahl2 = scanner.nextInt();

        int addition = zahl1 + zahl2;
        int subtraktion = zahl1 - zahl2;
        int multiplikation = zahl1 * zahl2;
        double divisionMitRest = (double) zahl1 / zahl2;
        int ganzzahlDivision = zahl1 / zahl2;
        int restwert = zahl1 % zahl2;


        System.out.println("Ergebnisse:");
        System.out.println("Summe: " + zahl1 + "+" + zahl2 + "5=" + addition);
        System.out.println("Differenz: " + zahl1 + "-" + zahl2 + "=" + subtraktion);
        System.out.println("Produkt: " + zahl1 + "*" + zahl2 + "=" + multiplikation);
        System.out.println("Division mit Nachkommastellen: " + zahl1 + "/" + zahl2 + "=" + divisionMitRest);
        System.out.println("Ganzzahlige Division: " + zahl1 + "/" + zahl2 + "=" + ganzzahlDivision);
        System.out.println("Restwert: " + zahl1 + "%" + zahl2 + "=" + restwert);

        scanner.close();

    }
}
