package lab3;

import java.util.*;

public class Bank {

    private ArrayList<Customer> customerList;
    private ArrayList<Account> accountList;
    private int accountNumber;

    public Bank() {
        customerList = new ArrayList<Customer>();
        accountList = new ArrayList<Account>();
        accountNumber = 1000;
    }

    /**
     * @param arg  = Name of the account holder
     * @param arg2 = Amount Available
     * @return = Returns the value.
     */
    public String addCustomer(String arg, double arg2) {

        String holder = "";
        boolean sant = true;

        for (Customer value : customerList) {
            if (arg.equals(value.getName())) {
                holder = ("The customer already exists\n");
                sant = false;
                break;
            }
        }
        if (sant) {
            Customer customerTemp = new Customer(arg);
            customerList.add(customerTemp);

            Current currentTemp = new Current(customerTemp, accountNumber, arg2);
            accountNumber++;
            Savings savingsTemp = new Savings(accountNumber, currentTemp);

            accountList.add(savingsTemp);
            accountList.add(currentTemp);
            accountNumber++;

            currentTemp.otherAccount = savingsTemp;
            customerTemp.addAccounts(currentTemp, savingsTemp);
            holder = ("Customer added");
        }
        return holder;
    }

    /**
     * @param arg = Customer Name
     * @return = the name of the customer if he is a customer
     */
    public Customer findCustomer(String arg) {

        Customer dummy = null;

        for (Customer customer : customerList) {
            if (customer.getName().equals(arg)) {
                dummy = customer;
            }
            if (dummy == null) {
                System.out.println("Customer does not exist");
            }
        }
        return dummy;
    }

    /**
     * Transferring money between own accounts.
     *
     * @param arg1 = Name
     * @param arg2 = Money
     */
    public void transfer(String arg1, double arg2) {
        Customer singleMan = findCustomer(arg1); // Find Customer
        double curBalance = singleMan.getCurrentAccount().getBalance();  // Variable for current balance information
        double savBalance = singleMan.getCurrentAccount().otherAccount.balance; // Variable for current savings information
        double tempBalance = arg2; // Variable for balance
        Savings tempSavings = new Savings(10, singleMan.getCurrentAccount()); // creating savings account for the found customer

        // if the money is bigger than 0
        if (arg2 > 0) {
            // if money is bigger than current balance
            if (arg2 > curBalance) {
                tempBalance = curBalance; // set the temp balance we got from earlier to currentBalance
            }
            // Then get the current account to transfer from and the balance amount added
            singleMan.getCurrentAccount().transfer(tempBalance);
            // Change the amount in savings account
            tempSavings.changeBalance(tempBalance);
            // Checking the savings and balance of the saving account and saving it for the customer
            singleMan.getCurrentAccount().otherAccount.balance += tempSavings.getBalance();
        }
        // if the money sent is lower than 0
        if (arg2 < 0) {
            // Absolute value of a number is always positive
            // If the absolute value of money is bigger than the savings balance
            if (Math.abs(arg2) > savBalance) {
                // Then set the savings balance to negative
                tempBalance = savBalance * -1;
            }
            // Transfer money from balance
            singleMan.getCurrentAccount().transfer(tempBalance);
            // Change balance in savings
            tempSavings.changeBalance(tempBalance);
            // Updating the "log"
            singleMan.getCurrentAccount().otherAccount.balance += tempSavings.getBalance();
        }
    }

    /**
     * Transferring money between different accounts.
     *
     * @param arg1 = Senders name
     * @param arg2 = Receivers name
     * @param arg3 = Money
     */
    public void transfer(String arg1, String arg2, double arg3) {
        Customer sender = findCustomer(arg1); // Creating a sender
        Customer receiver = findCustomer(arg2); // Creating a receiver

        // If both sender and receiver exists then:
        if (sender != null && receiver != null) {
            // Transfer the money form the senders money balance ot the receiver
            receiver.getCurrentAccount().transfer(sender.getCurrentAccount(), arg3);
        }
    }

    /**
     * @param arg = Number holder
     * @return If the account exists or not
     */
    public String checkAccount(int arg) {
        String checker = "check";

        for (Account account : accountList) {
            if (arg == account.getNumber()) {
                if (account.getAccountType().equals("Current")) {
                    checker = account.toString();
                }
            } else {
                checker = "Not a current account";
            }
            if (checker.equals("check")) {
                checker = "Account doesn't exist";
            }
        }
        return checker;
    }


    public void annualCharge() {
        for (Account account : accountList) {
            account.annualChange();
        }
    }

    public String toString() {
        String result = "\nBank statistics\n" + "----------------\n";
        double totMoney = 0.0;
        result = result + "The bank has " + customerList.size() + " customers" + "\n";
        result = result + "The bank has " + accountList.size() + " accounts" + "\n";

        for (Account account : accountList) {
            totMoney += account.getBalance();
        }
        result = result + "The bank controls the total amount of: " + totMoney;
        return result;
    }
}

