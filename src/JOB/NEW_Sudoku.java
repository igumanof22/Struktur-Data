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
public class NEW_Sudoku {
  public static char posisiKuadran(int x, int y){
    if(x>=0 && x<=2){
      if(y>=0 && y<=2){
        return '1';
      } else if(y>=3 && y<=5){
        return '2';
      } else if(y>=6 && y<=8){
        return '3';
      }
    }
    if(x>=3 && x<=5){
      if(y>=0 && y<=2){
        return '4';
      } else if(y>=3 && y<=5){
        return '5';
      } else if(y>=6 && y<=8){
        return '6';
      }
    }
    if(x>=5 && x<=8){
      if(y>=0 && y<=2){
        return '7';
      } else if(y>=3 && y<=5){
        return '8';
      } else if(y>=6 && y<=8){
        return '9';
      }
    }
    return '0';
  }

  // public static cekKuadran()

  public static String cekHasil(String hasil, char kuad){
    if(hasil.length() == 0) return String.valueOf(kuad);
    
    for(int i=0; i<hasil.length(); i+=2){
      if(hasil.charAt(i) == kuad) return hasil;
    }
    
    hasil += ","+kuad;
    hasil = hasil.replace(",","");
    char[] arrChar = hasil.toCharArray();
    Arrays.sort(arrChar);
    hasil = String.valueOf(arrChar).replace("",",");
    
    return hasil.substring(1, hasil.length()-1);
  }

  public static String SudokuQuadrantChecker(String[] str) {
    // code goes here  
    String hasil="";
    //cek Baris
    for(int i=0; i<9; i++){
      for(int j=0; j<9; j++){
        for(int k=0; k<9; k++){
          if(j==k) continue;
          if(Character.isDigit(str[i].charAt((j*2)+1))){
            if(str[i].charAt((j*2)+1) == str[i].charAt((k*2)+1)){
              hasil = cekHasil(hasil, posisiKuadran(i, j));
            }
          }
        }
      }
    }
    //cek Kolom
    for(int i=0; i<9; i++){
      for(int j=0; j<9; j++){
        for(int k=0; k<9; k++){
          if(j==k) continue;
          if(Character.isDigit(str[j].charAt((i*2)+1))){
            if(str[j].charAt((i*2)+1) == str[k].charAt((i*2)+1)){
              hasil = cekHasil(hasil, posisiKuadran(j, i));
            }
          }
        }
      }
    }
    //cek Kuadran
    for(int x=0; x<9; x+=3){
      for(int y=0; y<9; y+=3){
        for(int i=0; i<3; i++){
          for(int j=0; j<3; j++){
            for(int k=0; k<3; k++){
              for(int l=0; l<3; l++){
                if(i==k || j==l) continue;
                if(Character.isDigit(str[x+i].charAt(((y+j)*2)+1))){
                  if(str[x+i].charAt(((y+j)*2)+1) == str[x+k].charAt(((y+l)*2)+1)){
                    hasil = cekHasil(hasil, posisiKuadran(x+i, y+j));
                  }
                }
              }
            }
          }
        }
      }
    }
    
    if(hasil.equals("")){
      return "legal";
    } else{
      return hasil;
    }
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.println(SudokuQuadrantChecker(
            new String[] {"(1,2,3,4,5,6,7,8,1)"
                         ,"(x,x,x,x,x,x,x,x,x)"
                         ,"(x,x,x,x,x,x,x,x,x)"
                         ,"(1,x,x,x,x,x,x,x,x)"
                         ,"(x,x,x,x,x,x,x,x,x)"
                         ,"(x,x,x,x,x,x,x,x,x)"
                         ,"(x,x,x,x,x,x,x,x,x)"
                         ,"(x,x,x,x,x,x,x,x,x)"
                         ,"(x,x,x,x,x,x,x,x,x)"})); 
  }
}

