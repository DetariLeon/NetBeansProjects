/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orai1118;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Orai1118 {

    public static boolean SzI(String SzI) {
        String betuk = "";

        for (int i = 0; i < SzI.length(); i++) {
            if (Character.isLetter(SzI.charAt(i))) {
                if (Character.isUpperCase(SzI.charAt(i))) {
                    betuk = betuk + "u";
                } else if (Character.isLowerCase(SzI.charAt(i))) {
                    betuk = betuk + "l";
                } else {
                    return false;
                }
            } else if (Character.isDigit(SzI.charAt(i))) {
                betuk = betuk + "d";
            } else {
                return false;
            }
        }
        switch (betuk) {
            case "ddddduu":
                return true;
            case "dddddlu":
                return true;
            case "uuddddd":
                return true;
            default:
                return false;
        }

    }

    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        String SzemIg = "";
        do {
            System.out.println("Személyi igazolvány szám:");
            SzemIg = bill.next();

        } while (SzI(SzemIg));
        System.out.println("");
    }

}
