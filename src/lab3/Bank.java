package lab3;

import java.util.*;

public class Bank {

    ArrayList<Customer> customerList;
    ArrayList<Account> accountList;
    int accountNumber = 1000;

    public Bank() {
        customerList = new ArrayList<Customer>();
        accountList = new ArrayList<Account>();
    }

    public String addCustomer(String arg, double arg2) {
        for (Customer customer : customerList) {
            if (customer.getName().equals(arg)) {
                System.out.println("The customer already exists");
            }
        }

        System.out.println("Customer added.");
        customerList.add(new Customer(arg));
    }


    public Customer findCustomer(String arg) {
        String dummy = arg.trim();
        Customer result = null;
        for (Customer customer : customerList) {
            if (dummy.equals(customer.getName())) {
                result = customer;
            }
        }
        return result;
    }

    public void transfer(String arg1, double arg2) {

    }

    public void transfer(String arg1, String arg2, double arg3) {

    }


    public String checkAccount(int arg) {
        for (Account account : accountList) {
            if (account.accountNumber == arg) {
                return toString() + arg;
            }
        }
        return "Not a current account";
    }


    public void annualChange() {
        for (Account account : accountList) {
            account.annualChange();
        }
    }


    public String toString() {
        String result = "Bank statistics\n";
        result = result + "The bank has " + customerList.size() + " customers" + "\n";
        result = result + "The bank has " + accountList.size() + " accounts" + "\n";

        double dummy = 0.0;
        for (Account account : accountList) {
            dummy = dummy + account.getBalance();
        }
        result = result + "The bank controls the total amount of: " + dummy;

        return result;
    }

}

