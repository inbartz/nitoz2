import com.sun.jndi.cosnaming.IiopUrl;
import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

public class Customer {

    private Account account;
    private String id;
    private String phone;
    private String email;
    private Address address;

    public Customer(String id, String phone, String email, Address address) {
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.account = new Account(this);
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
