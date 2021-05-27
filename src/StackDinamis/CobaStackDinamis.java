package StackDinamis;

/**
 *
 * @author user
 */
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
    private NilaiMatKul kontainer;
    private Elemen next;
    
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

class Stack{
    private Elemen top;
    
    Stack(){
        
    }
    
    void setTop(Elemen top){
        this.top = top;
    }
    
    Elemen getTop(){
        return top;
    } 
    
    void createEmpty(){
        top = null;
    }
    
    boolean isEmpty(){
        boolean hasil = false;
        if(top==null){
            hasil = true;
        }
        return hasil;
    }
    
    int countElemen(){
        Elemen bantu;
        int hasil =0;
        if(top!=null){
            bantu = top;
            while(bantu!=null){
                hasil = hasil +1;
                bantu = bantu.getNext();
            }
        }
        return hasil;
    }
    
    void push (String nim, String nama, double nilai){
        Elemen baru;
        baru = new Elemen();
        baru.getKontainer().setNim(nim);
        baru.getKontainer().setNama(nama);
        baru.getKontainer().setNilai(nilai);
        
        if(top==null){
            baru.setNext(null);
        }
        else{
            baru.setNext(top);
        }
        top = baru;
        baru = null;
    }
    
    void pop(){
        Elemen hapus;
        if(top!= null){
            hapus = top;
            if(countElemen()==1){
                top=null;
            }
            else{
                top=top.getNext();
            }
            hapus.setNext(null);                
        }
        else{
            System.out.println("Stack Kosong!!");
        }
    }
    
    void printStack(){
        int i;
        Elemen bantu;
        if(top!=null){
            System.out.println("-----ISI STACK-----");
            bantu=top;
            i=1;
            while(bantu!=null){
                System.out.println("===================");
                System.out.println("Elemen ke-"+i);
                System.out.println("Nim   : "+bantu.getKontainer().getNim());
                System.out.println("Nama  : "+bantu.getKontainer().getNama());
                System.out.println("Nilai : "+bantu.getKontainer().getNilai());
                bantu = bantu.getNext();
                i=i+1;
            }
            System.out.println("-------------------");
        }
        else{
            System.out.println("Stack Kosong!!!");
        }
    }
    
}

public class CobaStackDinamis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack S = new Stack();
        S.createEmpty();
        S.printStack();
        
        S.push("13507701", "Nana", 64.75);
        S.push("13507702", "Rudi", 75.11);
        S.push("13507703", "Dea", 84.63);
        S.printStack();
        
        System.out.println("===================");
        S.pop();
        S.pop();
        S.printStack();
    }
    
}
