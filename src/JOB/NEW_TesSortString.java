/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOB;

import java.util.*; 
/**
 *
 * @author RyderPhantom
 */
public class NEW_TesSortString {

  public static String ArrayChallenge(String[] strArr) {
    // code goes here  
    int i,j,save;
    String saveWord, word;
    int n = strArr.length;

    int num[] = new int[strArr.length];

    for(i=0;i<strArr.length;i++){
      word = strArr[i];
      num[i] = word.length();
    }

    for(i=0; i<n; i++){
      for(j=1; j<(n-i); j++){
        if(num[j-1] > num[j]){
          save = num[j-1];
          num[j-1] = num[j];
          num[j] = save;
          
          saveWord = strArr[j-1];
          strArr[j-1] = strArr[j];
          strArr[j] = saveWord;
        }
      }
    }

    return strArr[1];
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ArrayChallenge(new String[] {"coder","byte","code"})); 
  }

}
