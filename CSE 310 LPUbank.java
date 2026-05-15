// Abstract Class: The Blueprint
abstract class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String name, double amt) {
        this.accountHolder = name;
        this.balance = amt;
    }

    // Concrete Method: Every account shows info the same way
    void displayBalance() {
        System.out.println(accountHolder + "'s Balance: " + balance);
    }

    // Abstract Method: No body! 
    // This forces Savings and Current classes to write their own logic.
    abstract void calculateInterest();
}

// Concrete Class: Providing the specific "How"
class SavingsAccount extends BankAccount {
    SavingsAccount(String name, double amt) {
        super(name, amt);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.05; // 5% interest logic
        System.out.println("Savings Interest: " + interest);
    }
}

// Concrete Class: A different "How"
class CurrentAccount extends BankAccount {
    CurrentAccount(String name, double amt) {
        super(name, amt);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.01; // 1% interest logic
        System.out.println("Current Interest: " + interest);
    }
}
