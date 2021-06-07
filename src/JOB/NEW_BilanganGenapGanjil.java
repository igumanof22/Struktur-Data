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
public class NEW_BilanganGenapGanjil {
    public static void main(String[] args) {
        int bil1, bil2;
        
        Scanner bil = new Scanner(System.in);
        
        System.out.print("Bilangan A : ");
        bil1 = bil.nextInt();
        System.out.print("Bilangan B : ");
        bil2 = bil.nextInt();
        
        System.out.println(GenapGanjil(bil1, bil2));
        
    }
    
    public static String GenapGanjil(int a, int b){
        System.out.println("-----------------");
        for(int i=a; i<=b; i++){
            if(i%2==0){
                System.out.println("Angka "+i+" adalah genap");
            }else{
                System.out.println("Angka "+i+" adalah ganjil");
            }
        }
        return "----------------";
    }
}
