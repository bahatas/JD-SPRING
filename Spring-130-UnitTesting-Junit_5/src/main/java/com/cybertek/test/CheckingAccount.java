package com.cybertek.test;

public class CheckingAccount {

    double balance ;
    long accountNumber;
    String accountHolder;
    String type = "checking";

    public void setInfo(double pBalance, long pAccNumber,String pAccHolder ){

        balance=pBalance;
        accountNumber = pAccNumber;
        accountHolder=pAccHolder;


    }

    public double withDraw(double amount){
        if(amount<=balance){
            balance=amount;
        }else{
            System.out.println("Insufficient fund in account");
        }
        return balance;

    }

    public double purchase(String item, double price){

        if(price<=balance){
            balance-=price;
        }else{
            balance-=(price+35);
        }
        return balance;
    }
}
