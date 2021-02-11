package lab3;

import java.util.ArrayList;

public class Current extends Account {

    private Customer theCustomer;
    private ArrayList<Transaction> theTransactions;

    public Current(Customer arg1, int arg2, double arg3) {
        super(arg2);
        accountType = "Current";
        theTransactions = new ArrayList<Transaction>();
    }

    public Customer getCustomer() {
        return theCustomer;
    }

    public void transfer(double arg1) {
        otherAccount(arg1);
        theBalance -= arg1;

        theTransactions.add(new Transaction(otherAccount.getAccountNumber(), -arg1, theBalance));
    }


    public void transfer(int arg1, double arg2) {
        if (theBank.getAccount(arg1) instanceof Current) {
            theBalance -= arg2;
            theTransactions.add(new Transaction(arg1, arg2, theBalance));
        }
    }


    public boolean hasSavingsAccount() {
        if (theSavingsAccount == null) {
            return false;
        } else {
            return true;
        }
    }

    public Savings createSavingsAccount() {
        if (hasSavingsAccount()) {
            System.out.println("A savings account already exists");
            return null;
        } else {
            theSavingsAccount = new Savings(this);
            System.out.println("Added a savings account to the current account: " + accountNumber);
            return theSavingsAccount;
        }
    }


    public Savings getSavingsAccount() {
        return theSavingsAccount;
    }


    public void receive(int arg1, double arg2) {
        theBalance += arg2;
        theTransactions.add(new Transaction(arg1, arg2, theBalance));
    }

    public void receive(double arg) {
        double moneyAvailable = theSavingsAccount.send(arg);
        theBalance += moneyAvailable;
        theTransactions.add(new Transaction(theSavingsAccount.getAccountNumber(), moneyAvailable, theBalance));
    }

    public String listTransactions() {
        String result = "Transaction summary of the current account" + accountNumber;

        for (int i = 0; i < theTransactions.size(); i++) {
            result += theTransactions.get(i).toString();
        }
        return result;
    }

    public String toString() {
        String result = super.toString();
        return result;
    }
}
