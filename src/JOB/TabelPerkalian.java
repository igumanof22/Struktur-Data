/*
Nama/NoBP : Farhan Rinsky Mulya
Tanggal   : Senin,25 Maret 2019
Deskripsi : 
 */
package JOB;
import java.util.Scanner;

/**
 *
 * @author Lab P1
 */
public class TabelPerkalian {
    public static void main(String[] args){
        int n, i, k, bil, jum;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan bilangan yang ingin dikalikan = ");
        bil = in.nextInt();
        System.out.println("Masukkan banyak perkalian = ");
        n = in.nextInt();
        System.out.println("\nTabel Perkalian");
        i=1;
        while (i<=n)
        {
            k = i*bil;
            System.out.println(i+" * "+bil+" = "+k);
            i++;
        }
            
    }
}
