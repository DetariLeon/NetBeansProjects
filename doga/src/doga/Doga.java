/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doga;

/**
 *
 * @author user3
 */
public class Doga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] szamok = new int[]{3,2,15,4,42,3};
        int paratlan=0;
        int i;
        for(i=0;i<szamok.length;i++){
        if(szamok[i] % 2!=0){
        paratlan++;
        }
        }
        System.out.println(paratlan);
        
        int osszeg=0;
        for(i=0;i<szamok.length;i++){
        osszeg = osszeg +szamok[i];
        
        }
        System.out.println(osszeg);
        
        
        int min=szamok[0];
        for(i=1;i<szamok.length;i++){
        if(szamok[i]<min){
        min=szamok[i];   
        }
        }
        System.out.println(min);
        
        int kozott=0;
        for(i=0;i<szamok.length;i++){
        while(szamok[i]>=10 || szamok[i]<=20){
            kozott++;
        }
        }
        System.out.println(kozott);
        
        
    }
    
}
