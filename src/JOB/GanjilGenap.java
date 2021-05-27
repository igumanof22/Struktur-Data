/*
Nama/NoBP : Farhan Rinsky Mulya
Tanggal   : Senin,11 Maret 2019
Deskripsi : Menentukan bilangan ganjil atau genap
 */
package JOB;

import java.util.Scanner;
/**
 *
 * @author Lab P1
 */
public class GanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bil,hasil;
        Scanner in = new Scanner (System.in);
        System.out.println("Masukkan sebuah bilangan bulat : ");
        bil = in.nextInt();
        hasil = bil%2;
        if(hasil==0)
            System.out.println("Merupakan bilangan genap");
        else
            System.out.println("Merupakan bilangan ganjil");
    }
    
}
