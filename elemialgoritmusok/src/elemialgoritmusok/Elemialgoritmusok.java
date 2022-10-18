/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elemialgoritmusok;

import java.util.Random;

/**
 *
 * @author user3
 */
public class Elemialgoritmusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String szoveg="Ez egy tetszőleges szöveg";
        //szöveg hossza
        System.out.println(szoveg.length());
        //adott pozicio levő karakter
        System.out.println(szoveg.charAt(5));
        //minden kisbetű
        System.out.println(szoveg.toLowerCase());
        //minden nagybetű
        System.out.println(szoveg.toUpperCase());
        //sor eleji és sorvégi szóköz levágása
        System.out.println(szoveg.trim().length());
        
        //összehasonlít
        System.out.println(szoveg.compareTo("Ez egy tetszőleges szöveg"));
        System.out.println(szoveg.compareToIgnoreCase("ez egy tetszőleges szöveg"));
        System.out.println(szoveg.equals("Ez egy..."));
        System.out.println(szoveg.equalsIgnoreCase("ez egy tetszőleges szöveg"));

        //Összefűzés
        System.out.println(szoveg.concat(" Ez pedig egy hozzáfűzött"));
        //tartalmaz-e
        System.out.println(szoveg.contains(("tetszőleges")));
        //végződik-e valamivel
        System.out.println(szoveg.endsWith("g"));
       //kezdődik -e valamivel
        System.out.println(szoveg.startsWith("E"));
        
        
    }
    
}
