package JOB;

import java.util.Scanner;

public class SortSelection {
    public static void main(String[] args) {
        int n,i,j,tukar,imin;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan total bilangan : ");
        n = in.nextInt();
        
        int a[] = new int[n];
        
        for(i=0; i<n; i++){
            System.out.print("Index "+(i+1)+" : ");
            a[i] = in.nextInt();
        }
        
        for(i=0; i<n; i++){
            imin = i;
            for(j=(i+1); j<n; j++){
                if(a[j] < a[imin]){
                    imin = j;
                }
                
                tukar = a[imin];
                a[imin] = a[i];
                a[i] = tukar;
            }
        }
        
        System.out.println();
        System.out.print("Terurut : ");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
