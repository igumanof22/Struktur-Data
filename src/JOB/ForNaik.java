/*
Nama/NoBP : Farhan Rinsky Mulya
Tanggal   : Senin,25 Maret 2019
Deskripsi : Pengulangan For
 */
package JOB;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author Lab P1
 */
public class ForNaik {
    public static void main(String[] args) {
        int n, i, bil, jum;
        double rata;
        
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".##");
        System.out.println("Banyak bilangan yang akan diinputkan = ");
        n = in.nextInt();
        jum = 0;
        for(i=1;i<=n;i++)
        {
        System.out.println("Bilangan ke-"+i+" = ");
        bil = in.nextInt();
        jum = jum+bil;
        }
        
        rata=(double)jum/n;
        System.out.println("Jumlah = "+jum);
        System.out.println("Rata-rata = "+df.format(rata));
        
    }
}

