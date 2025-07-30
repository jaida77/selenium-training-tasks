package caseStudyOOPS;

public class CardPayment extends Payment {
    String cardNumber;

    public CardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    public void processPayment() {
        System.out.println("Paid ₹" + amount + " using Card ending with: " + cardNumber.substring(cardNumber.length() - 4));
    }
}
