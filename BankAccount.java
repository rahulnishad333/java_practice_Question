abstract class BankAccount {
    String accountNumber;
    double balance;

    // Constructor to initialize account number and balance
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Abstract method to deposit money
    public abstract void deposit(double amount);

    // Abstract method to withdraw money
    public abstract void withdraw(double amount);
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}


class Main_2 {
    public static void main(String[] args) {
        // Create an instance of CheckingAccount
        CheckingAccount account = new CheckingAccount("1234567890", 1000.0);

        // Deposit money into the account
        account.deposit(500.0);
        System.out.println("New balance after deposit: " + account.getBalance());

        // Withdraw money from the account
        account.withdraw(200.0);
        System.out.println("New balance after withdrawal: " + account.getBalance());
    }
}
