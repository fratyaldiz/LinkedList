package Ders_4;

public class Uygulama {
    public static void main(String[] args) {

        TekYönlüListeYapisi tekYonList = new TekYönlüListeYapisi();

        tekYonList.basaEkle(10);
        tekYonList.sonaEkle(20);
        tekYonList.basaEkle(5);
        tekYonList.sonaEkle(30);

        tekYonList.basaEkle(3);
        tekYonList.sonaEkle(40);

        tekYonList.yazdir();
    }
}
