/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOB;

import java.util.*; 
import java.io.*;
/**
 *
 * @author RyderPhantom
 */

class NEW_PrimeMover {

  public static int PrimeMover(int num) {
    // code goes here  
    int x=2;
    int count=1;
    int y=3;
    boolean prime=true;
    while(count<num){
      for(int i=2; i<y; i++){
        if(y%i==0){
          prime = false;
          break;
        }
      }
      if(prime){
        x=y;
        count++;
      }

      prime=true;
      y++;
    }
    return x;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.println(PrimeMover(s.nextInt())); 
  }

}
