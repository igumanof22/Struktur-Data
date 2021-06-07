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
public class NEW_HitungVocal {
    public static int Vocal(String kalimat){
        int x=0,j;
        j = kalimat.length();
        for(int i=j; i<j; i++){
            char c = kalimat.charAt(i);
            String vocal = String.valueOf(c);
            if(vocal.equalsIgnoreCase("a")||vocal.equalsIgnoreCase("i")||vocal.equalsIgnoreCase("u")||
                vocal.equalsIgnoreCase("e")||vocal.equalsIgnoreCase("o")){
                x++;
            }
        }
        
        return x;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kalimat : ");
        String kalimat = in.nextLine();
        
        System.out.println("-----------------");
        System.out.println(Vocal(kalimat));
    }
}
