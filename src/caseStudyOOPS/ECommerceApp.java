
package caseStudyOOPS;

import java.util.*;

public class ECommerceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Customer Info
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your email: ");
        String email = sc.nextLine();
        Customer c1 = new Customer(name, email);

        // 2. Show products
        List<Product> allProducts = new ArrayList<>();
        allProducts.add(new Electronics("E01", "Laptop", 55000, "Dell", 24));
        allProducts.add(new Books("B01", "Atomic Habits", 499, "James Clear", "Self-help"));
        allProducts.add(new Furniture("F01", "Chair", 2999, "Wood", "Seating"));

        InventoryManager inventory = new InventoryManager();
        for (Product p : allProducts) inventory.addStock(p.id, 5);

        System.out.println("\nAvailable Products:");
        for (int i = 0; i < allProducts.size(); i++) {
            System.out.print((i + 1) + ". ");
            allProducts.get(i).displayDetails();
        }

        // 3. User selects products
        List<Product> cart = new ArrayList<>();
        while (true) {
            System.out.print("Enter product number to add to cart (0 to stop): ");
            int choice = sc.nextInt();
            if (choice == 0) break;
            if (choice > 0 && choice <= allProducts.size()) {
                Product selected = allProducts.get(choice - 1);
                if (inventory.reduceStock(selected.id, 1)) {
                    cart.add(selected);
                } else {
                    System.out.println("Sorry, out of stock!");
                }
            } else {
                System.out.println("Invalid choice.");
            }
        }

        if (cart.isEmpty()) {
            System.out.println("No products selected. Exiting.");
            return;
        }

        // 4. Payment method
        System.out.println("\nSelect Payment Method:");
        System.out.println("1. Card");
        System.out.println("2. UPI");
        System.out.println("3. Cash on Delivery");
        System.out.print("Choice: ");
        int paymentChoice = sc.nextInt();
        sc.nextLine(); // Consume newline

        Order order = new Order(c1, cart);
        Discountable discount = amt -> amt * 0.9;
        double discountedAmount = discount.applyDiscount(order.totalAmount);
        Payment payment = null;

        switch (paymentChoice) {
            case 1:
                System.out.print("Enter card number: ");
                String card = sc.nextLine();
                payment = new CardPayment(discountedAmount, card);
                break;
            case 2:
                System.out.print("Enter UPI ID: ");
                String upi = sc.nextLine();
                payment = new UpiPayment(discountedAmount, upi);
                break;
            case 3:
                payment = new CashOnDelivery(discountedAmount);
                break;
            default:
                System.out.println("Invalid payment option. Exiting.");
                return;
        }

        // 5. Place order
        order.placeOrder(payment, discount);
        order.saveToFile();
    }
}

