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
public class WujudAir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suhu;
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan suhu air : ");
        suhu = in.nextInt();
        if(suhu < 0)
            System.out.println("Air berwujud padat");
        else if (suhu>=0 && suhu<=100)
            System.out.println("Air berwujud cair");
        else
            System.out.println("Air berwujud gas");
    }
}
