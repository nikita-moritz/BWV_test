package de.gypsilon.java_1;

import java.util.Scanner;

/*LS02_Quadrat.java.
Schreiben Sie ein Programm, welches die Seitenlänge eines Quadrats erfragt
und dann ein Quadrat dieser Größe mit Sternchen ausgibt.
Beispiel:
Seitenlänge Quadrat? 3
* * *
* * *
* * **/
public class Quadrat {
    public static void quadrat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie Quadrat größe: ");
        int groesse = scanner.nextInt();

        for (int x = 1; x <= groesse; x++) {
            for (int y = 1; y <= groesse; y++) {
                if ((x == 1 || x == groesse) || (y == 1 || y == groesse) ) {
                    System.out.print(" * ");
                } else System.out.print("   ");
            }
            System.out.print("\n");
        }
    }
}
