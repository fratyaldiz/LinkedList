package tree_ogrenci_kayit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Tree ogr = new Tree();
        Scanner scanner = new Scanner(System.in);

        int choice = menu(scanner);

        while (choice != 0) {
            switch (choice) {

                case 1:
                    System.out.print("Ogrenci No: ");
                    int no = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ogrenci Adi: ");
                    String name = scanner.nextLine();

                    System.out.print("Not: ");
                    int not = scanner.nextInt();

                    ogr.add(no, name, not);
                    System.out.println("Ogrenci eklendi.");
                    break;

                case 2:
                    System.out.print("Silinecek ogrenci no: ");
                    int silNo = scanner.nextInt();

                    ogr.delete(silNo);
                    System.out.println("Ogrenci silindi.");
                    break;

                case 3:
                    System.out.println("Ogrenci Listesi:");
                    ogr.print();
                    break;

                default:
                    System.out.println("Gecersiz secim!");
            }

            System.out.println();
            choice = menu(scanner);
        }

        System.out.println("Program sonlandi.");
        scanner.close();
    }

    private static int menu(Scanner scanner) {
        System.out.println("1- Add");
        System.out.println("2- Delete");
        System.out.println("3- Print");
        System.out.println("0- Exit");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }
}
