/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karaktermetodusok;

/**
 *
 * @author user3
 */
public class KarakterMetodusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char kar = 'A';
        //Alfabetikus-e
        System.out.println(Character.isAlphabetic(kar));
        //Szám-e
        System.out.println(Character.isDigit(kar));
        //Betű
        System.out.println(Character.isLetter(kar));
        //betű vagy szám-e
        System.out.println(Character.isLetterOrDigit(kar));
        //kisbetű-e
        System.out.println(Character.isLowerCase(kar));
        //nagybetű-e
        System.out.println(Character.isUpperCase(kar));
        //szóköz-e
        System.out.println(Character.isSpaceChar(kar));
        //whitespace karakter-e
        System.out.println(Character.isWhitespace(kar));
        //kisbetűsítés
        System.out.println(Character.toLowerCase(kar));
        //Nagybetűsítés
        System.out.println(Character.toUpperCase(kar));
        
        
        
        
        

    }
    
}
