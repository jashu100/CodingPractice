package Week4HWDay1and2;

// Base class
class BasicAccount {
    protected String accountHolder;
    protected double balance;

    public BasicAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance for " + accountHolder);
        }
    }

    public void displayBalance() {
        System.out.println(accountHolder + " balance: $" + balance);
    }
}

