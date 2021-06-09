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
     
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kalimat : ");
        String kalimat = in.nextLine();
        
        System.out.println("-----------------");
        
        String[] str;
        str = Vocal(kalimat);
        
        System.out.println('"'+kalimat+'"'+" = "+str[1]+" yaitu "+str[0]);
    }
    
    private static String[] Vocal(String kalimat){
        int x = 0;
        boolean cekA = false,cekI = false,cekU = false,cekE = false,cekO = false;
        String str[] = new String[5], output[] = new String[2];
        String out = null;
        for(int i=0; i<kalimat.length(); i++){
            if(!cekA){
                if(kalimat.charAt(i)=='a'||kalimat.charAt(i)=='A'){
                    str[x] = "a";
                    x++;
                    cekA=true;
                }
            }
            if(!cekI){
                if(kalimat.charAt(i)=='i'||kalimat.charAt(i)=='I'){
                    str[x] = "i";
                    x++;
                    cekI=true;
                }
            }
            if(!cekU){
                if(kalimat.charAt(i)=='u'||kalimat.charAt(i)=='U'){
                    str[x] = "u";
                    x++;
                    cekU=true;
                }
            }
            if(!cekE){
                if(kalimat.charAt(i)=='e'||kalimat.charAt(i)=='E'){
                    str[x] = "e";
                    x++;
                    cekE=true;
                }
            }
            if(!cekO){
                if(kalimat.charAt(i)=='o'||kalimat.charAt(i)=='O'){
                    str[x] = "o";
                    x++;
                    cekO=true;
                }
            }
        }
        for(int i=0; i<str.length; i++){
            if(str[i]!=null){
                if(i==0){
                    out = str[i];
                }else{
                    out = out+", "+str[i];
                }
            }
        }
        
        output[0] = out;
        output[1] = String.valueOf(x);
        return output;
    }
}
