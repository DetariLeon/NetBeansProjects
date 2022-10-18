/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orai1018;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Orai1018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        System.out.println("Adjal meg 2 pozitív egész számot:");
        int x;
        x = bill.nextInt();
        int y;
        y = bill.nextInt();
        
        int a = x;
        int b = y;
        while(a!=b){
            if (a > b){
            a = a-b;
            }
            else b= b-a;
        }
        int LNKO = a;
        System.out.println(LNKO);
        
        System.out.println("LKKT;"+x*y/LNKO);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    }
}
