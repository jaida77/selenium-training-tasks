package caseStudyOOPS;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    Map<String, Integer> stock = new HashMap<>();

    public void addStock(String id, int qty) {
        stock.put(id, stock.getOrDefault(id, 0) + qty);
    }

    public boolean reduceStock(String id, int qty) {
        int available = stock.getOrDefault(id, 0);
        if (available >= qty) {
            stock.put(id, available - qty);
            return true;
        }
        return false;
    }

    public int getStock(String id) {
        return stock.getOrDefault(id, 0);
    }

    public void displayStock() {
        System.out.println("Current Stock:");
        stock.forEach((k, v) -> System.out.println("Product ID: " + k + " | Quantity: " + v));
    }
}
