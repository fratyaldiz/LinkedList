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
    void aradanSil(int indis) {
        if(head != null){

            // Eğer listede tek bir düğüm varsa (head.next == null)
            // ve silinmek istenen indis ilk düğümü işaret ediyorsa (indis <= 0)
            if (head.next == null && indis <= 0){
                head = null; // Başı null yap
                tail = null; // Sonu null yap (Liste artık boş)
            }

            else if(head.next != null && indis <= 0){
                bastanSil();
            }

            // 4. Liste uzunluğunu hesaplama ve sondan silme durumu:
            else{
                int n = 0; // Düğüm sayısını tutacak değişken
                Node temp = head; // Geçici gezgin değişkeni baştan başlar

                // Liste sonuna kadar giderek düğüm sayısını (n) bul.
                while (temp != null){
                    n++;
                    temp = temp.next;
                }

                // temp'i tekrar kullanacağımız için, baştan ilerlemeden önce listenin uzunluğu (n) biliniyor.

                if(indis >= (n - 1)){
                    sondanSil();
                }

                // 5. Aradan Silme Durumu:
                else{
                    temp = head; // temp'i tekrar listenin başına getir
                    int i = 0;

                    // Silinecek olan düğüme (indis'teki düğüme) kadar ilerle.
                    while(i < indis){
                        i++;
                        temp = temp.next;
                    }

                    // Silme İşlemi (temp, silinecek düğümü işaret ediyor):
                    // Bu işlemde temp'i listeden çıkarıp, onun komşu düğümlerini birbirine bağlıyoruz.

                    // Silinecek düğümün (temp) next'inin prev'ini, temp'in prev'ine bağla.
                    // (Sağdaki düğümün geri oku, soldaki düğüme bağlandı)
                    temp.next.prev = temp.prev;

                    // Silinecek düğümün (temp) prev'inin next'ini, temp'in next'ine bağla.
                    // (Soldaki düğümün ileri oku, sağdaki düğüme bağlandı)
                    temp.prev.next = temp.next;

                    // temp artık referans edilmiyor (Java Garbage Collector devreye girecektir).
                }
            }
        }
    }
}
