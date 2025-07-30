package caseStudyOOPS;

public class UpiPayment extends Payment {
    String upiId;

    public UpiPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    public void processPayment() {
        System.out.println("Paid ₹" + amount + " via UPI: " + upiId);
    }
}
