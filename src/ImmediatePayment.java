import java.util.ArrayList;

public class ImmediatePayment extends Payment {
    private boolean phoneConfirmation;

    public ImmediatePayment( ArrayList<PartInPayment> partInPaymentList, Order order, boolean phoneConfirmation) {
        super( partInPaymentList, order);
        this.phoneConfirmation = phoneConfirmation;
    }

    public boolean isPhoneConfirmation() {
        return phoneConfirmation;
    }

    public void setPhoneConfirmation(boolean phoneConfirmation) {
        this.phoneConfirmation = phoneConfirmation;
    }
}
