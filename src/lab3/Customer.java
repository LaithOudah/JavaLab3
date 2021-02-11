package lab3;

import java.util.Random;

public class Customer {
    private String name;
    private Current currentAccount;
    private Savings savingsAccount;



    public Customer(String arg1) {
        name = arg1;
    }



    public String getName() {
        return name;
    }



    public Current getCurrentAccount(){
        return currentAccount;
    }


    /**
     *
     * @param arg1 = currentAccount
     * @param arg2 = savingsAccount
     */


    public void addAccounts(Current arg1, Savings arg2){
        //adds current account to currentAccount
        currentAccount = arg1;

        //adds savings account to savingsAccount
        savingsAccount = arg2;
    }



    public String toString(){
        return String.format("digital super-aids"); //fix later
    }





}



