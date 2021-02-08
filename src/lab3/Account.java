package lab3;

import java.io.*;

public class Account {
    int accountNumber;
    String accountType;
    double balance;
    Account otherAccount;
    public double FEE, INTEREST;

    // Constructor
    public Account(int accountNumber, String accountType, double balance, Account otherAccount, double FEE, double INTEREST) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.otherAccount = otherAccount;
        this.FEE = FEE;
        this.INTEREST = INTEREST;
    }

    // Setter and getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account getOtherAccount() {
        return otherAccount;
    }

    public void setOtherAccount(Account otherAccount) {
        this.otherAccount = otherAccount;
    }

    public double getFEE() {
        return FEE;
    }

    public void setFEE(double FEE) {
        this.FEE = FEE;
    }

    public double getINTEREST() {
        return INTEREST;
    }

    public void setINTEREST(double INTEREST) {
        this.INTEREST = INTEREST;
    }









}
