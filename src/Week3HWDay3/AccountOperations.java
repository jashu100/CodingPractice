package Week3HWDay3;

public class AccountOperations {

    public static void main(String[] args){

        BankAccount bankAccount1 = new BankAccount(800, "A");
        BankAccount bankAccount2 = new BankAccount(900, "B");

       bankAccount1.transferToBeneficiary(bankAccount2, 900);
       System.out.println("Present beneficiary balance is : " + bankAccount2.getBalance());

    }
}

class BankAccount {

    private String accountHolder;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(double balance, String accountHolder) {
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            return true;
        }
        return false;
    }

    public boolean deposit(double amount) {
        balance = balance + amount;
        return true;
    }

    public void transferToBeneficiary(BankAccount benAccount, double amount) {

        if (withdraw(amount)) {
            benAccount.deposit(amount);
            System.out.println("Amount transferred to Beneficiary account");
        }else{
            System.out.println("Amount transfer to Beneficiary account Failed");
        }
    }
}
