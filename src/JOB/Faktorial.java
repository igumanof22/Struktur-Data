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
public class Faktorial {
        public static void main(String[] args){
        int i, a, x;
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan bilangan yang ingin difaktorialkan = ");
        a = in.nextInt(); in.nextLine();
        x = 1;
    
        for(i=1;i<=a;i++){
            x = x * i;
        }
            System.out.println("Hail faktorial dari "+a+" = "+x);
        }
}
