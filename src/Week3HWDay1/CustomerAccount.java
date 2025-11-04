package Week3HWDay1;

import java.util.Scanner;

public class CustomerAccount {

    public static void main(String[] args){

        CustomerAccount customerAccount = new CustomerAccount();

        System.out.println("Enter Customer Account number to deposit or withdraw amount \n");
        Scanner sc = new Scanner(System.in);
        Long accNum = sc.nextLong();
        Double balance = 100000.0;
        System.out.println("Enter 2 to deposit \n1 to withdraw amount");
        int option = sc.nextInt();
        switch (option){
            case 1:
                customerAccount.Withdraw(accNum,balance);
                break;
            case 2:
                customerAccount.Deposit(accNum,balance);
                break;
            default:
                System.out.println("Nothing Performed");
        }
    }

    public Double Withdraw(Long accnumber, Double balance){

        System.out.println("Enter amount to be withdraw");
        Scanner sc = new Scanner(System.in);
        int wdamount = sc.nextInt();
        if(wdamount <= balance) {
            balance = balance - wdamount;
            System.out.println("Money withdrawn from account " + accnumber +
                    " remaining account balance is: " + balance);
        }
        else {
            System.out.println("Money cannot be withdrawn from account " + accnumber +
                    " your account balance is: " + balance);
        }
        return balance;
    }

    public Double Deposit(Long accnumber, Double balance){

        System.out.println("Enter amount to be Deposit");
        Scanner sc = new Scanner(System.in);
        int depamount = sc.nextInt();
        balance = balance + depamount;
        System.out.println("Money deposited to account " + accnumber +
                " remaining account balance is :" + balance);
        return balance;
    }
}