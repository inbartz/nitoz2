import java.util.Date;

public class ShoppingCart {
    private Date created ;
    private Account account;
    private WebUser webUser;

    public ShoppingCart(Date created, Account account, WebUser webUser) {
        this.created = created;
        this.account = account;
        this.webUser = webUser;
    }
}
