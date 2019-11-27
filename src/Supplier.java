import java.util.ArrayList;

public class Supplier {
    private String id;
    private String name;
    private ArrayList<Product> productslList;

    public Supplier(String id, String name) {
        this.id = id;
        this.name = name;
        productslList = new ArrayList<>();
    }

    public void addToList(Product product){
        productslList.add(product);
    }
}
