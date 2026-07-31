package decorator.invoice;

public class BasicInvoice implements Invoice {

    private final double amount;

    public BasicInvoice(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }
}