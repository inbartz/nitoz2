import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String id;
    private String billing_address;
    private Address adress;
    private boolean is_closed;
    private Date open;
    private Date closed;
    private int balance;
    private Customer customer;
    private ShoppingCart shoppingCart;
    private ArrayList<Order> orders;
    private ArrayList<Payment> payments;

    public Account(Customer customer) {
        this.id = customer.getId();
        //CHECK
        this.adress = customer.getAddress();
        this.billing_address = customer.getAddress().toString();
        this.is_closed = false;
        this.open = new Date(System.currentTimeMillis());
        this.balance = 0;
        this.customer = customer;
        this.orders = new ArrayList<>();
        this.payments = new ArrayList<>();
        this.shoppingCart = new ShoppingCart(open,this,null);
    }
    private void createOrder(){

    }
    public Order addOrder(){
        Order newOrder =new Order(this.adress);
        orders.add(newOrder);
        return newOrder;
    }
}
