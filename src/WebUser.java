
public class WebUser {

    enum UserState {New,Active,Blocked,Banned}
    private  String lodin_id;
    private  String password;
    private  UserState state;
    private Customer customer;

    public WebUser( String password, Customer customer) {
        this.lodin_id =customer.getId();
        this.password = password;
        this.state = UserState.New;
        this.customer = customer;
    }

    public String getLodin_id() {
        return lodin_id;
    }

    public String getPassword() {
        return password;
    }

    public UserState getState() {
        return state;
    }

    public void setState(UserState state) {
        this.state = state;
    }


}
