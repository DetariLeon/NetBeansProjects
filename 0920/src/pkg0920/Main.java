/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0920;


import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        for (int szam =0;szam<10;szam++){
            System.out.println("Hello");    
        }
        Scanner bill = new Scanner(System.in);{
        System.out.println("Adj meg egy egész számot:");
        int szam;
        szam = bill.nextInt();
        System.out.println(szam % 2 == 0);
    }
        for (int szam=0;szam < 5; szam++){
        System.out.print(szam+"\t");
        
        }
        for(int i = 0;i >=0;i--){
        System.out.print(i+"    ");
        }
        int szam = 21;
        for( int i = 0;i <=szam; i++){
        if( i % 2 == 0){
        System.out.println(i+" ");
        }
        }
        System.out.println("");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Adj meg egy egész számot:");
        int bekero = input.nextInt();
        while(bekero != szam){
        bekero = input.nextInt();
        }
        
        
        
        
        
        }
        } 
        
        
        
    
    

