import java.util.Scanner;

public class AtmCashier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        int[] notes = {100, 50, 10, 5, 2, 1};

        for (int note : notes) {
            int count = amount / note;
            if (count > 0) {
                System.out.println(note + " : " + count);
                amount = amount % note;
            }
        }

        sc.close();
    }
}
