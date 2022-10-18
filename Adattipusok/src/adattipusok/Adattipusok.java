/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adattipusok;

/**
 *
 * @author user3
 */
public class Adattipusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //egész számok
        byte homerseklet = 19;
        short magassag = 165;
        int fizetes = 850000;
        long nyeremeny = 2500000000L;
        //valós számok
        float tomeg = 44333.569874521F;
        double ezEgyValosSzam = 23141412.21415124;
        //karakter 
        char egyBetu = 'k';
        char masikBetu = '\u0041';//a karakter kódja hexadecimális
        //logikai
        boolean vane = false;
        //változók értékeinek kiíratása
        System.out.println(homerseklet);
        System.out.println(magassag);
        System.out.println(fizetes);
        System.out.println(nyeremeny);
        System.out.println(tomeg);
        System.out.println(ezEgyValosSzam);
        System.out.println(egyBetu);
        System.out.println(masikBetu);
        System.out.println((int)masikBetu);
        System.out.println(vane);
        
        //adattípusok tartomány
        //A byte adattípus taromány -128 értéktől 127 értékig terjed
        int byteAlja = Byte.MIN_VALUE;
        int byteTeteje = Byte.MAX_VALUE;
        System.out.println("A byte adattípus tartomány " + byteAlja + " éréktől " + byteTeteje+ " értékig terjed" );
        System.out.println("Az integer adattípus tartománya "+ Integer.MIN_VALUE + " értékől " + Integer.MAX_VALUE + " értékig tejed");        
        System.out.println("A float adattípus tartománya "+ Float.MIN_VALUE + " értékől " + Float.MAX_VALUE + " értékig tejed");        
        System.out.println("Az long adattípus tartománya "+ Long.MIN_VALUE + " értékől " + Long.MAX_VALUE + " értékig tejed");        
        System.out.println("Az short adattípus tartománya "+ Short.MIN_VALUE + " értékől " + Short.MAX_VALUE + " értékig tejed");        

    }
    
}
