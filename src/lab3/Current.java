package lab3;

import java.io.*;
import java.util.ArrayList;

public class Current {

    private Customer theCustomer;
    private ArrayList<Transaction> theTransactions;

    public Current(Customer theCustomer) {
        this.theCustomer = theCustomer;
    }

    public Customer getTheCustomer() {
        return theCustomer;
    }

    public void setTheCustomer(Customer theCustomer) {
        this.theCustomer = theCustomer;
    }
}
