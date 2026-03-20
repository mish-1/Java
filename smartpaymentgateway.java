abstract class payment{
    private int transactionId;
    private double amount;
   public payment(int transactionId, double amount){
        this.transactionId = transactionId;
        this.amount = amount;
    }
    abstract void processPayment(int transactionId, double amount);
};
class upi extends payment{
    private String upiId;
    public upi(int transactionId, double amount, String upiId){
        super(transactionId, amount);
        this.upiId = upiId;
    }

    @Override
    void processPayment(int transactionId, double amount) {
        System.out.println("Processing UPI payment of " + amount + " with UPI ID: " + upiId);
    }
}
class creditcard extends payment{
    private String cardNumber;
    public creditcard(int transactionId, double amount, String cardNumber){
        super(transactionId, amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment(int transactionId, double amount) {
        System.out.println("Processing Credit Card payment of " + amount*0.02 + "with transaction ID: " + transactionId);
    }
}
   
class smartpaymentgateway {
    public static void main(String[] args) {
        upi upiPayment = new upi(1, 1000.0, "user@upi");
        creditcard cardPayment = new creditcard(2, 2000.0, "1234-5678-9012-3456");

        upiPayment.processPayment(1, 1000.0);
        cardPayment.processPayment(2, 2000.0);
    }
}