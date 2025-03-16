package OnlinePaymentGateway;

class PayPalAdapter implements PaymentMethod {
    private ExternalPayPalAPI paypalAPI;

    public PayPalAdapter() {
        this.paypalAPI = new ExternalPayPalAPI();
    }

    public void processPayment(double amount) {
        paypalAPI.sendPayment(amount);
    }
}
