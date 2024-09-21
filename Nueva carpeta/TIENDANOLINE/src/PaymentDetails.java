public class PaymentDetails {
    private double amount;
    private String method;

    public PaymentDetails(double amount, String method) {
        this.amount = amount;
        this.method = method;
    }

    public double getAmount() {
        return amount;
    }

    public String getMethod() {
        return method;
    }
}
