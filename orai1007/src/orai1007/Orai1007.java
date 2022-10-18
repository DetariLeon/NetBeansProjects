/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orai1007;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author user3
 */
public class Orai1007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Elöltesztelő:
        Scanner bill = new Scanner(System.in);
        int szam = 0;
        System.out.println("Adj meg egy nullánál nagyobb számot:");
        bill.nextInt();
        while(!(szam > 0 && szam % 2 == 0)) {
            System.out.println("Adj meg egy nullánál nagyobb számot:");
            szam=bill.nextInt();
               
        }
        //Hátultesztelő:
        do{
            System.out.println("Adj meg egy nullánál nagyobb számot:");
            szam=bill.nextInt();   
        }while(!(szam > 0 && szam % 2 == 0));
        

        int randomSzam = (int)(Math.random() * 7) + (1);
        System.out.println("Adj meg egy számot 1-10 között");
        System.out.println(randomSzam);
        
        while (szam != randomSzam){
            System.out.println("nem talaltad ki");
            szam=bill.nextInt();
        }
       
        
        
    } 
        
    }

    

