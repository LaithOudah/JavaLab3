package lab3;

import java.io.*;

public class Account {
    protected int accountNumber;
    protected String accountType;
    protected double balance;
    protected Account otherAccount;
    public static final double FEE = 0, INTEREST = 0; //set FEE and INTEREST later.

    // Constructor uno
    public Account(int accountNumber) {
        accountNumber = this.accountNumber;
        accountType = "Current";
    }

    //constructor dos
    public Account(int accountNumber, Current otherAccount){

    }

    public String getAccountType(){
        return accountType;
    }


    public int getNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }


    public void annualChange(){

    }



}
