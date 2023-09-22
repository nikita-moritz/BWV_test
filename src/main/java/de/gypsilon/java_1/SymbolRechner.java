package de.gypsilon.java_1;

import java.util.Scanner;

public class SymbolRechner {

    //public static boolean restart = false;

    public static void symbolRechner() {
        //public boolean symbolRechner() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Type was");
        String userInput;
        userInput = myObj.nextLine();
        int stringLegth = 0;
        stringLegth = userInput.length();
        if (stringLegth < 11) {

            switch (stringLegth) {
                case 1:
                    System.out.println("1 Symbol");
                    break;
                case 2:
                    System.out.println("2 Symbol");
                    break;
                case 3:
                    System.out.println("3 Symbol");
                    break;
                default:
                    System.out.println("Mehr als 3 Symbol und weniger als 11");
                    System.out.println("Möchten Sie weiter spielen?");
                    JaNeinFrage.jaNeinFrage();

            }

        } else if (stringLegth > 10 || stringLegth < 21) {
            switch (stringLegth) {
                case 11:
                    System.out.println("11 Symbol");
                    break;
                case 12:
                    System.out.println("12 Symbol");
                    break;
                case 13:
                    System.out.println("13 Symbol");
                    break;
                default:
                    System.out.println("Mehr als 13 Symbol und weniger als 21");
                    //return restart = false;
            }
        } else {
            System.out.println("Mehr als 20 Symbol");
        }
        if (JaNeinFrage.jaNeinFrage()){
            symbolRechner();
        }

    }
}
