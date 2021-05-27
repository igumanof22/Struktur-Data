package QueueStatis;

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

class Queue{
    private int first;
    private int last;
    private NilaiMatKul[] data = new NilaiMatKul[10];
    int i;
    
    Queue(){
        for(i=0;i<10;i++){
            data[i] = new NilaiMatKul();
        }
    }
    
    void setFirst(int first){
        this.first = first;
    }
    
    int getFirst(){
        return first;
    }
    
    void setLast(int last){
        this.last = last;
    }
    
    int getLast(){
        return last;
    }
    
    void createEmpty(){
        first = -1;
        last = -1;
    }
    
    boolean isEmpty(){
        boolean hasil = false;
        
        if(first == -1){
            hasil = true;
        }
        return hasil;
    }
    
    boolean isFull(){
        boolean hasil = false;
        
        if(last == 9){
            hasil = true;
        }
        return hasil;
    }
    
    void addQ(String nim, String nama, double nilai){
        if(isEmpty() == true){      //Queue kosong
            last = 0;
            first = 0;
            data[0].setNim(nim);
            data[0].setNama(nama);
            data[0].setNilai(nilai);            
        }
        else{
            if(isFull() != true){   //Queue belum penuh
                last++;
                data[last].setNim(nim);
                data[last].setNama(nama);
                data[last].setNilai(nilai);
            }
            else{                   //Queue Penuh
                System.out.println("Antrian Penuh");
            }
        }
    }
    
    void delQ(){
        int i;
        if(last == 0){
            first = -1;
            last = -1;
        }
        else{
            for(i=(first+1);i<=last;i++){
                data[i-1].setNim(data[i].getNim());
                data[i-1].setNama(data[i].getNama());
                data[i-1].setNilai(data[i].getNilai());
            }
            last--;
        }
    }
    
    void printQueue(){
        int i;
        if(first != -1){
            System.out.println("--------ISI QUEUE--------");
            for(i=last;i>=first;i--){
                System.out.println("====================");
                System.out.println("Elemen ke   : "+i);
                System.out.println("Nim         : "+data[i].getNim());
                System.out.println("Nama        : "+data[i].getNama());
                System.out.println("Nilai       : "+data[i].getNilai());
                System.out.println("====================");
            }
        }
        else{
            System.out.println("ANTRIAN KOSONG");
        }
    }
}

public class QueueStatis {
    public static void main(String[] args) {
        Queue Q = new Queue();
        Q.createEmpty();
        Q.printQueue();
        
        Q.addQ("13507701", "Nana", 64.75);
        Q.addQ("13507702", "Rudi", 75.11);
        Q.addQ("13507703", "Dea", 84.63);
        
        Q.printQueue();
        
        System.out.println("------------------------------");
        
        Q.delQ();
        Q.delQ();
        Q.printQueue();
    }
    
}
