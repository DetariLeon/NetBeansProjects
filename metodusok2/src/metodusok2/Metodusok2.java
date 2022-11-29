/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodusok2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author user3
 */
public class Metodusok2 {

    public static boolean paros(int a) {

        int i = 0, ell = 0;

        for (i = 0; i < String.valueOf(a).length(); i++) {
            if (Integer.valueOf(String.valueOf(a).charAt(i)) % 2 == 0) {
                ell++;
            }
        }
        if (String.valueOf(a).length() == ell) {
            return true;
        }
        return false;

    }

    public static boolean kozep(int a, int b, int c) {
        ArrayList<Integer> szamok = new ArrayList<Integer>();
        szamok.add(a);
        szamok.add(b);
        szamok.add(c);
        Collections.sort(szamok);

        if ((szamok.get(0) + 1) + szamok.get(1) == szamok.get(2) && szamok.get(2) - szamok.get(1) == (szamok.get(0) + 1)) {
            return true;
        } else {
            return false;
        }

    }

    public static void Matrix(int n) {
        Random rand = new Random();

        int a, i;
        String matrixCode = "";
        
        for (i = 0; i < n; i++) {
            for (a = 0; a < 5; a++) {
                if (rand.nextInt(2) == 1) {
                    matrixCode = matrixCode + "0    ";
                } else {
                    matrixCode = matrixCode + "1    ";
                }
            }
            System.out.println(matrixCode);
            matrixCode = "";

        }
    }

    public static void main(String[] args) {
        System.out.println(paros(22));
        System.out.println(kozep(2, 5, 8));
        Matrix(5);
    }

}
