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
     *
     * @param arg3 = balance
     */
    public void transfer(double arg3) {

        double savingsCurrentAmount = otherAccount.balance;
        double currentCurrentAmount = theCustomer.getCurrentAccount().balance;
        int tempNumber = theCustomer.getCurrentAccount().getNumber();

        //positive amount sent from currentAccount to savingsAccount -> money goes into savingsAccount from currentAccount
        if (arg3 > 0.0) {
            if (arg3 > currentCurrentAmount) {
                double newSum = arg3 - currentCurrentAmount;
                otherAccount.balance += newSum;
                theCustomer.getCurrentAccount().balance -= newSum;
                Transaction transaction = new Transaction(tempNumber, newSum, "from");
                theTransactions.add(transaction);

            } else {
                theCustomer.getCurrentAccount().balance -= arg3;
                otherAccount.balance += arg3;
                Transaction transaction = new Transaction(tempNumber, arg3, "from");
                theTransactions.add(transaction);
            }
        }
        else if (arg3 == 0.0) {
            System.out.println("You cant send 0.0, you dumb bitch");

        }
        //negative amount sent from currentAccount to savingsAccount -> money goes into currentAccount from savingsAccount
        else {
            if (-arg3 > currentCurrentAmount) {
                double newSum = -arg3 - currentCurrentAmount;
                otherAccount.balance += newSum;
                theCustomer.getCurrentAccount().balance -= newSum;
                Transaction transaction = new Transaction(tempNumber, newSum, "to");
                theTransactions.add(transaction);
            } else {
                theCustomer.getCurrentAccount().balance -= arg3;
                otherAccount.balance += arg3;
                Transaction transaction = new Transaction(tempNumber, arg3, "to");
                theTransactions.add(transaction);
            }
        }

    }


    /**
     * different account pays to this account
     * this is your brain on java programming    https://www.youtube.com/watch?v=GOnENVylxPI
     *
     *
     * @param arg1 = sender
     * @param arg2 = amount
     */
    public void deposit(Current arg1, double arg2){
        Current sender = arg1;
        if(arg2 > 0.0) {
            sender.balance -= arg2;
            theCustomer.getCurrentAccount().balance += arg2;
            Transaction transaction = new Transaction(sender.accountNumber, arg2, "from");
            theTransactions.add(transaction);
        }
        else{
            System.out.println("dont try to send a negative amount you dirty dirty boy");
        }
   }


   public void transfer(Current arg1, double arg2){

   }

    public String toString(){
        return null; //fix later boyo
    }

}
