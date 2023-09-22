package de.gypsilon.java_1;
/*A.	LS01_Kindergeld.java
        Eine Familie erhält nach folgender einkommensabhängiger Tabelle Kindergeld.
        Schreiben Sie ein Programm, welches nach Eingabe der Kinder und des Einkommens das Kindergeld berechnet:
        Einkommen:	< 45000	ab 45000
        für das 1. Kind	70	70
        für das 2. Kind	130	70
        für das 3. Kind	220	140
        ab dem 4. Kind	240	140
        Kontrolle:
        Jahreseinkommen: 47900
        Anzahl der Kinder: 3
        Ergebnis: 280 Euro Kindergeld*/

import java.util.Scanner;

public class Kindergeld {
    public static void kinderGeld() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Kinderzahl: ");
        int kinderZahl = scanner.nextInt();
        System.out.println("Enter Einkommens: ");
        double einkommens = scanner.nextDouble();
        double kindergeld = 0;
        double kindergeldGesamt = 0;
        if (einkommens < 45000) {
            int kind = 0;
            for (int i = 1; i <= kinderZahl; i++) {
                kind = 1;
                switch (kind) {
                    case 0:
                        kindergeld = 0;
                        System.out.println("to do::Kinder!");
                        break;
                    case 1:
                        kindergeld = 70;
                        break;
                    case 2:
                        kindergeld = 130;
                        break;
                    case 3:
                        kindergeld = 120;
                        break;
                    default:
                        kindergeld = 240;
                }
                kindergeldGesamt = kindergeldGesamt + kindergeld;
            }
            System.out.println("Kindergeld wird :" + kindergeldGesamt + "€");
        } else {
            if (einkommens < 45000) {
                int kind = 0;
                for (int i = 1; i <= kinderZahl; i++) {
                    kind = 1;
                    switch (kinderZahl) {
                        case 0:
                            kindergeld = 0;
                            System.out.println("to do::Kinder!");
                            break;
                        case 1:
                            kindergeld = 70;
                            break;
                        case 2:
                            kindergeld = 70;
                            break;
                        default:
                            kindergeld = 140;
                    }

                    kindergeldGesamt = kindergeldGesamt + kindergeld;
                }
                System.out.println("Kindergeld wird :" + kindergeldGesamt + "€");
            }
        }
    }
}