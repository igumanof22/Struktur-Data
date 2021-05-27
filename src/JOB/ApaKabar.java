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
public class ApaKabar {
    
    public static void main(String[] args) {
            int bil;
            Scanner in = new Scanner(System.in);
            System.out.println("Masukkan bilangan bulat : ");
            bil = in.nextInt();
            if (bil>=0 && bil<=100)
                System.out.println("How are you");
            else
                System.out.println("Apa Kabar");
    }
}
