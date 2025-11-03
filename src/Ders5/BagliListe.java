package Ders5;

public class BagliListe {
    //Çift yönlü doğrusal bağlı liste

    Node head = null;
    Node tail = null;

    void basaEkle(int data){
        Node eleman = new Node(data);

        if(head == null){
            head = eleman;
            tail = eleman;
        }
        else{
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
        }
    }
    void sonaEkle(int data){
        Node eleman = new Node(data);

        if(head == null){
            head = eleman;
            tail = eleman;
        }
        else{
            tail.next = eleman;
            eleman.prev = tail;
            tail = eleman;
        }
    }
    void yazdir(){
        Node temp = head;
        System.out.print("Baş ->");
        while(temp != null){
            System.out.print(temp.data + "->");
            temp =  temp.next;
        }

        System.out.print(" Son");
    }
    void sondanYazdir(){
        Node temp = tail;
        System.out.print("son ->");
        while(temp != null){
            System.out.print(temp.data + "->");
            temp =  temp.prev;
        }
        System.out.println(" baş");
    }
    void arayaEkle(int indis, int data) {
        Node eleman = new Node(data);

        if (head == null) { // 1. Liste boşsa
            head = eleman;
            tail = eleman;
        } else if (indis <= 0) { // 2. Başa Ekleme (indis <= 0)
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
        } else {
            Node temp = head;
            int i = 0;

            // Ekleme yapılacak (indis) konumuna kadar ilerle
            // Döngü, (indis - 1). düğümde (yani eklenecek yerden bir önceki düğümde) durmalıdır.
            // Ancak çift yönlü bağlı listede, hedef (indis). düğüme ilerleyip onun prev ve next'ini kullanmak daha kolaydır.
            // Bu yüzden indis'e kadar ilerleyelim.
            while (temp != null && i < indis) {
                temp = temp.next;
                i++;
            }

            if (temp == null) { // 3. Sona Ekleme (indis, liste uzunluğundan büyük veya eşitse)
                tail.next = eleman;
                eleman.prev = tail;
                tail = eleman;
            } else { // 4. Araya Ekleme (0 < indis < uzunluk)
                // temp, ekleme yapılacak olan (indis). düğümdür.

                eleman.prev = temp.prev; // Yeni elemanın prev'i, temp'in (mevcut) prev'i olur
                temp.prev.next = eleman; // temp'in prev'inin next'i yeni eleman olur

                eleman.next = temp;      // Yeni elemanın next'i, temp (mevcut düğüm) olur
                temp.prev = eleman;      // temp'in prev'i yeni eleman olur
            }
        }
    }
    void bastanSil(){
        if(head !=null){
            if(head.next == null){
                head=null;
                tail=null;
            }else{
                head = head.next;
                head.prev=null;
            }

        }
    }
    void sondanSil(){
        if(tail !=null){
            if(tail.prev == null){
                head=null;
                tail=null;
            }else{
                tail = tail.prev;
                tail.next=null;
            }
        }
    }
}
