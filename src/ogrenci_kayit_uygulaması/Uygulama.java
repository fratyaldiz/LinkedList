package ogrenci_kayit_uygulaması;

import java.util.Scanner;

public class Uygulama {
    public static void main(String[] args) {
        int secim = -1;
        OgrListe bilBolum = new OgrListe();

        Scanner scanner = new Scanner(System.in);
        while(secim != 0){
            System.out.println("Bilgisayar bölümü öğrenci kayıt uygulaması ");
            System.out.println("1- Yeni Kayıt");
            System.out.println("2- Kayıt sil");
            System.out.println("3- Kayıtları listele");
            System.out.println("4- En başarılı öğrenci bilgileri");
            System.out.println("0- Çıkış");
            System.out.print("Seçiminiz: ");

            secim = scanner.nextInt();

            if(secim == 1){
                bilBolum.add();
            }
            else if(secim == 2){
                bilBolum.delete();
            }
            else if(secim == 3){
                bilBolum.print();
            }
            else if(secim == 4){
                bilBolum.enBaariliOrenci();
            } else if (secim == 0) {
                System.out.println("Program Sonlandırılıyor...");
                break;
            }
            else{
                System.out.println("Geçersiz giriş!!");
            }
        }
    }
}
