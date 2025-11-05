package customer_tracking_app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        LinkedList list = new LinkedList();

        int choice=-1;
        while(choice!=0){
            System.out.println("1. Add Customer");
            System.out.println("2. Delete Customer");
            System.out.println("3. Update Customer");
            System.out.println("4. Find Customer");
            System.out.println("5. Print Customer");
            System.out.println("0. Exit");
            System.out.print("Enter your choice");
            choice = scaner.nextInt();
            scaner.nextLine();

            switch (choice){
                case 1: list.add(); break;
                case 2: list.delete(); break;
                case 3: list.update(); break;
                case 4: list.findCustomer(); break;
                case 5: list.printCustomer(); break;
                case 0: System.out.println("Checking Out");break;
                default: System.out.println("Invalid choice");break;
            }
        }
    }
}
