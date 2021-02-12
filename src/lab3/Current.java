package lab3;

import java.util.ArrayList;

public class Current extends Account {

    private Customer theCustomer;
    private ArrayList<Transaction> theTransactions;

    /**
     * sub-class constructor
     *
     * @param name          = Customer
     * @param accountNumber = AccountNumber
     * @param money         = balance
     */
    public Current(Customer name, int accountNumber, double money) {
        super(accountNumber);

        theCustomer = name;
        balance = money;
        theTransactions = new ArrayList<Transaction>();
    }

    public Customer getCustomer() {
        return theCustomer;
    }

    public void transfer(double amount) {
        if (amount != 0.0) {
            if (amount > 0) {
                balance -= amount;
            }
            if (amount < 0) {
                // In order to not get negative numbers
                balance += Math.abs(amount);
            }
        }
        int numbHolder = theCustomer.getCurrentAccount().otherAccount.getNumber();
        if (amount < 0) {
            theTransactions.add(new Transaction(numbHolder, amount, "From"));
        } else {
            theTransactions.add(new Transaction(numbHolder, amount, "To"));
        }
    }


    /**
     * Deposit Method
     *
     * @param arg1 = currentAccount
     * @param arg2 = balance
     */
    public void deposit(Current arg1, double arg2) {
        balance -= arg2;
        theTransactions.add(new Transaction(arg1.getNumber(), arg2, "To"));
    }

    /**
     * Transfer Method 2
     *
     * @param arg1 =
     * @param arg2 =
     */
    public void transfer(Current arg1, double arg2) {
        arg1.deposit(theCustomer.getCurrentAccount(), arg2);
        theCustomer.getCurrentAccount().balance += arg2;
        theTransactions.add(new Transaction(arg1.getNumber(), arg2, "From"));
    }

    /**
     * toString Method
     * .append means +=
     *
     * @return toString
     */
    public String toString() {
        StringBuilder holder = new StringBuilder(("\nCustomer: " + theCustomer.getName()) + "\n");
        holder.append("Balance: ").append(theCustomer.getCurrentAccount().getBalance()).append("\n");
        holder.append("Savings: ").append(theCustomer.getCurrentAccount().otherAccount.getBalance()).append("\n");

        if (theTransactions.size() != 0) {
            holder.append("\nList of transactions" + "\nMoney Transfer: \n");
            for (Transaction theTransaction : theTransactions) {
                holder.append(theTransaction.toString());
            }
        }
        return holder.toString().toString();
    }
}
