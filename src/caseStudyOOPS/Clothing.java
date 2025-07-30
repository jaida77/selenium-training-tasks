package caseStudyOOPS;

public class Clothing extends Product {
    String size;
    String fabric;

    public Clothing(String id, String name, double price, String size, String fabric) {
        super(id, name, price);
        this.size = size;
        this.fabric = fabric;
    }

    public void displayDetails() {
        System.out.println("Clothing: " + name + ", Size: " + size + ", Fabric: " + fabric + ", Price: ₹" + price);
    }
}
