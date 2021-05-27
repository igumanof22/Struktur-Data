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
public class XpangkatY {
    public static void main(String[] args){
        int i, x, y, b;
        Scanner in = new Scanner(System.in);
        System.out.println("Program mencari hasil pangkat");
        System.out.print("Input X = "); x = in.nextInt(); in.nextLine();
        System.out.print("Input Y = "); y = in.nextInt(); in.nextLine();
        b = 1;
        for(i=1;i<=y;i++){
            b = b * x;
        }
        System.out.println("Hasil pemangkatan dari :\n"+x+" Pangkat "+y+" = "+b);
    }
}
