/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muveletek;

/**
 *
 * @author user3
 */
public class Muveletek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //matematikai műveletek
            //két operandusú
        int a = 43;
        int b = 35;
        
        int osszeg = a + b;
        System.out.println(osszeg);
        int kulonbseg = a - b;
        System.out.println(kulonbseg);        
        int szorzat = a * b;
        System.out.println(szorzat);
        double hanyados = (double)a / (double)b;
        System.out.println(hanyados);
        int maradek = a % b ; //az a/b osztás Maradékát adja
        System.out.println(maradek);
        
        //egy operandusó
        int c = 5;
        c++; // c értékének növelése 1-gyel postfix formában
        System.out.println(c);//c érétéke 6
        System.out.println(c++);//c értéke 6 majd növeli 1-gyel ->7
        System.out.println(++c); //c értéke 8 lesz, ezt iratjuk ki
        
        int d = 3;
        d--;//2
        System.out.println(--d);//1
        
        //relációs műveletek
        int x = 9;
        int y = 14;
        
        System.out.println(x > y);//false
        System.out.println(x < y);//true
        System.out.println(x != y);//true
        System.out.println(x >= y);//false
        System.out.println(x <= y);//true
        System.out.println(x == y);//false
       
        //logikai műveletek
        System.out.println("---------------Logikai Műveletek-------------------");
        boolean t = true;
        boolean f = false;
        
        System.out.println(t && f);//ÉS művelet
        System.out.println(t || f);//VAGY művelet
        System.out.println(!t);//negáció (tagadás) művelet
        
        //értékado műveletek
        int k;
        k = 3;
        k = k + 1;
        k+=1; //összevontuk a műveleteket
       
        k-=1;
        System.out.println(k);
        k*=2;
        System.out.println(k);
        k/=4;
        System.out.println(k);
        k%=2;
        System.out.println(k);
        
        //öszetett műveletek
        int z = 12;
        //3-mal és 4-gyel IS osztható is
        System.out.println((z % 3 == 0) && (z % 4 == 0));//true
        //3-mal vagy 4-gyel oszthazó-e
        System.out.println((z % 3 == 0)|| (z % 4 == 0));//true
        //3-mal és 5-tel nem osztható
        System.out.println((z % 3 == 0 )&& (z % 5 == 0 ));//false
        //3-mal osztható és 5-tel nem osztható-e
        System.out.println((z % 3 == 0 )&& !(z % 5 == 0 ));//true
        //5-tel osztható nem negatív szám
        System.out.println((z % 5 == 0) && !(z < 0));//false
    }
    
}
