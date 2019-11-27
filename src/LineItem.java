
public class LineItem {
    private int quantity ;
    private int price ;
    private Product product;

    public LineItem(Product product ,int quantity) {
        this.quantity = quantity;
        this.product = product;
        this.price = product.getPrice()*quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.price = product.getPrice()*quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }
}
