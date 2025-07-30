package caseStudyOOPS;

public class CashOnDelivery extends Payment {

    public CashOnDelivery(double amount) {
        super(amount);
    }

    public void processPayment() {
        System.out.println("Amount ₹" + amount + " will be collected on delivery (COD).");
    }
}
