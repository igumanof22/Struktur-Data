/*
Nama/NoBP : Farhan Rinsky Mulya
Tanggal   : Senin,4 Maret 2019
Deskripsi : Volume Luas Alas dan Luas Permungkaan Balok
 */
package JOB;

/**
 *
 * @author Lab P1
 */
import java.util.Scanner;

public class Balok {
    
    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            int p,l,t;
            int volume,la,lp;
            
            System.out.print("Masukkan Panjang Balok :");
            p = input.nextInt();
            
            System.out.print("Masukkan Lebar Balok :");
            l = input.nextInt();
            
            System.out.print("Masukkan Tinggi Balok :");
            t = input.nextInt();
            
            volume = p*l*t;
            la = p*l;
            lp = (2*p*l) + (2*p*t) + (2*l*t);
            
        System.out.println("===Balok===");
        System.out.println("Panjang = " + p);
        System.out.println("Lebar = " + l);
        System.out.println("Tinggi = " + t);
        System.out.println("Volume = " + volume + "\tLuas Alas = " + la + "\tdan Luas Permungkaan = " + lp);
            
        }
}
