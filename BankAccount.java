import java.util.Scanner;

class BankAccount {
    String accountId;
    String accountHolderName;
    double balance;

    
    void assignValues(String id, String name, double bal) {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    
    void displayValues() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("---------------------------");
    }

   
    static void searchAccount(BankAccount[] accounts, String searchId) {
        boolean found = false;

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].accountId.equals(searchId)) {
                System.out.println("Account Found!");
                accounts[i].displayValues();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account Not Found!");
        }
    }

    public static void main(String[] args) {

        
        BankAccount[] accounts = new BankAccount[5];

        
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new BankAccount();
        }

        
        accounts[0].assignValues("A101", "Rahul", 5000);
        accounts[1].assignValues("A102", "alia", 8500);
        accounts[2].assignValues("A103", "virat", 12000);
        accounts[3].assignValues("A104", "arshi", 3000);
        accounts[4].assignValues("A105", "soham", 15000);

        
        System.out.println("✅ All Bank Accounts Details:");
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].displayValues();
        }

        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account ID to Search: ");
        String id = sc.nextLine();

        searchAccount(accounts, id);
    }
}