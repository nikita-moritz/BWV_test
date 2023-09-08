package de.gypsilon;

import java.util.Scanner;

public class Vorname {
    public static void vorname(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name please: ");
        String vorname = scanner.next();
        for (int i = vorname.length() - 1; i >= 0; i--) {
            System.out.print(vorname.charAt(i));
        }


    }
}
