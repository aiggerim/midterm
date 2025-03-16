package OnlinePaymentGateway;

class PaymentFactory {
    public static PaymentMethod createPayment(String type) {
        switch (type.toLowerCase()) {
            case "creditcard": return new CreditCardPayment();
            case "paypal": return new PayPalAdapter();
            case "crypto": return new CryptoPayment();
            default: throw new IllegalArgumentException("Unknown payment type");
        }
    }
}
