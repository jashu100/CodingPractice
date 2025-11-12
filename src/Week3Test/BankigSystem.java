package Week3Test;

import java.util.Scanner;

public class BankigSystem {

    int accountNum = 123456;
    int accountNum2 = 345678;
    double balance = 2000;



    public static void main(String[] args){

        BankigSystem bankigSystem = new BankigSystem();

        System.out.println("Enter 1 for deposit/ 2 for withdraw the amount / 3 for transfer bw account");
        Scanner sc = new Scanner(System.in);

        switch(sc.nextInt()){

            case 1 :
                bankigSystem.deposit(500);
                break;
            case 2 :
                bankigSystem.withdraw(16000);
                break;

        }

    }



    public void deposit(int depamount){
        System.out.println(accountNum + " before deposit Account balance : " + balance);
        balance += depamount;
        System.out.println(accountNum + " After deposit Account balance : " + balance);

    }

    public boolean withdraw(int wdamount){
        try {
            System.out.println(accountNum + " before withdrawl Account balance : " + balance);
            System.out.println("Amount requested for withdrawl is: " + wdamount);
            if(wdamount <= balance) {
                balance -= wdamount;
                System.out.println(accountNum + " After withdrawl Account balance :" + balance);
                return true;
            } else {
                throw new RuntimeException("Withdraw  amount should be less than the Balance");
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

//    public void transfer(){
//        if(withdraw(500)){
//
//        }
//
//    }
}
