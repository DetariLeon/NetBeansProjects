/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyak12.pkg02;

/**
 *
 * @author user3
 */
public class Gyak1202 {

    public static void masodikLeg(int tomb[], int tombnagy)
    {
        int i, elso, masodik;

        elso = masodik = Integer.MIN_VALUE;
        for (i = 0; i < tombnagy; i++) {
            if (tomb[i] > elso) {
                masodik = elso;
                elso = tomb[i];
            }
            else if (tomb[i] > masodik && tomb[i] != elso)
                masodik = tomb[i];
        }
 
        System.out.println("Második legnagyobb szám: "+ masodik);
    }
    public static void main(String[] args) {
     int tomb[] = { 10, 19, 21, 32, 53 };
        int a = tomb.length;
        masodikLeg(tomb, a);
    }
}
