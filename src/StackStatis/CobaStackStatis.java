package StackStatis;

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

class Stack{
    private int top;
    private NilaiMatKul[] data = new NilaiMatKul[10];
    
    Stack(){
        for(int i=0;i<10;i++)
        {
            data[i] = new NilaiMatKul();
        }
    }
    
    void setTop(int top){
        this.top = top;
    }
    
    int getTop(){
        return top;
    } 
    
    void createEmpty(){
        top=-1;
    }
    boolean isEmpty(){
        boolean hasil = false;
        if(top==-1){
            hasil = true;
        }
        return hasil;
    }
    
    boolean isFull(){
        boolean hasil = false;
        if(top==9){
            hasil = true;
        }
        return hasil;
    }
    
    void push (String nim, String nama, double nilai){
        if(isFull()==true){
            System.out.println("Stack Penuh!!");
        }
        else{
            if(isEmpty()==true){
                top=0;
                data[0].setNim(nim);
                data[0].setNama(nama);
                data[0].setNilai(nilai);
            }
            else{
                top=top+1;
                data[top].setNim(nim);
                data[top].setNama(nama);
                data[top].setNilai(nilai);
            }
        }
    }
    
    void pop(){
        if(top==0){
            top=-1;
        }
        else{
            if(top!=-1){
                top=top-1;
            }
        }            
    }
    
    void printStack(){
        int i;
        if(top!=-1){
            System.out.println("-----ISI STACK-----");
            for(i=top;i>=0;i--){
                System.out.println("===================");
                System.out.println("Elemen ke-"+(i+1));
                System.out.println("Nim   : "+data[i].getNim());
                System.out.println("Nama  : "+data[i].getNama());
                System.out.println("Nilai : "+data[i].getNilai());
            }
            System.out.println("-------------------");
        }
        else{
            System.out.println("Stack Kosong!!!");
        }
    }
}

public class CobaStackStatis {

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
