package lab3;

import java.io.*;

public class Transaction {

    private int theAccount;
    private double theAmount;
    private String toFrom;


    /**
     *
     * @param arg1 = AccountNumber (sending or receiving money)
     * @param arg2 = amount
     * @param arg3 = sent "to" or received "from".
     */
    public Transaction(int arg1, double arg2, String arg3) {
        theAccount = arg1;
        theAmount = arg2;
        toFrom = arg3;


        //probably doesn't belong here, but dont tell it that.
        if(arg3.equals("to")) {
            //call function that subtracts money from "theAccount".
        }
        else if(arg3.equals("from")){
            //call function that adds money to "theAccount".
        }
        else{
            System.out.println("Invalid input!");
        }

    }



    public String toString(){
        return null; //fix later
    }


}
