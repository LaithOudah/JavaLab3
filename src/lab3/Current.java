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
     * transfers money to the savingsAccount from currentAccount
     * or the other way around
     *
     * If i implemented this at an actual bank i would go to prison.
     * or a nice padded room with nice nurses giving me happy pills.
     * since clearly i would be in no mental state to be out in the real world.
     *
     * from currentAccount.
     * @param arg3 = balance
     */
    public void transfer(double arg3) {

        double savingsCurrentAmount = otherAccount.balance;
        double currentCurrentAmount = theCustomer.getCurrentAccount().balance;
        int tempNumber = theCustomer.getCurrentAccount().getNumber();

            //positive amount sent from currentAccount to savingsAccount -> money goes into savingsAccount from currentAccount
            if(arg3 > 0.0) {
                if (arg3 > currentCurrentAmount) {
                    double newSum = arg3 - currentCurrentAmount;
                    otherAccount.balance += newSum;
                    theCustomer.getCurrentAccount().balance -= newSum;
                    Transaction transaction = new Transaction(tempNumber, newSum, "from");

                } else {
                    theCustomer.getCurrentAccount().balance -= arg3;
                    otherAccount.balance += arg3;
                    Transaction transaction = new Transaction(tempNumber, arg3, "from");
                }
            }
            else if(arg3 == 0.0){
                System.out.println("You cant send 0.0, you dumb bitch");

            }
            //negative amount sent from currentAccount to savingsAccount -> money goes into currentAccount from savingsAccount
            else {
                if (-arg3 > currentCurrentAmount) {
                    double newSum = -arg3 - currentCurrentAmount;
                    otherAccount.balance += newSum;
                    theCustomer.getCurrentAccount().balance -= newSum;
                    Transaction transaction = new Transaction(tempNumber, newSum, "to");
                }
                else {
                    theCustomer.getCurrentAccount().balance -= arg3;
                    otherAccount.balance += arg3;
                    Transaction transaction = new Transaction(tempNumber, arg3, "to");
            }



    }






    public void deposit(Current arg1, double arg2){

    }



    public String toString(){
        return null; //fix later boyo
    }

}
