/*
Nama/NoBP : Farhan Rinsky Mulya
Tanggal   : Senin,4 Maret 2019
Deskripsi : Luas dan Keliling Persegi Panjang
 */
package JOB;

/**
 *
 * @author Lab P1
 */
public class Persegipanjang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pj,lb;
        int luas,kell;
        pj=10; lb=5;
        luas = pj*lb;
        kell = (2*pj)+(2*lb);
        System.out.println("===Persegi Panjang===");
        System.out.println("Panjang = " + pj);
        System.out.println("Lebar = " + lb);
        System.out.println("Luas = " + luas + "\tKeliling = " + kell);
    }
    
}
