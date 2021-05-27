/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListDinamis;

import java.util.Scanner;

/**
 *
 * @author LABP1KOMP
 */
class NilaiMatKul {
    String nim;
    String nama;
    String nilai;
    
    NilaiMatKul(){
    }
    
        
    void setNim(String nim){
        this.nim = nim;
        
    }
    String getNim(){
        return nim;
    }
    void setNama(String nama){
        this.nama=nama;
    }
    String getNama(){
        return nama;
    }
    void setNila(String nilai){
        this.nilai=nilai;
    }
    String getNilai(){
        return nilai;
    }

    
    
}

class Elemen{
 NilaiMatKul kontainer;
 Elemen next;
 
 Elemen(){
     kontainer = new NilaiMatKul();
 }
 NilaiMatKul getKontainer(){
     return kontainer;
 }
 void setNext(Elemen next){
     this.next=next;
     
 }
 Elemen getNext(){
     return next;
 }
}

class List{
 private Elemen first;
 
 List(){
 }
 
 void setFirst(Elemen first){
     this.first=first;
     
 }
 Elemen getFirst(){
     return first;
 }
 void createList(){
     first = null;
 }
 int countElement(){
     int hasil = 0;
     Elemen bantu;
     
     if(first != null){
         //list tidak kosong
         bantu = first;
         while (bantu != null){
             hasil=hasil+1;
             bantu = bantu.getNext();
         }
     }
     return hasil;
 }
 void addFirst(String nim,String nama,String nilai){
     Elemen baru;
     baru = new Elemen();
     baru.getKontainer().setNim(nim);
     baru.getKontainer().setNama(nama);
     baru.getKontainer().setNila(nilai);
     if(first == null){
         //list kosong
         baru.setNext(null);
         
     }
     else{
         //list tidak kosong
         baru.setNext(first);
         
     }
     first = baru;
     baru = null;
     
 }
 
 void addAfter(Elemen prev,String nim,String nama,String nilai){
     Elemen baru;
     if(prev != null){
         baru = new Elemen();
         baru.getKontainer().setNim(nim);
         baru.getKontainer().setNama(nama);
         baru.getKontainer().setNila(nilai);
         
         if(prev.next == null){
             baru.setNext(null);
         }
         else{
             baru.setNext(prev.getNext());
         }
         prev.setNext(baru);
         baru = null;
         
         
     }
 }
 void addLast(String nim,String nama,String nilai){
     Elemen last;
     if(first == null){
         //listkosong
         addFirst(nim,nama,nilai);//panggil addFirst
     }
     else{
         //jika list sudah terisi
         //cari elemen terakhir
         last = first;
         while(last.getNext() != null){
             last = last.getNext();
             
         }
         addAfter(last,nim,nama,nilai);
    }
}
 void delFirst(){
     Elemen hapus;
     if(first != null){//tidak kosong
         hapus = first;
         if(countElement()==1){//satu elemen saja
             first=null;
         }
         else{//lebih dari 1
             first = first.getNext();
         }
         //kosongkan elemen awal sebelumnya
         hapus.setNext(null);
     }
     else{//list kosong
         System.out.println("list kosong, tidak bisa dihapus");
     }
         
 }
 void delAfter(Elemen prev ){
     Elemen hapus;
     if(prev != null){
         hapus = prev.getNext();
         if(hapus != null){
             if(hapus.getNext() == null){
                 prev.setNext(null);
             }
             else{
             prev.setNext(hapus.getNext());
             }
             //pengosongan elemen
             hapus.setNext(null);
         }
     } 
 }
 void delLast(){
     Elemen last,before_last;
     if(first != null){
         if(countElement() == 1){
             //list isinya hanya satu
             delFirst();
         }
         else{
             //mencari elemen terakhir
             last=first;
             before_last = null;
             while(last.getNext()!=null){
                 before_last = last;
                 last = last.getNext();
             }
             //elemen sebelum menjadi elemen terakhir
             delAfter(before_last);

         }
     } 
 }
 void printElement(){
     Elemen bantu;
     int i;
     if (first != null){
         bantu = first;
         i=1;
         while (bantu != null){
             System.out.println("Elemen ke : "+i);
             System.out.println("Nim       : "+bantu.getKontainer().getNim());
             System.out.println("Nama      : "+bantu.getKontainer().getNama());
             System.out.println("Nilai     : "+bantu.getKontainer().getNilai());
             System.out.println("-----------------------------------");
             bantu = bantu.getNext();
             i=i+1;
         }
     }
     else{
         //list kosong
         System.out.println("list kosong.Data tidak ada");
     }
 }
 void delAll(){
     int i;
     if (countElement() !=0){
         for(i=countElement();i>=1;i--){
             //elemen di hapus dari belakang
             delLast();
            }
        }
     
    }
 
}

public class ListDinamis{
    
    public static void main(String[] args) {
//        String cari;
        Elemen bantu;
        int i;
        
//        Scanner in = new Scanner(System.in);
        
        List L1 = new List();
        List L2 = new List();
        List L3 = new List();
        
        L1.createList();;
        L1.printElement();
        
        System.out.println("==========================");
        System.out.println("List 1");
        
        L1.addFirst("136","nana","A");
        L1.addAfter(L1.getFirst(),"135", "iza", "A");
        L1.addFirst("137","Rara","A");
        
        L1.printElement();
        
        System.out.println("==========================");
        
        L2.createList();
        L2.printElement();
        
        System.out.println("==========================");
        System.out.println("List 2");
        
        L2.addFirst("138","Mana","A");
        L2.addAfter(L2.getFirst(),"139", "Dragon", "A");
        L2.addFirst("140","Nest","A");
        
        L2.printElement();
        
        System.out.println("==========================");
        
        if(L1.getFirst() != null){
            bantu = L1.getFirst();
            
            for(i = 1; i <= L1.countElement(); i++){
                L3.addLast(bantu.kontainer.getNim(), bantu.kontainer.getNama(), bantu.kontainer.getNilai());
                bantu.getNext();
            }
        }
        
        if(L2.getFirst() != null){
            bantu = L2.getFirst();
            
            for(i = 1; i <= L2.countElement(); i++){
                L3.addLast(bantu.kontainer.getNim(), bantu.kontainer.getNama(), bantu.kontainer.getNilai());
                bantu.getNext();
            }
        }
        

        System.out.println("List 3");
        
        L3.printElement();
        
        System.out.println("==========================");
        
        
        
//        System.out.print("Masukkan nim yang akan dicari : ");
//        cari = in.nextLine();
//        
//        bantu = L.getFirst();
//        
//        while((bantu != null) && (!bantu.kontainer.getNim().equals(cari))){
//            bantu = bantu.getNext();
//        }
//        
//        System.out.println();
//        
//        if(bantu != null){
//            System.out.println("=== Hasil Pencarian ===");
//            System.out.println("Nim   : "+bantu.kontainer.getNim());
//            System.out.println("Nama  : "+bantu.kontainer.getNama());
//            System.out.println("Nilai : "+bantu.kontainer.getNilai());
//            System.out.println();
//        }
//        else{
//            System.out.println("Data tidak ada");
//            System.out.println();
//        }
        
//        L.delLast();
//        L.delAfter(L.getFirst());
//        L.delFirst();
//        L.printElement();
//        System.out.println("========================");
    }
}

