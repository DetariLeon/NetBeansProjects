/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elagazas;

import java.util.Random;

/**
 *
 * @author user3
 */
public class Elagazas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //egyágú elágazás
        int szam = 25;
        if (szam > 20){
            System.out.println("Nagyobb");
            System.out.println("És a szám duplája: "+ szam*2);                
        }
        else{
            System.out.println("Nem nagyobb");
        }
        
        ///többágú
        if (szam > 25){
            System.out.println("Nagyobb");
            System.out.println("És a szám duplája: "+ szam*2);                
        }
        else if (szam < 20){
            System.out.println("Kisebb");
        }
        else{
            System.out.println("Egyenlő");
        }
        
        
        //sok ágú
        int honap = 13;
        switch(honap){
            case 1:System.out.println("Január");break;
            
            case 10:System.out.println("Október");break;
            case 11:System.out.println("November");break;
            case 12:System.out.println("December");break;
            default : System.out.println("Nem meghatározható");
            
        }
        //FELADAT:
        //random generáltassunk egy karaktert!(angol abc szerint)
        Random betu = new Random();
        char c = (char)(betu.nextInt(26) + 'a');
        System.out.println(c);
        int randomCharCode = (int)(Math.random()* 26)+97;//97-122
        System.out.println(randomCharCode);
        System.out.println((char)randomCharCode);
        
        //deklarácio
    }
    
}
