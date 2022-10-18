/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orai1011;

import java.util.Random;

/**
 *
 * @author user3
 */
public class Orai1011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] szam = new int[10];
        int paros = 0;
        int negy = 0;
        int osszeg = 0;
        int ot = -1;
        int max = szam[0];
        int min = szam[0];
       
       
        for (int i = 0; i < 10; i++) {
            szam[i] = (int) (Math.random() * 10) + 1;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(szam[i] + " ");
            osszeg += szam[i];
            if (szam[i] % 2 == 0) {
                paros++;
            }
            if (szam[i] % 4 == 0) {
                negy++;
            }
           
            if (szam[i] < 5 && ot == -1) {
                ot= i;
            }
        }
       
        if (ot == -1) {
            System.out.println("\nNincs 5-nel kisebb szam");
        }
        else {
            System.out.println("\nAz elso otnel kisebb szam helye:" + ot);
            
        }
        for( int i = 1; i < szam.length; i++ )
        {
        if( szam[i] > szam[max] ) max = szam[i];
        }
        for( int i = 1; i  < szam.length; i++ )
        {
        if( szam[i] < szam[min] ) min = szam[i];
        }
        
        
        System.out.println("A tombben levo legnagyobb szam: "+szam[max]);
        System.out.println("A tombben levo legkisebb szam: "+szam[min]);
        System.out.println("Ossz: " + osszeg);
        System.out.println("Paros : " + paros );
        System.out.println("4-gyel oszthato : " + negy );
      }  
        
        
        
        
        }
        
        
        
        
        
        
        
        
        
    
    

