package de.gypsilon.java_1;

/*Kniffler-Aufgabe: LS01_Zahnbürsten:
        Ein Bestellmengenrabatt für Zahnbürsten soll berechnet werden. Der Preis einer Zahnbürste ist im Programm mit 2,50 Euro festgelegt.
        Der Benutzer gibt ein:
            - die gewünschte Bestellmenge
            - Kategorie weich, mittelhart oder harte Borsten
            - Griffbezeichnung groß, normal oder kinder
        Ab einer Bestellmenge von 500 Stück soll ein Rabatt von 5% vom gesamten Bestellwert errechnet werden. Ab 20.000 Stück gibt es einen Großmengenrabatt von 10%.
        Es gilt weiterhin:
        Reduzierung des Preises um
            - weitere 5% wenn w und k,
            - weitere 2% bei sonstigen k,
            - nur weitere 1% bei w wenn Größen n oder g,
        Erhöhung des Preises um
            - 2.5% bei h und n,
            - 5% bei h und g.
        Die Prozentsätze der weiteren Reduzierungen/Erhöhungen beziehen sich auf die bereits rabattierten Beträge.
        Der Benutzer soll über die Höhe des Rabatts wie auch über den zu zahlenden Preis informiert werden.*/

import java.util.Objects;
import java.util.Scanner;

public class KnifflerAufgabe {
    public static void knifflerAufgabe() {

        double preis = 2.5;
        double bestellMengeRabatt = 0;
        double preisWechsel = 0;
        double gesamtPreis = 0;
        double gesamtPreisMitRabatt = 0;
        double rabbattSatzt = 0;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Bestellmenge: ");
        int bestellmenge = userInput.nextInt();
        userInput.nextLine();
        System.out.println("Enter Borsten Kategorie(w-eich, m-ittelhart oder h-arte): ");
        String kategorie = userInput.nextLine();
        System.out.println("Enter Griffbezeichnung(g-ross, n-ormal oder k-inder): ");
        String griffbezeichnung = userInput.nextLine();
        userInput.close();

        gesamtPreis = bestellmenge * preis;
        System.out.println("Gesamtpreis: " + gesamtPreis + " €");

        //BestellmengeRabatt Schritt 1
        if (bestellmenge < 500) {
            bestellMengeRabatt = 0;
        } else if (bestellmenge < 20000) {
            bestellMengeRabatt = -0.05;
        } else bestellMengeRabatt = -0.1;
        gesamtPreisMitRabatt = gesamtPreis * (1 + bestellMengeRabatt);
        System.out.println("Bestellmengerabatt: " + bestellMengeRabatt * 100 + " %");
        System.out.println("Gesamtpreis mit Bestellmengerabatt: " + gesamtPreisMitRabatt + " €");

        //Reduzierung/Erhoehung Schritt2
        if (Objects.equals(kategorie, "w") && Objects.equals(griffbezeichnung, "k")) {
            preisWechsel = -0.05;
        } else if (Objects.equals(griffbezeichnung, "k")) {
            preisWechsel = -0.02;
        } else if (Objects.equals(kategorie, "w") && (Objects.equals(griffbezeichnung, "n") || Objects.equals(griffbezeichnung, "g"))) {
            preisWechsel = -0.01;
        } else if (Objects.equals(kategorie, "h") && Objects.equals(griffbezeichnung, "n")) {
            preisWechsel = 0.025;
        } else if (Objects.equals(kategorie, "h") && Objects.equals(griffbezeichnung, "g")) {
            preisWechsel = 0.05;
        }

        String rabattOderErhoehung = "Reduzierung";
        if (preisWechsel == 0) {
            rabattOderErhoehung = "Kein Rabatt/Erhoehung";
        } else if (preisWechsel > 0) {
            rabattOderErhoehung = "Erhoehung";
        }
        System.out.println(rabattOderErhoehung + ": " + (preisWechsel*100) + " %");

        gesamtPreisMitRabatt = gesamtPreisMitRabatt * (1 + preisWechsel);
        double rabattIst = gesamtPreis - gesamtPreisMitRabatt;
        rabbattSatzt = (gesamtPreisMitRabatt / gesamtPreis) * 100;
        if (gesamtPreisMitRabatt < gesamtPreis) {
            rabattOderErhoehung = "Reduzierung";
        } else if (gesamtPreisMitRabatt == gesamtPreis) {
            rabattOderErhoehung = "Kein Rabatt/Erhoehung";
        } else rabattOderErhoehung = "Erhoehung";

        System.out.println(rabattOderErhoehung + " in Euro: " + rabattIst + " €\n" +
                "*************************************************************\n" +
                rabattOderErhoehung + " in Prozen: " + (100 - rabbattSatzt) + "%\n" +
                "Gesamstpreis mit Rabatt: " + gesamtPreisMitRabatt+ " €");


    }
}
