/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOB;

/**
 *
 * @author RyderPhantom
 */
public class NEW_PRIMA {
    int iRekusif = 1;
    int pembagi = 2;
    public void faktorisasiPrima(int angka){
        if(iRekusif == 1)
            System.out.print(angka + " = ");
        while(angka >= pembagi){
            if(angka % pembagi == 0){
                if(iRekusif != 1)
                    System.out.print(" x ");
                System.out.print(pembagi);
                angka /= pembagi;
            } else {
                pembagi++;
            }
                iRekusif++;
//            faktorisasiPrima(angka, pembagi, iRekusif+1);
        }
    }
   
    public static void main(String[] args) {
        NEW_PRIMA prima = new NEW_PRIMA();
        prima.faktorisasiPrima(1234);
        System.out.println();
    }
}
