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
public class NEW_HighestLowest {
    private static String HighLow(String str){
        String[] split = str.split(" ");
        int n = split.length, tukar;
        String out = null;
        int[] a = new int[n];
        
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(split[i]);
        }
        
        for(int i=0; i<n; i++){
            for(int j=1; j<(n-i); j++){
                if(a[j-1] > a[j]){
                    tukar = a[j-1];
                    a[j-1] = a[j];
                    a[j] = tukar;
                }
            }
        }
        
        for(int i=0; i<n; i++){
            if(i==n-1){
                out = String.valueOf(a[i]);
            }
        }
        
        out = a[0]+" "+out;
        
        return out;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input (2 4 1 5) : ");
        String str = in.nextLine();
        
        System.out.println("--------------");
        System.out.println(HighLow(str));
    }
}
