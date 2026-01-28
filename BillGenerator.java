
import java.util.Scanner;

class BillGenerator {

    void generateBill(int itemTotal) {
        System.out.println("Customer Type: Regular");
        System.out.println("Total Amount = " + itemTotal);
        System.out.println("Final Bill Amount = " + itemTotal);
    }

    void generateBill(int itemTotal, int discount) {
        int finalAmount = itemTotal - discount;

        System.out.println("Customer Type: Privileged");
        System.out.println("Total Amount = " + itemTotal);
        System.out.println("Discount (Flat) = " + discount);

        if (finalAmount < 0) {
            finalAmount = 0;
        }

        System.out.println("Final Bill Amount = " + finalAmount);
    }

    void generateBill(int itemTotal, double discountPercent) {
        double discountAmount = (itemTotal * discountPercent) / 100;
        double finalAmount = itemTotal - discountAmount;

        System.out.println("Customer Type: Festive Offer");
        System.out.println("Total Amount = " + itemTotal);
        System.out.println("Discount (%) = " + discountPercent + "%");
        System.out.println("Discount Amount = " + discountAmount);
        System.out.println("Final Bill Amount = " + finalAmount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BillGenerator bg = new BillGenerator();

        System.out.print("Enter Total Item Amount: ");
        int total = sc.nextInt();

        System.out.println("\nChoose Customer Type:");
        System.out.println("1. Regular Customer");
        System.out.println("2. Privileged Customer (Flat Discount)");
        System.out.println("3. Festive Offer (Percentage Discount)");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.println();

        if (choice == 1) {
            bg.generateBill(total);
        }
        else if (choice == 2) {
            System.out.print("Enter Flat Discount (in rupees): ");
            int disc = sc.nextInt();
            bg.generateBill(total, disc);
        }
        else if (choice == 3) {
            System.out.print("Enter Discount Percentage: ");
            double percent = sc.nextDouble();
            bg.generateBill(total, percent);
        }
        else {
            System.out.println("Invalid Choice!");
        }
    }
}