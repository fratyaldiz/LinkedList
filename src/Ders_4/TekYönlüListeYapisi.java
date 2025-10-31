package Ders_4;

public class TekYönlüListeYapisi {
    Node head =  null;
    Node tail = null;

    void basaEkle(int x){
        Node eleman = new Node();
        eleman.data = x;

        if (head == null) {
            eleman.next = null;
            head  = eleman;
            tail = eleman;
            System.out.println("Liste yapısı oluşturuldu ve ilk eleman eklendi");
        }
        else{
            eleman.next = head;
            head  = eleman;
            System.out.println("Başa eleman eklendi");
        }
    }
    void sonaEkle(int x){
        Node eleman = new Node();
        eleman.data = x;
        eleman.next = null;

        if (tail == null) {
            tail = eleman;
            head = eleman;
            System.out.println("Liste yapısı oluşturuldu ve ilk eleman eklendi");
        }
        else{
            tail.next = eleman; //Ekleme yaptık
            tail = eleman;      //İsim güncelliyoruz.
            System.out.println("Sona eleman eklendi");
        }
    }
    void arayEkle(int x){

    }
    void yazdir(){
        if (head == null){
            System.out.print("Liste boş. ");
        }
        else{
            Node temp = head;
            System.out.print("baş ->");
            while (temp != null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("son.");
        }
    }
}
