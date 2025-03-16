package OnlinePaymentGateway;

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentMethod payment = PaymentFactory.createPayment("paypal");
        payment.processPayment(50.0);
        TransactionManager.logTransaction("PayPal", 50.0);
    }
}
