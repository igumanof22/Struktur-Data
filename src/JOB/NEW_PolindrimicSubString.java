/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author RyderPhantom
 */
public class NEW_PolindrimicSubString {
    public static String SearchingChallenge(String str) {
    // code goes here
    String word, saveWord;
    StringBuffer reverse;
    str = str.replace(" ", "");
    List<String> list = new ArrayList<>();
    for(float pivot=0; pivot<str.length(); pivot+=0.5){
        float palindromeRadius = pivot-(int)pivot;
        while((pivot+palindromeRadius)<str.length()&&
                (pivot-palindromeRadius)>0&& 
                str.charAt((int)(pivot+palindromeRadius))==str.charAt((int)(pivot+palindromeRadius))){
            word = str.substring((int)(pivot-palindromeRadius),(int)(pivot+palindromeRadius+1));
            reverse = new StringBuffer(word);
            if(String.valueOf(reverse.reverse()).equals(word)){
                list.add(str.substring((int)(pivot-palindromeRadius),(int)(pivot+palindromeRadius+1)));
            }
            palindromeRadius++;
        }
    }
    
    String[] arrStr = new String[list.size()];
                
    for(int i=0; i<list.size(); i++){
        arrStr[i] = list.get(i);
    }
    
    int n = arrStr.length, save;
    int num[] = new int[arrStr.length];
    for(int i=0;i<n;i++){
      word = arrStr[i];
      num[i] = word.length();
    }
    
    for(int i=0; i<n; i++){
        for(int j=1; j<(n-i); j++){
            if(num[j-1] < num[j]){
                save = num[j-1];
                num[j-1] = num[j];
                num[j] = save;
                
                saveWord = arrStr[j-1];
                arrStr[j-1] = arrStr[j];
                arrStr[j] = saveWord;
            }
        }
    }
    
    String checkWord = arrStr[0];
    if(checkWord.length() <= 2){
      arrStr[0] = "none";
    }
    
    return arrStr[0];
    }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SearchingChallenge("bfsdkfb sadfsd")); 
  }
}
