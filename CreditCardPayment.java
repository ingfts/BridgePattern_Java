public class CreditCardPayment implements Payment{

    @Override
    public void pay(double debt){
        System.out.println("Total debt amount: " + debt + "\nPayment method: Credit card");
    }
}
