package decorator.invoice;

public abstract class InvoiceDecorator implements Invoice {

    protected Invoice invoice;

    public InvoiceDecorator(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public double getAmount() {
        return invoice.getAmount();
    }
}