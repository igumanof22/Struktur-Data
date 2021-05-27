/*
Nama/NoBP : Farhan Rinsky Mulya
Tanggal   : Senin,4 Maret 2019
Deskripsi : Input Variabel
 */
package JOB;

/**
 *
 * @author Lab P1
 */
import java.util.Scanner;

public class InputVariabel {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String huruf,nama;
        int umur;
        float angka;
        
        System.out.print("Masukkan Sebuah huruf :");
        huruf = input.nextLine();
        
        System.out.print("Masukkan Sebuah bilangan berkoma :");
        angka = input.nextFloat();
        input.nextLine();
        
        System.out.print("Masukkan nama Anda :");
        nama = input.nextLine();
        
        System.out.print("Masukkan umur Anda :");
        umur = input.nextInt();
    }
}
