/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOB;

import java.util.Scanner;

/**
 *
 * @author RyderPhantom
 */
public class NeW_BalikString {
    public static void main(String[] args) {
        String kalimat;
        
        Scanner kata = new Scanner(System.in);
        
        System.out.print("Kalimat : ");
        kalimat = kata.nextLine();
        
//        Reverse(kalimat);
        
        System.out.println(Reverse(kalimat));
        
    }
    
    public static String Reverse(String kalimat){
        StringBuffer katabalik;
        
        katabalik = new StringBuffer(kalimat);
        
        System.out.println("------------");
//        System.out.println(katabalik.reverse());
        return katabalik.reverse().toString();
    }
}
