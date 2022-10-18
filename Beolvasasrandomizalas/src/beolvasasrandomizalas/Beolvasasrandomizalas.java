/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beolvasasrandomizalas;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Beolvasasrandomizalas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner bill = new Scanner(System.in);
        
        
        
        
        
        //Adat beolvasás billenyűzetről - egész szám
        System.out.println("Adj meg egy egész számot:");
        int szam;
        szam = bill.nextInt();
        System.out.println("A beolvasott érték:" + szam);
        
        System.out.println("Adj meg egy egész számot:");
        float szam2;
        szam2 = bill.nextFloat();
        System.out.println("A beolvasott érték:" + szam2);
        
        System.out.println("Egy szó:");
        String szo;
        szo = bill.next();
        System.out.println("A beolvasott szó:" + szo);
        
        //Random szám generálás:
        //(Math.random() * intervallum_mérete) + alsó;
        int randomSzam = (int)(Math.random() *21);//0-20 közötti szám
        System.out.println(randomSzam);
        System.out.println((int)(Math.random() * 71) + (-55));
        System.out.println((int)(Math.random() * 46) + (-40));
        System.out.println((int)(Math.random() * 166) + (-50));
        System.out.println((int)(Math.random() * 26) + (-45));


    }
    
}
