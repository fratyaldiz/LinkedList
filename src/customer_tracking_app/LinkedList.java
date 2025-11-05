package customer_tracking_app;

import java.util.Scanner;

public class LinkedList {
    Scanner scanner=new Scanner(System.in);

    CustomerNode head =null;
    CustomerNode tail =null;

    int id;
    String name;
    String surname;
    String tel;
    String address;
    String product;

    void add(){

        System.out.println("Enter of customer information: ");
        System.out.println("Id: ");id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Name: ");name=scanner.next();
        System.out.println("Surname: ");surname=scanner.next();
        System.out.println("Tel: ");tel=scanner.next();
        System.out.println("Address: ");address=scanner.next();
        System.out.println("Product: ");product=scanner.next();


        CustomerNode newNode = new CustomerNode(id,name,surname,tel,address,product);       //eleman = newNode

        if(head==null){
            head=newNode;
            tail=newNode;
            System.out.println("List created and first customer added");
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
            System.out.println("Customer number "+ id + " was registered");
        }


    }
    void delete(){
        boolean result=false;
        if (head==null){
            System.out.println("List is empty");
        }
        else{
            System.out.print("Enter the ID of the customer to be deleted: "); id=scanner.nextInt();
            scanner.nextLine();

            if(head.next ==null && head.id == id){
                head = null;
                tail=null;
                System.out.println("Customer number "+ id + " was deleted");
                result=true;
            }
            else if(head.next !=null && head.id == id){ //If there is more than one element in the list and I want to delete the first element
                head = head.next;
                head.prev=null;
                System.out.println("Customer number "+ id + " was removed");
                result=true;
            } else if (tail.id ==id){
                tail = tail.prev;
                tail.next = null;
                System.out.println("Customer number "+ id + " was removed");
                result=true;
            }
            else{   //delete element from range
                CustomerNode temp = head;
                while(temp != null){
                    if(temp.id == id){
                       temp.next.prev=temp.prev;
                       temp.prev.next = temp.next;
                       result=true;
                       break;
                    }
                    temp = temp.next;
                }

            }
            if(!result){
                System.out.println("Customer number "+ id + " is not on the list");
            }

        }


    }
    void update(){
        boolean result=false;
        if (head==null){
            System.out.println("List is empty");
        }
        else{
            System.out.print("Enter the ID of the customer to be updated: ");id=scanner.nextInt();
            scanner.nextLine();

            CustomerNode temp = head;
            while(temp!=null){
                if(temp.id == id){
                    System.out.println("Customer information number "+id);
                    System.out.println("Name: "+temp.name);
                    System.out.println("Surname: "+temp.surname);
                    System.out.println("Tel: "+temp.tel);
                    System.out.println("Address: "+temp.address);
                    System.out.println("Product: "+temp.product);

                    System.out.println("Update of product information: ");
                    temp.product = scanner.nextLine();
                    System.out.println("Product information updated. ");

                    result=true;
                    break;
                }
                temp = temp.next;
            }
            if(!result){
                System.out.println("Customer number "+ id + " is not on the list");
            }
        }
    }
    void findCustomer(){
        boolean result=false;
        if (head==null){
            System.out.println("List is empty");
        }
        else{
            System.out.print("Enter the customer number you are looking for: ");id=scanner.nextInt();
            scanner.nextLine();

            CustomerNode temp = head;
            while(temp!=null){
                if(temp.id == id){
                    System.out.println("Customer information number "+id);
                    System.out.println("Name: "+temp.name);
                    System.out.println("Surname: "+temp.surname);
                    System.out.println("Tel: "+temp.tel);
                    System.out.println("Address: "+temp.address);
                    System.out.println("Product: "+temp.product);
                    result=true;
                    break;
                }
                temp = temp.next;
            }
            if(!result){
                System.out.println("Customer number "+ id + " is not on the list");
            }
        }
    }
    void printCustomer(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            System.out.println("ID\tName\tSurname\tTel\tAddress\tProduct\n");
            CustomerNode temp = head;
            while(temp!=null){
                System.out.println(temp.id + "\t" + temp.name + "\t" + temp.surname + "\t" + temp.tel + "\t" + temp.address+"\t"+temp.product);
                temp = temp.next;
            }
        }
    }



}
