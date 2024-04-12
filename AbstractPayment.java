public abstract class AbstractPayment {
    protected Payment payment;

    protected AbstractPayment (Payment payment){
        this.payment = payment;

    }

    public abstract void sendPayment();
}
