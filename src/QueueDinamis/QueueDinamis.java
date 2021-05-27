package QueueDinamis;

import java.util.Scanner;

class NilaiMatKul{
    private String nim;
    private String nama;
    private double nilai;
    
    NilaiMatKul(){
        
    }
    
    void setNim(String nim){
            this.nim = nim;
    } 

    String getNim(){
        return nim;
    }

    void setNama(String nama){
        this.nama = nama;
    } 

    String getNama(){
        return nama;
    }

    void setNilai(double nilai){
        this.nilai = nilai;
    } 

    double getNilai(){
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
        this.next = next;
    }
    
    Elemen getNext(){
        return next;
    }
}

class Queue{
    Elemen first;
    Elemen last;
    
    Queue(){
        
    }
    
    void setFirst(Elemen first){
        this.first = first;
    }
    
    Elemen getFirst(){
        return first;
    }
    
    void setLast(){
        this.last = last;
    }
    
    Elemen getLast(){
        return last;
    }
    
    void createEmpty(){
        first = null;
        last = null;
    }
    
    boolean isEmpty(){
        boolean hasil = false;
        
        if(first == null){
            hasil = true;
        }
        return hasil;
    }
    
    int countElemen(){
        Elemen bantu;
        int hasil = 0;
        if(first != null){
            bantu = first;
            while(bantu != null){
                hasil++;
                bantu = bantu.getNext();
            }
        }
        return hasil;
    }
    
    void addQ(String nim, String nama, double nilai){
        Elemen baru;
        baru = new Elemen();
        
        baru.getKontainer().setNim(nim);
        baru.getKontainer().setNama(nama);
        baru.getKontainer().setNilai(nilai);
        baru.setNext(null);
        
        if(first == null){
            first = baru;
        }
        else{
            last.setNext(baru);
        }
        last = baru;
        baru = null;
    }
    
    void delQ(){
        Elemen hapus;
        if(first != null){
            hapus = first;
            if(countElemen() == 1){
                first = null;
                last = null;
            }
            else{
                first = first.getNext();
                hapus.setNext(null);
            }
        }
    }
    
    void printQueue(){
        Elemen bantu;
        int i = 1;
        if(first != null){
            System.out.println("--------ISI QUEUE--------");
            bantu = first;
            
            while(bantu != null){
                System.out.println("====================");
                System.out.println("Elemen ke-"+i);
                System.out.println("NIM     : "+bantu.getKontainer().getNim());
                System.out.println("Nama    : "+bantu.getKontainer().getNama());
                System.out.println("Nilai   : "+bantu.getKontainer().getNilai());
                bantu = bantu.getNext();
                i++;
            }
        }
        else{
            System.out.println("ANTRIAN KOSONG");
        }
    }
}

public class QueueDinamis {
    public static void main(String[] args) {
        int x;
        Queue Q = new Queue();
        Q.createEmpty();
        Q.printQueue();
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("----------DATA ANTRIAN--------");
        do{
            System.out.print("Inputkan NIM    : ");
            String nim = in.nextLine();
            System.out.print("Inputkan Nama   : ");
            String nama = in.nextLine();
            System.out.print("Inputkan Nilai  : ");
            double nilai = in.nextDouble();
            System.out.println("=========================");
            
            Q.addQ(nim, nama, nilai);
            
            System.out.print("Tambah data? (1=yes, 2=no) : ");
            x = in.nextInt();
            
            in.nextLine();
        }while(x == 1);
        
        Q.printQueue();
    }
}
