/*
Nama/NoBP : Farhan Rinsky Mulya
Tanggal   : Senin,11 Maret 2019
Deskripsi : 
 */
package JOB;

import java.util.Scanner;
/**
 *
 * @author Lab P1
 */
public class Upah {
            public static void main(String [] args){
                double jamkerja, upah, lembur;
                Scanner in = new Scanner(System.in);
                System.out.println("Masukkan Jumlah Jam Kerja : ");
                jamkerja = in.nextInt ();
                
                if (jamkerja >= 55){
                upah = (40*5000)+(15*7500);
                System.out.println("Upah didapat = " + upah);
                }
                else if (jamkerja > 40 && jamkerja < 55){
                lembur = jamkerja - 40;
                upah = (40*5000)+(lembur*7500);
                System.out.println("Upah didapat = " + upah);
                }
                else{
                upah = jamkerja*5000;
                System.out.println("Upah didapat = " + upah);
                }
            }                     
}
