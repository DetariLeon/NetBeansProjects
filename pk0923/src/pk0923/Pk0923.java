/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk0923;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Pk0923 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
    Scanner bill = new Scanner(System.in);
        System.out.println("Haromszog oldala:");
        System.out.print("");
        int a;
        a = bill.nextInt();
        System.out.print("");
        int b;
        b = bill.nextInt();
        System.out.print("");
        int c;
        c = bill.nextInt();
        if (a * b > c && a * c > b && b * c > a) {
            System.out.println("Derékszögü");
       
        } else {
                System.out.println("Nem derékszögü");
        }
    }
}

        
    
        
        
    
    
        
        
        