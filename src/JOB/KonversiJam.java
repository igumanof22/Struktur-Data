/*
Nama/NoBP : Farhan Rinsky Mulya
Tanggal   : Senin,4 Maret 2019
Deskripsi : Konversi Jam, Menit, Detik ke Detik
 */
package JOB;

import java.util.Scanner;

/**
 *
 * @author Lab P1
 */
public class KonversiJam {
         
    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            int j,m,d;
            int detik;
            
            System.out.print("Masukkan Jumlah Jam : ");
            j = input.nextInt();
            
            System.out.print("Masukkan Jumlah Menit : ");
            m = input.nextInt();
            
            System.out.print("Masukkan Jumlah Detik : ");
            d = input.nextInt();
            
            detik = (j * 3600) + (m * 60) + d;
            
        System.out.println("===Konversi Jam===");
        System.out.println("Jumlah Detik = " + detik);
        
}   
}
