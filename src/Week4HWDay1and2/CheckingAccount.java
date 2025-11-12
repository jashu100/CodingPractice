package Week4HWDay1and2;

class CheckingAccount extends BasicAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountHolder, double initialBalance, double overdraftLimit) {
        super(accountHolder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Checking withdrawal successful (with overdraft if needed)");
        } else {
            System.out.println("Overdraft limit exceeded for " + accountHolder);
        }
    }
}

