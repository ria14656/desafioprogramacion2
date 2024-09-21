public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Escenario 1: Pago con tarjeta de crédito
        PaymentDetails creditCardDetails = new PaymentDetails(100.00, "Tarjeta de Crédito");
        processor.setPaymentStrategy(new CreditCardPayment("1234567812345678", "12/23", "123"));
        processor.processPayment(creditCardDetails);

        // Escenario 2: Pago con criptomonedas
        PaymentDetails cryptoDetails = new PaymentDetails(150.00, "Criptomonedas");
        processor.setPaymentStrategy(new CryptocurrencyPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
        processor.processPayment(cryptoDetails);

        // Escenario 3: Transferencia bancaria
        PaymentDetails bankTransferDetails = new PaymentDetails(200.00, "Transferencia Bancaria");
        processor.setPaymentStrategy(new BankTransferPayment("987654321"));
        processor.processPayment(bankTransferDetails);

        // Escenario 4: Pago fallido (ejemplo)
        PaymentDetails invalidCardDetails = new PaymentDetails(50.00, "Tarjeta de Crédito");
        processor.setPaymentStrategy(new CreditCardPayment("", "12/23", "123")); // Tarjeta inválida
        processor.processPayment(invalidCardDetails);
    }
}