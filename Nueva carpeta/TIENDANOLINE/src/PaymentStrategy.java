public interface PaymentStrategy {
    boolean validate();
    void process();
}
