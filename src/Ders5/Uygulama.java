package Ders5;

import java.util.Scanner;

public class Uygulama {
    public static void main(String[]args){

        Scanner scanner =new Scanner(System.in);

        BagliListe bl = new BagliListe();
        int secim = -1,sayi,indis;
        while(secim != -0){
            System.out.println("1- Başa ekle");
            System.out.println("2- Sona ekle");
            System.out.println("3- Araya ekle");
            System.out.println("4- Baştan sil");
            System.out.println("5- Sondan sil");
            System.out.println("6- Aradan sil");
            System.out.println("8- Listeyi Sondan Yazdır");
            System.out.println("0- Çıkış");
            System.out.print("Seçiminiz: ");

            secim = scanner.nextInt();

            if(secim == 1){
                System.out.println("Sayı: ");
                sayi = scanner.nextInt();
                bl.basaEkle(sayi);
            }
            else if(secim == 2){
                System.out.println("Sayı= ");
                sayi = scanner.nextInt();
                bl.sonaEkle(sayi);
            }
            else if(secim == 0){
                System.out.println("Çıkılıyor...");
                break;
            }
            else if(secim == 8){
                bl.sondanYazdir();
            }
            else if(secim == 3){
                System.out.println("İndis: ");
                indis = scanner.nextInt();

                System.out.println("Sayı: ");
                sayi= scanner.nextInt();
                bl.arayaEkle(indis, sayi);
            }
            else if(secim == 4){
                bl.bastanSil();
            }
            else if(secim == 5){
                bl.sondanSil();
            }
            else if(secim == 6){
                System.out.println("İndis: ");
                indis = scanner.nextInt();
                bl.aradanSil(indis);
            }
            else{
                System.out.println("Geçersiz giriş.");
            }


            bl.yazdir();



        }

    }
}
