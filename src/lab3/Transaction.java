package lab3;

import java.io.*;

public class Transaction {

    private int theAccount;
    private double theAmount;
    private String toFrom;

    public Transaction(int theAccount, double theAmount, String toFrom) {
        this.theAccount = theAccount;
        this.theAmount = theAmount;
        this.toFrom = toFrom;
    }

    public int getTheAccount() {
        return theAccount;
    }

    public void setTheAccount(int theAccount) {
        this.theAccount = theAccount;
    }

    public double getTheAmount() {
        return theAmount;
    }

    public void setTheAmount(double theAmount) {
        this.theAmount = theAmount;
    }

    public String getToFrom() {
        return toFrom;
    }

    public void setToFrom(String toFrom) {
        this.toFrom = toFrom;
    }
}
