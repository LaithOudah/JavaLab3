package lab3;

import java.io.*;

public class Account {
    protected int accountNumber = 0;
    protected String accountType;
    protected double balance;
    protected Account otherAccount;
    public static final double FEE = 10.0, INTEREST = 0.02;


    /**
     * Constructor uno
     *
     * @param arg1 = accountNumber
     */
    public Account(int arg1) {
        accountNumber = arg1;
        accountType = "Current";
    }


    /**
     * constructor dos
     *
     * @param arg1 = accountNumber
     * @param arg2 = otherAccount
     */
    public Account(int arg1, Current arg2){
        accountType = "Savings";
        accountNumber = arg1;
        otherAccount = arg2;
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
       String tempType = accountType;
       if(tempType.equals("Current")){
           balance = balance - FEE;
       }
       else if(tempType.equals("Savings")){
           balance = balance + INTEREST;
       }
    }



}
