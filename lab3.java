import java.util.Scanner;


interface BankOperations {
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
}


class BankAccount implements BankOperations {
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
            System.out.printf("%.2f deposited successfully.\n", amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.printf("%.2f withdrawn successfully.\n", amount);
        } else if (amount > accountBalance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void displayAccount() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Bank Name: " + bankName);
        System.out.printf("Account Balance: %.2f\n", accountBalance);
        System.out.println("---------------------------");
    }
}


class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}


class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}


class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class lab3 {
    public static void main(String[] args) {
        
        System.out.println("----- Bank Accounts -----");

        BankAccount acc1 = new BankAccount("Alice", "ICICI", 1000);
        BankAccount acc2 = new BankAccount("Bob", "HDFC", 2000);
        BankAccount acc3 = new BankAccount("Charlie", "SBI", 3000);

        
        acc1.deposit(500);
        acc1.withdraw(200);
        acc1.displayAccount();

        acc2.deposit(1000);
        acc2.withdraw(3500);  
        acc2.withdraw(1500);
        acc2.displayAccount();

        acc3.deposit(200);
        acc3.withdraw(500);
        acc3.displayAccount();

        // Lab-4 
        System.out.println("-----  Animal Sounds -----");
        Scanner sc = new Scanner(System.in);

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Animal makes sound:");
        animal.makeSound();

        System.out.println("Dog makes sound:");
        dog.makeSound();

        System.out.println("Cat makes sound:");
        cat.makeSound();

        
        System.out.println("\nChoose an animal to hear its sound (dog/cat/animal):");
        String choice = sc.nextLine().toLowerCase();

        switch (choice) {
            case "dog":
                dog.makeSound();
                break;
            case "cat":
                cat.makeSound();
                break;
            case "animal":
                animal.makeSound();
                break;
            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
