package TreeBiner;

class Simpul{
    private char kontainer;
    private Simpul right;
    private Simpul left;
    
    Simpul(){
    
    }
    
    void setKontainer (char kontainer){
        this.kontainer = kontainer;  
    }
    
    char getKontainer(){
        return kontainer;
    }
    
    void setRight(Simpul right){
        this.right = right;
    }
    
    Simpul getRight(){
        return right;
    }
    
    void setLeft(Simpul left){
        this.left = left;
    }
    
    Simpul getLeft(){
        return left;
    }    
}

class Tree{
    private Simpul root;
    
    Tree(){
        root = new Simpul();
    }
    
    void setRoot(Simpul root){
        this.root = root;
    }
    
    Simpul getRoot(){
        return root;
    }
    
    void makeTree(char c){
        Simpul baru;
        
        baru = new Simpul();
        baru.setKontainer(c);
        baru.setRight(null);
        baru.setLeft(null); 
        root = baru;
    }
    
    void addRight(char c, Simpul root){
        Simpul baru;
        
        if(root.getRight()==null){
            baru = new Simpul();
            baru.setKontainer(c);
            baru.setRight(null);
            baru.setLeft(null);
            root.setRight(baru);
        }
        else{
            System.out.println("Sub Pohon Kanan Sudah Ada");
        }
    }
    
    void addLeft(char c, Simpul root){
        Simpul baru;
        
        if(root.getLeft()==null){
            baru = new Simpul();
            baru.setKontainer(c);
            baru.setRight(null);
            baru.setLeft(null);
            root.setLeft(baru);
        }
        else{
            System.out.println("Sub Pohon Kiri Sudah Ada");
        }
    }
    
    void delAll(Simpul root){
        if(root != null){
            delAll(root.getLeft());
            delAll(root.getRight());
            root = null;
        }
    }
    
    void delRight(Simpul root){
        if(root != null){
            if(root.getRight() != null){
                delAll(root.getRight());
                root.setRight(null);
            }
            else{
                System.out.println("Sub Pohon Kanan Sudah Kosong");
            }
        }
        else{
            System.out.println("Pohon Kosong");
        }
    }
    
    void delLeft(Simpul root){
        if(root != null){
            if(root.getLeft() != null){
                delAll(root.getLeft());
                root.setLeft(null);
            }
            else{
                System.out.println("Sub Pohon Kanan Sudah Kosong");
            }
        }
        else{
            System.out.println("Pohon Kosong");
        }
    }
    
    void printTreePreOrder(Simpul root){
        if(root != null){
            System.out.print("  "+root.getKontainer()+" ");
            printTreePreOrder(root.getLeft());
            printTreePreOrder(root.getRight());
        }
    }
    
    void printTreeInOrder(Simpul root){
        if(root != null){
            printTreeInOrder(root.getLeft());
            System.out.print("  "+root.getKontainer()+" ");
            printTreeInOrder(root.getRight());
        }
    }
    
    void printTreePostOrder(Simpul root){
        if(root != null){
            printTreePostOrder(root.getLeft());
            printTreePostOrder(root.getRight());
            System.out.print("  "+root.getKontainer()+" ");
        }
    }
    
    Simpul CopyTree(Simpul root1){
        Simpul root2;
        
        if(root1 == null){
            return root1;
        }
        
        root2 = new Simpul();
        root2.setKontainer(root1.getKontainer());
        root2.setLeft(CopyTree(root1.getLeft()));
        root2.setRight(CopyTree(root1.getRight()));
        return root2;
    }
    
    boolean isEqual(Simpul root1, Simpul root2){
        boolean hasil = true;
        
        if(root1 != null && root2 != null){
            if(root1.getKontainer() != root2.getKontainer()){
                hasil = false;
            }
            else{
                if(root1.getKontainer()==root2.getKontainer() && isEqual(root1.getLeft(), root2.getLeft()) && isEqual(root1.getRight(),root2.getRight())){
                    hasil = true;
                }
                else{
                    hasil = false;
                }
            }
        }
        else{
            if(root1 != null || root2 != null){
                hasil = false;
            }
        }
        return hasil;        
    }
}

public class CobaTreeBiner {
    public static void main(String[] args) {
        Tree T = new Tree();
        
        T.makeTree('A');
        T.addLeft('B', T.getRoot());
        T.addRight('C', T.getRoot());
        T.addLeft('D', T.getRoot().getLeft());
        T.addRight('E', T.getRoot().getLeft());
        T.addRight('F', T.getRoot().getRight());
        
        System.out.println("============================");
        System.out.println("T PreOrder");
        T.printTreePreOrder(T.getRoot());
        System.out.println("\n============================");
        System.out.println("T InOrder");
        T.printTreeInOrder(T.getRoot());
        System.out.println("\n============================");
        System.out.println("T PostOrder");
        T.printTreePostOrder(T.getRoot());
        System.out.println("\n============================");
        
        Tree T2 = new Tree();
        T2.setRoot(T2.CopyTree(T.getRoot()));
        
        System.out.println("\nCek Kesamaan T dan T2 : ");
        
        if(T.isEqual(T.getRoot(), T2.getRoot()) == true){
            System.out.println("Kedua Pohon Sama");
        }
        else{
            System.out.println("Kedua Pohon Berbeda");
        }
        
        T.delRight(T.getRoot().getLeft());
        T.delLeft(T.getRoot().getLeft());
        
        System.out.println("\n============================");
        System.out.println("T PreOrder setelah penghapusan");
        T.printTreePreOrder(T.getRoot());
        System.out.println("\n============================");
        System.out.println("T InOrder setelah penghapusan");
        T.printTreeInOrder(T.getRoot());
        System.out.println("\n============================");
        System.out.println("T PostOrder setelah penghapusan");
        T.printTreePostOrder(T.getRoot());
        System.out.println("\n============================");
        
        System.out.println("\nCek Kesamaan T dan T2 setelah penghapusan : ");
        
        if(T.isEqual(T.getRoot(), T2.getRoot()) == true){
            System.out.println("Kedua Pohon Sama");
        }
        else{
            System.out.println("Kedua Pohon Berbeda");
        }
    }    
}