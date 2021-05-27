package JOB;

import java.util.Scanner;

public class SearchBinary {
    public static void main(String[] args) {
        int i,kiri,tengah,kanan,n,search,a[],save,j;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan total bilangan : ");
        n = in.nextInt();
        
        a = new int[n];
        
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
        
        System.out.println();
        System.out.println();
        System.out.print("Masukkan angka yang dicari : ");
        search = in.nextInt();
        
        kiri = 0;
        kanan = n-1;
        tengah = (kiri+kanan)/2;
        
        while(kiri <= kanan){
            if(a[tengah] < search){
                kiri = tengah + 1;
            }
            else if(a[tengah] == search){
                System.out.println(search+" ada di index "+(tengah+1));
                break;
            }
            else{
                kanan = tengah - 1;
            }
            
            tengah = (kiri + kanan) / 2;
        }
        
        System.out.println(search+" tidak ada di array");
    }
    
}
