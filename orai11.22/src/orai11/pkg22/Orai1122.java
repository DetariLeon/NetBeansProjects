/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orai11.pkg22;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Orai1122 {

    public static int LegKiss(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    public static char KozBetu(String Kozep) {
        return Kozep.charAt(Kozep.length() / 2);
    }

    public static int MagHan(String Maganhang) {
        int mghang = 0;
        for (int i = 0; i < Maganhang.length(); i++) {
            if (Maganhang.charAt(i) == 'a' || Maganhang.charAt(i) == 'e' || Maganhang.charAt(i) == 'i' || Maganhang.charAt(i) == 'o' || Maganhang.charAt(i) == 'u') {
                mghang++;
            }
        }
        return mghang;
    }

    public static int Szavak(String Szo) {
        return Szo.split(" ").length;
    }

    public static boolean NovSor(int d, int e, int f) {
        if (d > e && e > f) {
            return false;
        } else {
            return true;
        }
    }

    public static int Ossze(int g) {
        int i, osszeg = 0;
        for(i=0;i<String.valueOf(g).length();i++){
            osszeg=osszeg+ Integer.valueOf(String.valueOf(g).charAt(i)-48);
           
        }
        return osszeg;
    }

    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        int a, b, c, d, e, f, g;
        String Kozep, Maganhang, Szo;
        System.out.println("Adjál meg három számot:");
        a = bill.nextInt();
        b = bill.nextInt();
        c = bill.nextInt();
        System.out.println(LegKiss(a, b, c));

        System.out.println("Adjál meg egy mondatot:");
        Kozep = bill.next();
        System.out.println(KozBetu(Kozep));

        System.out.println("Adjal meg egy szót:");
        Maganhang = bill.next();
        System.out.println(MagHan(Maganhang));

        System.out.println("Mondat:");
        Szo = bill.next();
        System.out.println(Szavak(Szo));

        System.out.println("Adjál meg három számot:");
        d = bill.nextInt();
        e = bill.nextInt();
        f = bill.nextInt();
        System.out.println(NovSor(d, e, f));

        System.out.println("Szam:");
        g = bill.nextInt();
        System.out.println(Ossze(g));

    }

}
