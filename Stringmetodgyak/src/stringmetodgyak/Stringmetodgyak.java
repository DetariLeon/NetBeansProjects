/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmetodgyak;

/**
 *
 * @author user3
 */
public class Stringmetodgyak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,nevkezdet = 0 ,nevvege = 0;
        String szoveg = "A Diak objektuma (Vad Alma) példányosítás útján jön létre.";
        nevkezdet = szoveg.indexOf('(');
        nevvege = szoveg.indexOf(')');
        String nev = szoveg.substring(nevkezdet + 1, nevvege).trim().toUpperCase();
        System.out.println(nev);
        
        System.out.println(nev.replace("ALMA", "KÖRTE"));
        
        String email = nev.toLowerCase().replace(" ", ".").concat(".2022i@bankitatabanya.hu");
        System.out.println(email);
        System.out.println(nev.length());

        String ujszoveg = "Sok lúd disznót győz.";
        System.out.println(ujszoveg.length());
        System.out.println(ujszoveg.startsWith(""));
        System.out.println(ujszoveg.contains("lúd"));
        System.out.println(ujszoveg.indexOf("lúd"));
        System.out.println(ujszoveg.replace("lúd", "veréb"));
        

        
        
        
        
        
        
        
        
        
    }
    
}
