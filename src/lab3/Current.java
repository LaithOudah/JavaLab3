package lab3;

import java.io.*;
import java.util.ArrayList;

public class Current extends Account {

    private Customer theCustomer;
    private ArrayList<Transaction> theTransactions = new ArrayList<Transaction>();


    //sub-class constructor
    public Current(Customer theCustomer, double balance) {
        super("Account"); //wrong, idk how to fix.pls send help.
        ArrayList<Transaction> theTransactions = new ArrayList<Transaction>();
        balance = super.getBalance();
        theCustomer = super.
    }



    public Customer getTheCustomer() {
        return theCustomer;
    }

    public void setTheCustomer(Customer theCustomer) {
        this.theCustomer = theCustomer;
    }
}
