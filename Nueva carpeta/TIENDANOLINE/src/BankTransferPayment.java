public class BankTransferPayment implements PaymentStrategy {
    private String bankAccount;

    public BankTransferPayment(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public boolean validate() {
        // Simulación de validación de transferencia bancaria
        return !bankAccount.isEmpty();
    }

    @Override
    public void process() {
        System.out.println("Procesando transferencia bancaria.");
        // Lógica de procesamiento
    }
}