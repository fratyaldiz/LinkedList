package tree_ogrenci_kayit;

public class Node {
    int no;
    String name;
    int not;
    Node left, right;

    public Node(){
        no = 0;
        name = "";
        not = 0;
        left = right = null;
    }
    public Node(int no, String name,  int not){
        this.no = no;
        this.not = not;
        this.name = name;

        left = right = null;
    }
}
