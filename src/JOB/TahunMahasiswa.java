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
public class TahunMahasiswa {
    
    public static void main(String [] args){
        int tahun1, tahun2, umur1, umur2;
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan Tahun Lahir Mahasiswa ke 1 : ");
        tahun1 = in.nextInt ();
        System.out.println("Masukkan Tahun Lahir Mahasiswa ke 2 : ");
        tahun2 = in.nextInt ();
        
        umur1 = 2019 - tahun1;
        umur2 = 2019 - tahun2;
        
        System.out.println("Umur mahasiswa ke 1 : " + umur1 +" tahun");
        System.out.println("Umur mahasiswa ke 2 : " + umur2 +" tahun");
        
        if(umur1>umur2)
            System.out.println("Mahasiswa ke 1 lebih tua dari Mahasiswa ke 2");
        else if (umur2>umur1)
            System.out.println("Mahasiswa ke 2 lebih tua dari Mahasiswa ke 1");
        else
            System.out.println("Ke 2 Mahasiswa sama sama berumur" + umur1);
    }
}
