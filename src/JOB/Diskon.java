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
public class Diskon {
  
        public static void main(String [] args){
            double harga, diskon;
            Scanner in = new Scanner(System.in);
            System.out.println("Masukkan harga belanja : ");
            harga = in.nextInt ();
            
            if (harga > 100000){
            diskon = harga * 0.1;
            harga = harga - diskon;
            System.out.println("Total belanja = " + harga + " dan diskon = " + diskon);
            }
            else{
            System.out.println("Total belanja = " + harga);
            }
        }
}
