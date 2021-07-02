/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOB;

/**
 *
 * @author RyderPhantom
 */
public class NEW_SimpleSymbols {
    
    private static String simbol(String str){
        char[] arr = str.toLowerCase().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                if (i == 0 || i == arr.length) {
                    return "false";
                }
                if (arr[i-1] != '+' || arr[i+1] != '+') {
                    return "false";
                }
            }
        }
        return "true"; 
    }
    
    public static void main(String[] args) {
        System.out.println(simbol("++d+===+c++==a"));
    }
}
    
