/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOB;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author RyderPhantom
 */
public class NEW_ArrayNumber {
    public static char[] MathChallenge(int num) {
    // code goes here  
    String strNum = String.valueOf(num);
    char[] charNum = strNum.toCharArray();
    int n = charNum.length;
    int i, j;
    
    for(i=n-1;i>0;i--){
        if(charNum[i] > charNum[i-1]){
            break;
        }
    }
    if(i!=0){
        int x = charNum[i-1], min = i;
        
        for(j=i;j<n;j++){
            if(charNum[j] > x && charNum[j] < charNum[min]){
                min=j;
            }
        }
        
        swap(charNum, i-1, min);
        
        Arrays.sort(charNum, i, n);
    }
    
    return charNum;
  }
    
    static void swap(char[] charNum, int i, int j){
        char temp = charNum[i];
        charNum[i] = charNum[j];
        charNum[j] = temp;
    }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(MathChallenge(41352)); 
  }
}
