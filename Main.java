class BankAccount {
    private String accountHolderName;
    private String bankName;
    private double accountBalance;

    
    public BankAccount(String accountHolderName, String bankName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = initialBalance;
    }

    
    public double getBalance() {
        return accountBalance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
        }
    }

   
    public void displayAccount() {
        System.out.println("Account Holder: " + accountHolderName +
                           ", Bank: " + bankName +
                           ", Balance: ₹" + accountBalance);
    }
}

public class Main {
    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount("Rahul", "ICICI", 10000);
        BankAccount account2 = new BankAccount("Neha", "HDFC", 15000);
        BankAccount account3 = new BankAccount("Amit", "SBI", 12000);

        
        account1.deposit(2000);
        account1.withdraw(500);

        account2.deposit(3000);
        account2.withdraw(1000);

        account3.deposit(2500);
        account3.withdraw(1500);

        
        account1.displayAccount();
        account2.displayAccount();
        account3.displayAccount();
    }
}