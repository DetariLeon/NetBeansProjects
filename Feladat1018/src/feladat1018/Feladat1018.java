/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat1018;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Feladat1018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //2.
        String firstName;
        String lastName;
        String classId;
        String szokozhely;
        String fullname;
        Scanner bill = new Scanner(System.in);
        System.out.println("Diák neve:");
        fullname= bill.nextLine();
        //2.
        firstName= fullname.split(" ")[0];
        lastName = fullname.split(" ")[1];
        
        System.out.println("Osztály azonosító:");
        classId = bill.next();
       //3.
        int evfolyam = Integer.parseInt(classId.substring(0, 4));
        if(evfolyam <2022) classId = classId.toUpperCase();
        //4.
        if(classId.equals(classId.toUpperCase()))
            
        
        
        
        System.out.println(fullname);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(classId.replaceFirst("e","E"));
        System.out.println(classId);
        System.out.println("Estis osztály");
        
        
        
        
        
        
        
        
    }
    
}
