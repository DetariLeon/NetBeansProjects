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
        //keresett karakterek pozicioja
        System.out.println(szoveg.indexOf("t"));
        System.out.println(szoveg.indexOf("egy"));
        //keresett karakterek utolso pozicioja
        System.out.println(szoveg.lastIndexOf("t"));
        //string üres-e (boolean)
        System.out.println(szoveg.isEmpty());
        String szoveg2= "";
        System.out.println(szoveg2.isEmpty());
        //lecseréli a szövegben az összes! megadott karakter(ek) más karakter(ek)re
        System.out.println(szoveg.replace("tetszőleges", "akármilyen"));
        System.out.println(szoveg.replace("e", "b"));

        //lecseréli a szövegben az első! megadott karakter(ek) más karakter(ek)re
        System.out.println(szoveg.replaceFirst("e", "b"));
        //String szétszedése tömbbe megadott karakter mentén
        System.out.println(szoveg.split(" "));
        
        //Integer szam = 512;
        //System.out.println(szam.toString());
        
        //stringből substring kivétele
        System.out.println(szoveg.substring(3));
        System.out.println(szoveg.substring(3,6));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
