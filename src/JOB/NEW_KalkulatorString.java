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
public class NEW_KalkulatorString {
    private static String kalkulator(String str){
        str = str.replace(" ", ",");
        String[] split = str.split(",");
        double hasil = 0;
        String out;
        switch (split[1]) {
            case "+":
                hasil = Double.valueOf(split[0]) + Double.valueOf(split[2]);
                out = String.valueOf(hasil);
                break;
            case "-":
                hasil = Double.valueOf(split[0]) - Double.valueOf(split[2]);
                out = String.valueOf(hasil);
                break;
            case "/":
                if(split[2].equals("0")){
                    out = "Tidak dilakukan";
                } else{
                    hasil = Double.valueOf(split[0]) / Double.valueOf(split[2]);
                    out = String.valueOf(hasil);
                }   break;
            case "x":
                hasil = Double.valueOf(split[0]) * Double.valueOf(split[2]);
                out = String.valueOf(hasil);
                break;
            default:
                out = "Format tidak sesuai";
                break;
        }
        
        return out;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("+ - / x");
        System.out.print("Input (ex. 2 + 2) : ");
        String str = in.nextLine();
        
        System.out.println("--------------");
        System.out.println(kalkulator(str));
    }
}
