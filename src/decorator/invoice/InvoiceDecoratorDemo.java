package decorator.invoice;

public class InvoiceDecoratorDemo {

    public static void main(String[] args) {

        Invoice invoice = new BasicInvoice(500);

        invoice = new DeliveryFeeDecorator(invoice);

        invoice = new InsuranceFeeDecorator(invoice);

        System.out.println("Subtotal: " + 500);
        System.out.println("Delivery Fee: " + 2000);
        System.out.println("Insurance Fee: " + 1200);
        System.out.println("--------------------------");
        System.out.println("Final Invoice Amount: " + invoice.getAmount());
    }
}