package JOB;

import java.util.Scanner;

public class SortBubble {
    public static void main(String[] args) {
        int n,i,j,tukar;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan total bilangan : ");
        n = in.nextInt();
        
        int a[]  = new int[n];
        
        
        for(i=0; i<n; i++){
            System.out.print("Index "+(i+1)+" : ");
            a[i] = in.nextInt();
        }
        
        for(i=1; i<n; i++){
            for(j=0; j<(n-i-1); j++){
                if(a[j+1] < a[j]){
                    tukar = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tukar;
                }
            }
        }
        
        System.out.println();
        System.out.print("Terurut : ");
        for(i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
