abstract class Bank_acc {
    double number;
    double balance;

    // Abstract method to deposit money
    abstract void deposit();

    // Abstract method to withdraw money
    abstract void withdraw();
}

class Main2 extends Bank_acc {

    @Override
    void deposit() {
        System.out.println("This is the Deposit Method");
    }

    @Override
    void withdraw() {
        System.out.println("This is Withdraw Method");
    }

    public static void main(String[] args) {
        // Create an instance of CheckingAccounts
        Main2 acc = new Main2();
        
        // Call the deposit and withdraw methods
        acc.deposit();
        acc.withdraw();
    }
}
