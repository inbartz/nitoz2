import java.util.ArrayList;

public abstract class Payment {
    private String id;
    private float total;
    private String details;
    private ArrayList<PartInPayment> partInPaymentList;
    private Order order;
    private static int countId;

    public Payment( ArrayList<PartInPayment> partInPaymentList, Order order) {
        this.id = ""+(countId++);
        this.total = order.getTotalPrice();
        this.details = null;
        this.partInPaymentList = partInPaymentList;
        this.order = order;
    }
}
