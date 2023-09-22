package de.gypsilon.java_1;

import java.util.Scanner;

import static java.lang.Math.random;

/*
Programmieren Sie folgendes Spiel (LS02_RateZahl):
Der Computer "merkt" sich eine Zufallszahl zwischen 0 und 15, die der Spieler (Benutzer) erraten soll.
Nach jedem falschen Versuch gibt der Computer an, ob die eingegebene Zahl zu klein oder zu groß war.
Das Spiel geht solange, bis die Zahl erraten wurde.
Am Schluss soll ausgegeben werden, wie viele Runden der Benutzer gebraucht hat, um die Zahl zu erraten.
*/
public class RateZahl {
    public static void rateZahl() {

        int randomZahl = (int) (Math.random() * 16);
        System.out.println(randomZahl);
        Scanner scanner = new Scanner(System.in);
        int userZahl = 0;
        int rundeZahler = 0;

        do {
            System.out.println("Enter Zahl: ");
            userZahl = scanner.nextInt();
            if (userZahl == randomZahl) {
                System.out.println("Sie haben erraten!");
                rundeZahler++;
                System.out.println("Sie haben " + rundeZahler + " Runde/en gemacht.");
            } else {
                System.out.println("Falsch:(");
                if (userZahl > randomZahl) {
                    System.out.println("zu groß");
                } else System.out.println("zu klein");
            }
            rundeZahler++;
        }
        while (userZahl != randomZahl);

    }
}
