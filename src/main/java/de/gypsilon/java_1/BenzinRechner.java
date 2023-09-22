package de.gypsilon.java_1;

import java.util.Scanner;

public class BenzinRechner {
    public static void benzinRechner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter bitte wie viel Kilometer haben Sie gefahren:");
        double gefahreneKilometers=scanner.nextDouble();

        System.out.println("Enter bitte wie viel Benzin haben Sie verbraucht:");
        double verbrauchteBenzin=scanner.nextDouble();

        double ergebniss = (verbrauchteBenzin/gefahreneKilometers)*100 ;
        System.out.println("Durchschnitlicheverbrauch ist (Benzin/weg)*100: ("+verbrauchteBenzin+"/"+gefahreneKilometers+")*100="+ergebniss+"l/100km");
    }
}
