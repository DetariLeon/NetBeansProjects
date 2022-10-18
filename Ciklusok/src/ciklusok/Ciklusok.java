/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciklusok;

/**
 *
 * @author user3
 */
public class Ciklusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        //növekmények ciklus(FOR)
        for ( i = 0; i<5; i++){
        System.out.println(i);
    }
        //FOR viszzafelé
        for ( i = 4; i > -1; i--){
        System.out.println(i);
    }
        //FOR kettesével
        for ( i = 0; i < 5; i+=2){
        System.out.println(i);
    }
        
      //Elöltesztelő ciklus
      int szam = 5;
      while(szam < 5){
          System.out.println(szam);
          szam++;
      
      }
      //FELADAT: generáljunk 1-20 között ehy páros számot
      int parosSzam = 1;
      while(szam < 5){
          System.out.println(szam);
          szam++;
      }
      
      
        
                
       
        
        
        
        
        
    }
}
