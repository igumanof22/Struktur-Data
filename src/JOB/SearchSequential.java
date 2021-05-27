package JOB;

import java.util.Scanner;

public class SearchSequential {
    public static void main(String[] args) {
        int c,n,search,a[];
        
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan total bilangan : ");
        n = in.nextInt();
        
        a = new int[n];
        
        for(c=0;c<n;c++){
            System.out.print("Index "+(c+1)+" : ");
            a[c] = in.nextInt();
        }
        
        System.out.println();
        System.out.print("Masukkan angka yang dicari : ");
        search = in.nextInt();
        
        for(c=0;c<n;c++){
            if(a[c] == search){
                System.out.println(search+" ada di index "+(c+1));
                break;
            }
        }
        if(c == n){
            System.out.println(search+" tidak ada di array");
        }
    }
    
}
