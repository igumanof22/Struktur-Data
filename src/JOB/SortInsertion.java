package JOB;

import java.util.Scanner;

public class SortInsertion {
    public static void main(String[] args) {
        int n,i,j,save;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan total bilangan : ");
        n = in.nextInt();
        
        int a[] = new int[n];
        
        for(i=0;i<n;i++){
            System.out.print("Index "+(i+1)+" : ");
            a[i] = in.nextInt();
        }
        
        for(i=1; i<n; i++){
            save = a[i];
            for(j=i;j>0;j--){
                if(a[j-1] < save){
                    break;
                }                
                a[j] = a[j-1];
            }
            a[j] = save;
        }
        
        System.out.println();
        System.out.print("Terurut : ");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
