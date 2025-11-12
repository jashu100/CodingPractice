package Week4HWDay1and2;

class SavingsAccount extends BasicAccount {
    private double interestRate;

    public SavingsAccount(String accountHolder, double initialBalance, double interestRate) {
        super(accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Savings withdrawal successful");
        } else {
            System.out.println("Cannot withdraw more than balance in SavingsAccount");
        }
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest ₹" + interest + " added to " + accountHolder + "'s account");
    }
}

