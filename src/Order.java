import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Order {
    enum OrderStatus {New, Hold, Shipped, Delivered, Closed}

    private String number ;
    private Date ordered ;
    private Date shipped ;
    private Address ship_to;
    private OrderStatus status ;
    private float total;
    private static int countNumber =0;
    private ArrayList<LineItem> itemsInOrder;
    private int totalPrice;

    public Order(Address ship_to) {
        this.number = ""+(countNumber++);
        this.ordered = new Date(System.currentTimeMillis());
        this.ship_to = ship_to;
        this.status = OrderStatus.New;
        this.total = 0;
    }

    public String toString() {
        String s = "Order number:" + number + "/n" + "Date of order:" + ordered + "/n" + "Date shipped:" + shipped + "ship_to:" + ship_to.toString() +
                "Order status:" + status + "/n" + "Total:" + total;
        return s;
    }

    public Date getShipped() {
        return shipped;
    }

    public void setShipped(Date shipped) {
        this.shipped = shipped;
    }

    private void addToOrder(Product product, int quantity){
        LineItem newItem = new LineItem( product, quantity);
    }

    private int totalPrice(){
        int tot= 0 ;
        for(LineItem item : itemsInOrder){
            tot= tot+item.getPrice();
        }
        return tot;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}