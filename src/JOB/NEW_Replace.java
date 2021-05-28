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
public class NEW_Replace {
    public static String Ganti(String kalimat, String vocal){
        if(vocal.equals("a")||vocal.equals("i")||vocal.equals("u")||vocal.equals("e")||vocal.equals("o")){
            kalimat = kalimat.replace("a", vocal);
            kalimat = kalimat.replace("i", vocal);
            kalimat = kalimat.replace("u", vocal);
            kalimat = kalimat.replace("e", vocal);
            kalimat = kalimat.replace("o", vocal);
            kalimat = kalimat.replace("A", vocal);
            kalimat = kalimat.replace("I", vocal);
            kalimat = kalimat.replace("U", vocal);
            kalimat = kalimat.replace("E", vocal);
            kalimat = kalimat.replace("O", vocal);
        } else{
            kalimat = "Huruf bukan huruf vocal";
        }
        return kalimat;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kalimat : ");
        String kalimat = in.nextLine();
        System.out.println("");
        System.out.print("Ganti ? : ");
        String huruf = in.nextLine();
        
        System.out.println(Ganti(kalimat, huruf));
    }
}
