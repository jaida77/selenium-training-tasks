package caseStudyOOPS;

public class Furniture extends Product {
    String material, type;

    public Furniture(String id, String name, double price, String material, String type) {
        super(id, name, price);
        this.material = material;
        this.type = type;
    }

    public void displayDetails() {
        System.out.println("Furniture: " + name + ", Material: " + material + ", Type: " + type + ", Price: ₹" + price);
    }
}