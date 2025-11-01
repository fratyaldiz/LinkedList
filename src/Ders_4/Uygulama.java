package Ders_4;

import java.util.Scanner;

public class Uygulama {
    public static void main(String[] args) {

        TekYönlüListeYapisi tekYonList = new TekYönlüListeYapisi();

        int secim = 1;
        Scanner scanner = new Scanner(System.in);
        int sayi,indis;
        while (true) {
            System.out.println("1 başa ekle");
            System.out.println("2 sona ekle");
            System.out.println("3 araya ekle");
            System.out.println("4 baştan sil");
            System.out.println("5 sondan sil");
            System.out.println("6 aradan sil");
            System.out.println("0 çıkış");
            System.out.println("seçiminiz: ");
            secim = scanner.nextInt();


            if (secim == 1) {
                System.out.println("Sayı: ");
                sayi = scanner.nextInt();
                tekYonList.basaEkle(sayi);
            }
            else if (secim == 2) {
                System.out.println("Sayı: ");
                sayi = scanner.nextInt();
                tekYonList.sonaEkle(sayi);
            }
            else if (secim == 3) {
                System.out.println("Sayı: ");
                sayi = scanner.nextInt();
                System.out.println("İndis: ");
                indis = scanner.nextInt();
                tekYonList.arayaEkle(sayi, indis);
            }
            else if (secim == 4) {
                tekYonList.bastanSil();
            }
            else if (secim == 5) {
                tekYonList.sondanSil();
            }
            else if (secim == 6) {
                System.out.println("İndis: ");
                indis = scanner.nextInt();
                tekYonList.aradanSil(indis);
            }
            else if(secim == 0){
                System.out.println("Program sonlandırıldı.");
                break;
            }
            else {
                System.out.println("Hatalı seçim yaptınız.");
            }
            tekYonList.yazdir();
        }
    }
}
