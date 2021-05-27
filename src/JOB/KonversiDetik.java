/*
Nama/NoBP : Farhan Rinsky Mulya
Tanggal   : Senin,4 Maret 2019
Deskripsi : Konversi Detik ke Jam, Menit, Detik
 */
package JOB;

import java.util.Scanner;

/**
 *
 * @author Lab P1
 */
public class KonversiDetik {
        
    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            int x;
            int jam,menit,detik;
            
            System.out.print("Masukkan Jumlah Detik :");
            x = input.nextInt();
            
            jam = x / 3600;
            menit = (x % 3600)/ 60;
            detik = x % 60;
            
        System.out.println("===Konversi Detik===");
        System.out.println("Jam = " + jam);
        System.out.println("Menit = " + menit);
        System.out.println("Detik = " + detik);
        
}
}
