package ListStatis;

class NilaiMatkul {
    private String nim;
    private String nama;
    private String nilai;
    
    NilaiMatkul() {
    }
    
    void setNim(String nim) {
        this.nim = nim;
    }
    
    String getNim() {
        return nim;
    }
    
    void setNama(String nama) {
        this.nama = nama;
    }
    
    String getNama() {
        return nama;
    }
    
    void setNilai(String nilai) {
        this.nilai = nilai;
    }
    
    String getNilai() {
        return nilai;
    }
}

class Elemen {
    private final NilaiMatkul kontainer;
    private int next;
    
    Elemen() {
        kontainer = new NilaiMatkul();
    }
    
    NilaiMatkul getKontainer() {
        return kontainer;
    }
    
    void setNext(int next) {
        this.next = next;
    }
    
    int getNext() {
        return next;
    }
}

class List {
    private int first;
    private Elemen[] data = new Elemen[10];
    private int i;
    
    List() {
        for(int a=0; a<10; a++) {
            data[a] = new Elemen();
        }
    }

    void setFirst(int first) {
        this.first = first;
    }
    
    int getFisrt() {
        return first;
    }

    void createList() {
        first = -1;
        
        for(int a=0; a<10; a++) {
            data[a].setNext(-2);
        }
    }
    
    int countElemen() {
        int hasil = 0;
        int bantu;
        
        if(first != -1) {
            bantu = first;
            
            while(bantu != -1) {
                hasil += 1;
                bantu = data[bantu].getNext();
            }
        }
        
        return hasil;
    }
    
    int emptyElemen() {
        int hasil = -1;
        boolean ketemu;
        
        if(countElemen() < 10) {
            ketemu = false;
            int a = 0;
            
            while((ketemu == false) && (a < 10)) {
                if(data[a].getNext() == -2) {
                    hasil = a;
                    ketemu = true;
                } else {
                    a += 1;
                }
            }
        }
        
        return hasil;
    }
    
    void addFirst(String nim, String nama, String nilai) {
        int baru;
        
        if(countElemen() < 10) {
            baru = emptyElemen();
            
            data[baru].getKontainer().setNim(nim);
            data[baru].getKontainer().setNama(nama);
            data[baru].getKontainer().setNilai(nilai);
            
            if(first == -1) {
                data[baru].setNext(-1);
            } else {
                data[baru].setNext(first);
            }
            
            first = baru;
        } else {
            System.out.println("Array penuh. Tidak bisa ditambah.");
        }
    }
    
    void addAfter(int prev, String nim, String nama, String nilai) {
        int baru;
        
        if ((countElemen() < 10) && (prev != -1)) {
            baru = emptyElemen();
            
            data[baru].getKontainer().setNim(nim);
            data[baru].getKontainer().setNama(nama);
            data[baru].getKontainer().setNilai(nilai);
            
            if(data[prev].getNext() == -1) {
                data[baru].setNext(-1);
            } else {
                data[baru].setNext(data[prev].getNext());
            }
            
            data[prev].setNext(baru);
        } else {
            System.out.println("Array penuh. Tidak bisa ditambah.");
        }
    }
    
    void addLast(String nim, String nama, String nilai) {
        int last;
        
        if(first == -1) {
            addFirst(nim, nama, nilai);
        } else {
            last = first;
            
            while(data[last].getNext() != -1) {
                last = data[last].getNext();
            }
            
            addAfter(last, nim, nama, nilai);
        }
    }
    
    void delFirst() {
        int hapus;
        
        if(first != -1) {
            hapus = first;
            
            if(countElemen() == 1) {
                first = -1;
            } else {
                first = data[first].getNext();
            }
        } else {
            System.out.println("List kosong, tidak bisa dihapus");
        }
    }
    
    void delAfter(int prev) {
        int hapus;
        
        if(prev != -1) {
            hapus = data[prev].getNext();
            
            if(hapus != -1) {
                data[prev].setNext(-1);
            } else {
                data[hapus].setNext(-2);
            }
        }
    }
    
    void delLast() {
        int last, before_last;
        
        if(first != -1) {
            if(countElemen() == 1) {
                delFirst();
            } else {
                last = first;
                before_last = -1;
                
                while (data[last].getNext() != -1) {
                    before_last = last;
                    last = data[last].getNext();
                }
                
                delAfter(before_last);
            }
        } else {
            System.out.println("List kosong, tidak bisa dihapus.");
        }
    }
    
    void printElement() {
        int bantu;
        
        if(first != -1) {
            bantu = first;
            i = 1;
            
            while(bantu != -1) {
                System.out.println("Elemen ke : " + i);
                System.out.println("NIM : " + data[bantu].getKontainer().getNim());
                System.out.println("Nama : " + data[bantu].getKontainer().getNama());
                System.out.println("Nilai : " + data[bantu].getKontainer().getNilai());
                System.out.println("Next : " + data[bantu].getNext());
                System.out.println("-----------------------");
                
                bantu = data[bantu].getNext();
                i++;
            }
        } else {
            System.out.println("List kosong. Data tidak tersedia.");
        }
    }
}

public class ListStatis {
    public static void main(String[] args) {
        List list = new List();
        
        list.createList();
        list.printElement();
        
        System.out.println("-----------------------");
        list.addFirst("136", "Nana Kayau", "A");
        list.addAfter(list.getFisrt(), "135", "Iza", "A");
        list.addLast("137", "Dodo", "A");
        list.printElement();
        
        System.out.println("-----------------------");
        list.delLast();
        list.delAfter(list.getFisrt());
        list.delFirst();
        list.printElement();
        
        System.out.println("-----------------------");
    }    
}