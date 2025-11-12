package Week4HWDay1and2;

public class BankApp {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("Alice", 5000, 5.0);
        CheckingAccount checking = new CheckingAccount("Bob", 2000, 1000);

        savings.deposit(1000);
        savings.displayBalance();
        savings.addInterest();
        savings.displayBalance();
        savings.withdraw(3000);
        savings.displayBalance();

        checking.withdraw(2500); // uses overdraft
        checking.displayBalance();

        checking.withdraw(2000); // exceeds overdraft
    }
}

