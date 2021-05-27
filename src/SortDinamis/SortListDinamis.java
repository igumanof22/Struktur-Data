package SortDinamis;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Ariq
 */
class NilaiMatKul {
    int nim;
    String nama;
    String nilai;
    
    NilaiMatKul(){
    }
    
        
    void setNim(int nim){
        this.nim = nim;
        
    }
    int getNim(){
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
 void addFirst(int nim,String nama,String nilai){
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
 
 void addAfter(Elemen prev,int nim,String nama,String nilai){
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
 void addLast(int nim,String nama,String nilai){
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
             System.out.println("Nim    : "+bantu.getKontainer().getNim());
             System.out.println("Nama    : "+bantu.getKontainer().getNama());
             System.out.println("Nilai    : "+bantu.getKontainer().getNilai());
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

public class SortListDinamis{
    
    public static void main(String[] args) {
        List L1 = new List();
        List L2 = new List();
        List L3 = new List();
        
        Elemen bantu1;
        Elemen bantu2;
        
        L1.createList();
        System.out.println("L1");
        System.out.println("==========================");
        L1.addFirst(111,"nana","A");
        L1.addAfter(L1.getFirst(),222, "iza", "A");
        L1.addFirst(333,"Rara","A");
        L1.printElement();
        
        L2.createList();
        System.out.println("\nL2");
        System.out.println("==========================");
        L2.addFirst(444,"bayu","A");
        L2.addAfter(L2.getFirst(),555, "gusti", "A");
        L2.addFirst(666,"Paraya","A");
        L2.printElement();
        
        bantu1 = L1.getFirst();
        bantu2 = L2.getFirst();
        
        
        
        
        while ((bantu1 != null) && (bantu2 != null)){
            if (bantu1.kontainer.getNim() < bantu2.kontainer.getNim()) {
                L3.addLast(bantu1.kontainer.getNim(), bantu1.kontainer.getNama(), bantu1.kontainer.getNilai());
                bantu1 = bantu1.getNext();
            } 
            else {
                L3.addLast(bantu2.kontainer.getNim(), bantu2.kontainer.getNama(), bantu2.kontainer.getNilai());
                bantu2 = bantu2.getNext();
            }
        }
        
        if (bantu1 != null) {
            while(bantu1 != null) {
                L3.addLast(bantu1.kontainer.getNim(), bantu1.kontainer.getNama(), bantu1.kontainer.getNilai());
                bantu1 = bantu1.getNext();
            }
        }
        if (bantu2 != null) {
            while(bantu2 != null) {
                L3.addLast(bantu2.kontainer.getNim(), bantu2.kontainer.getNama(), bantu2.kontainer.getNilai());
                bantu2 = bantu2.getNext();
            }
        }
        
        
        
        System.out.println("\n\nHasil L3 ");
        System.out.println("==========================");
        L3.printElement();
        
       
    }    
        
}

