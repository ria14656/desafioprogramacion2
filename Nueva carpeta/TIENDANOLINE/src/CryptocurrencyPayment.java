public class CryptocurrencyPayment implements PaymentStrategy {
    private String walletAddress;

    public CryptocurrencyPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public boolean validate() {
        // Simulación de validación de dirección de billetera
        return !walletAddress.isEmpty();
    }

    @Override
    public void process() {
        System.out.println("Procesando pago con criptomonedas.");
        // Lógica de procesamiento
    }
}