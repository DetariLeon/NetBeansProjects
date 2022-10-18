/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orai0930;

/**
 *
 * @author user3
 */
public class Orai0930 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int nap = (int)(Math.random()* 7)+1;
        switch(nap){
            case 1:System.out.println("Hétfő");break;
            case 2:System.out.println("kedd");break;
            case 3:System.out.println("szerda");break;
            case 4:System.out.println("Csütörtök");break;
            case 5:System.out.println("Péntek");break;
            case 6:System.out.println("Szombat");break;
            case 7:System.out.println("Vasárnap");break;
            default : System.out.println("Nincs olyan");
    }
    
    }
}
