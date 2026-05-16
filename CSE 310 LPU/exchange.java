import java.util.Scanner;

// Step 1: Define Custom Exception Classes with constructors passing messages to parent
class InvalidTransactionException extends Exception {
    public InvalidTransactionException(String message) {
        super(message);
    }
}

class CurrencyConversionException extends Exception {
    public CurrencyConversionException(String message) {
        super(message);
    }
}

// Step 2: Implement the BankAccount Class
class BankAccount {
    private double balance;

    // Constructor required by the footer
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method carrying out the required operations and declaring thrown exceptions
    public void withdrawForeignCurrency(double amountInBaseCurrency, double exchangeRate, double transactionFee) 
            throws InvalidTransactionException, CurrencyConversionException {
        
        // 1. Validate Exchange Rate
        if (exchangeRate <= 0) {
            throw new InvalidTransactionException("Exchange rate cannot be zero or negative.");
        }
        
        // 2. Validate Transaction Fee Limit (3% check)
        if (transactionFee > (amountInBaseCurrency * 0.03)) {
            throw new InvalidTransactionException("Transaction fee exceeds allowable limit.");
        }
        
        // 3. Verify total deduction against account balance
        double totalDeduction = amountInBaseCurrency + transactionFee;
        if (totalDeduction > this.balance) {
            throw new CurrencyConversionException("Insufficient balance for the withdrawal");
        }
        
        // 4. Update balance and print outputs if all validations pass
        this.balance -= totalDeduction;
        double foreignAmount = amountInBaseCurrency * exchangeRate;
        
        System.out.println(this.balance);
        System.out.println(foreignAmount);
    }
}
class CurrencyExchangeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = scanner.nextDouble();
        
        BankAccount account = new BankAccount(balance);
        double amountInBaseCurrency = scanner.nextDouble();
        
        double exchangeRate = scanner.nextDouble();
        
        double transactionFee = scanner.nextDouble();

        try {
            account.withdrawForeignCurrency(amountInBaseCurrency, exchangeRate, transactionFee);
        } catch (InvalidTransactionException | CurrencyConversionException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
