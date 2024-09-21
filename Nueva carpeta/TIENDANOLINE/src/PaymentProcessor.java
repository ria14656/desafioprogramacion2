public class PaymentProcessor {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(PaymentDetails details) {
        if (strategy.validate()) {
            strategy.process();
            System.out.printf("Pago de %.2f procesado con éxito mediante %s.%n", details.getAmount(), details.getMethod());
        } else {
            System.out.println("Error en la validación del pago.");
        }
    }
}