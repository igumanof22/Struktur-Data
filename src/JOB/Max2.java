/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOB;

import java.util.Scanner;
/**
 *
 * @author Lab P1
 */
public class Max2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bil1, bil2;
        Scanner in = new Scanner(System.in);
        System.out.println("Bilangan 1 = ");
        bil1 = in.nextInt();
        System.out.println("Bilangan 2 = ");
        bil2 = in.nextInt();
        if(bil1>bil2)
            System.out.println(bil1 + " lebih besar dari " + bil2);
        else if(bil2>bil1)
            System.out.println(bil2 + " lebih besar dari " + bil1);
        else
            System.out.println(bil1 + " sama dengan " + bil2);
    }
    
}
