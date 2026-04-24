import java.util.Scanner;

// Interface
interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

// Abstract class (partial implementation)
abstract class PartialOrder implements Order {
    protected String item;
    protected int quantity;
    protected int orderId;
    protected double pricePerUnit = 100; // fixed price for simplicity

    @Override
    public void placeOrder(String item, int qty) {
        this.item = item;
        this.quantity = qty;
        this.orderId = (int)(Math.random() * 1000); // generate random order ID
        System.out.println("Order placed successfully!");
        System.out.println("Order ID: " + orderId);
    }
}

// Concrete class
class FinalOrder extends PartialOrder {

    @Override
    public void cancelOrder(int orderId) {
        if (this.orderId == orderId) {
            System.out.println("Order with ID " + orderId + " has been cancelled.");
            this.item = null;
            this.quantity = 0;
        } else {
            System.out.println("Invalid Order ID!");
        }
    }

    @Override
    public void generateBill() {
        if (item == null) {
            System.out.println("No active order to generate bill.");
            return;
        }

        double total = quantity * pricePerUnit;

        System.out.println("\n----- BILL -----");
        System.out.println("Order ID: " + orderId);
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per unit: " + pricePerUnit);
        System.out.println("Total Amount: " + total);
        System.out.println("----------------");
    }
}

// Main class
public class Main29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FinalOrder order = new FinalOrder();
	System.out.println("240390107010");
        System.out.print("Enter item name: ");
        String item = sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        order.placeOrder(item, qty);

        System.out.println("\n1. Generate Bill");
        System.out.println("2. Cancel Order");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            order.generateBill();
        } else if (choice == 2) {
            System.out.print("Enter Order ID to cancel: ");
            int id = sc.nextInt();
            order.cancelOrder(id);
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}