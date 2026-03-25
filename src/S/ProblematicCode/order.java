package S.ProblematicCode;

import java.util.*;

class Order {
    private List<String> items;
    private double total;

    public Order(List<String> items, double total) {
        this.items = items;
        this.total = total;
    }

    // Business Logic
    public void calculateTotal() {
        System.out.println("Calculating total: " + total);
    }

    // Database Logic
    public void saveToDatabase() {
        System.out.println("Saving order to database...");
    }

    // Email Logic
    public void sendConfirmationEmail() {
        System.out.println("Sending confirmation email...");
    }

    // Invoice Logic
    public void generateInvoice() {
        System.out.println("Generating invoice PDF...");
    }
    public static void main(String[] args) {
        Order order = new Order(Arrays.asList("Item1", "Item2"), 500);

        order.calculateTotal();
        order.saveToDatabase();
        order.sendConfirmationEmail();
        order.generateInvoice();
    }
}

