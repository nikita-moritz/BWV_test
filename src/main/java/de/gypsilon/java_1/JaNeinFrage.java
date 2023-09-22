package de.gypsilon.java_1;

import java.util.Objects;
import java.util.Scanner;

public  class JaNeinFrage {

    public static boolean jaNeinFrage() {
        boolean antwort;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter >> y << für JA oder >> n << für NEIN");
        String userInput = myObj.nextLine();
        if (Objects.equals(userInput, "y")){
            return antwort = true;
        } else {
            System.out.println("Ende");
            return  antwort = false;
        }
    }
}
