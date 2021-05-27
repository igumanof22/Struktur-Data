package Quiz;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
public class KuisTRPL1A {
    public static void main(String [] args){
    double paket = 0,nelpon, sms, data,tarifnelpon,tarifsms,tarifdata,total;
                Scanner in = new Scanner(System.in);
                System.out.println("Masukan harga paket yang akan digunakan : ");
                nelpon = in.nextInt ();
                
                System.out.println("Masukan paket nelpon yang telah digunakan : ");
                nelpon = in.nextInt ();
                
                System.out.println("Masukan paket sms yang telah digunakan : ");
                sms = in.nextInt ();
                
                System.out.println("Masukan paket data yang telah digunakan : ");
                data = in.nextInt ();
                
                tarifnelpon = (nelpon/10)*50;
                tarifsms = sms*250;
                tarifdata = data*1500;
              
                total= paket + tarifnelpon + tarifsms+ tarifdata;
                        
                System.out.println("Total bayar = " + total);
    
    
}
}