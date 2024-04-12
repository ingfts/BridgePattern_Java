public class PaymentSender extends AbstractPayment{



    //payment -> instance
    public PaymentSender(Payment payment){
        super(payment);

    }


    @Override
    public void sendPayment(){
        System.out.println("Payment completed successfully!");

    }

}
