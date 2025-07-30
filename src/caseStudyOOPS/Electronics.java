package caseStudyOOPS;

public class Electronics extends Product {
    String brand;
    int warranty;

    public Electronics(String id, String name, double price, String brand, int warranty) {
        super(id, name, price);
        this.brand = brand;
        this.warranty = warranty;
    }

    public void displayDetails() {
        System.out.println("Electronics: " + name + ", Brand: " + brand + ", Warranty: " + warranty + " months, Price: ₹" + price);
    }
}

