package lab3;

import java.io.*;
import java.util.ArrayList;

public class Current extends Account {

    private Customer theCustomer;
    private ArrayList<Transaction> theTransactions = new ArrayList<Transaction>();




    /**
     * sub-class constructor
     *
     * @param arg1 = accountNumber
     * @param arg2 = theCustomer
     * @param arg3 = balance
     */
    public Current(int arg1, Customer arg2, double arg3) {
        super(arg1);
        ArrayList<Transaction> theTransactions = new ArrayList<Transaction>();
        balance = arg3;
        theCustomer = arg2;
    }



    public Customer getCustomer(){
        return theCustomer;
    }


    /**
     * transfers money to the savings account (other Account).
     * @param arg3 = balance
     */
    public void transfer(double arg3){
        theCustomer.getCurrentAccount(); //not done, you probably want to remove this... dumbass.
    }



    public void deposit(Current arg1, double arg2){

    }



    public String toString(){
        return null; //fix later boyo
    }

}
