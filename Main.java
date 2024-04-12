public class Main {
    public static void main(String[] args) {
        Payment p1 = new CashPayment();
        p1.pay(199.90);
        AbstractPayment ab = new PaymentSender(p1);
        ab.sendPayment();


    }
}
