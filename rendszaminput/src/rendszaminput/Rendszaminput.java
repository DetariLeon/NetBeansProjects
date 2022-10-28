/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rendszaminput;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Rendszaminput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        
        String[] rendszam= new String[6];
        Scanner bill = new Scanner(System.in);
        for(int i=0; i< rendszam.length;i++){
        System.out.println("Adjál meg egy rendszamot:");
        rendszam[i] = bill.nextLine();
        }
        
        
        
        
        
        
        
        
    }
    
}
