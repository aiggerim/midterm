package OnlinePaymentGateway;

class TransactionManager {
    public static void logTransaction(String type, double amount) {
        System.out.println("Transaction Log: " + type + " payment of $" + amount);
    }
}
