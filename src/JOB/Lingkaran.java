/*
Nama/NoBP : Farhan Rinsky Mulya
Tanggal   : Senin,4 Maret 2019
Deskripsi : Luas dan Keliling Lingkaran
 */
package JOB;

/**
 *
 * @author Lab P1
 */
public class Lingkaran {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double r;
        double luas,kell;
        r=7;
        luas = 3.14*(r*r);
        kell = 3.14* (2*r);
        System.out.println("===Lingkaran===");
        System.out.println("Jari - Jari =" + r);
        System.out.println("Luas = " + luas + "\tdan Keliling = " + kell);
        
    }
}
