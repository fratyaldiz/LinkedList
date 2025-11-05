package customer_tracking_app;

public class CustomerNode {
    int id;
    String name;
    String surname;
    String tel;
    String address;
    String product;

    CustomerNode next;
    CustomerNode prev;

    public CustomerNode(int id, String name, String surname, String tel, String address, String product) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.tel = tel;
        this.address = address;
        this.product = product;
        next = null;
        prev = null;
    }


}
