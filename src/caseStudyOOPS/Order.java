package caseStudyOOPS;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Order {
    Customer customer;
    List<Product> products;
    double totalAmount;

    public Order(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
        this.totalAmount = products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void placeOrder(Payment payment, Discountable discount) {
        products.forEach(Product::displayDetails);
        double discountedAmount = discount.applyDiscount(totalAmount);
        System.out.println("Total after discount: ₹" + discountedAmount);
        payment.processPayment();
        System.out.println("Order placed successfully for " + customer);
    }

    public void cancelOrder() {
        System.out.println("Order cancelled. Amount ₹" + totalAmount + " will be refunded.");
    }

    public void saveToFile() {
        try (FileWriter fw = new FileWriter("orders.txt", true)) {
            fw.write("Customer: " + customer + "\n");
            for (Product p : products) {
                fw.write(" - " + p.name + " ₹" + p.price + "\n");
            }
            fw.write("Total: ₹" + totalAmount + "\n\n");
            System.out.println("Order saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving order: " + e.getMessage());
        }
    }
}