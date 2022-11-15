/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package araylistpelda;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author user3
 */
public class ArayListPelda {

    public static void main(String[] args) {
        ArrayList<Integer> szamok = new ArrayList<>();
        Random rand = new Random();
        int i;
        for (i = 0; i < 10; i++) {
            szamok.add(rand.nextInt(10) + 10);
        }
        for (i = 0; i < szamok.size(); i++) {
            System.out.print(szamok.get(i) + " ");
        }
        System.out.println("");
        szamok.add(25);
        for (i = 0; i < szamok.size(); i++) {
            System.out.print(szamok.get(i) + " ");
        }
        System.out.println("");
        int parosDb = 0;
        for (i = 0; i < szamok.size(); i++) {

            if (szamok.get(i) % 2 == 0) {
                parosDb++;

            }

        }
        System.out.println(parosDb);
    }

}
