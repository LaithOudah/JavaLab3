package lab3;

import java.io.*;
import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customerList;
    private ArrayList<Account> accountList;
    private int accountNumber;

    //constructor
    public Bank(){
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        ArrayList<Account> accountList = new ArrayList<Account>();
        accountNumber = 1000;
    }


    /**
     * 1st loop.
     * checks if the Customer is already a customer of the bank,
     * if he is not he is added to the customerList.
     *
     * @param arg1 = name
     * @param arg2 = amount
     *
     */
    public String addCustomer(String arg1, double arg2){
        for(int i = 0; i < customerList.size(); i++){
            if(arg1.equals(customerList.get(i).getName())){
                System.out.println("Customer already exists");
            }
            else{
                customerList.add(new Customer(arg1));
                accountList.add(new Account(accountNumber));
                accountNumber = accountNumber + 1;
            }
        }





        return null; //fix later
    }



    public Customer findCustomer(String arg){
        return null; //later
    }



    public void transfer(String arg1, double arg2){

    }


    public void transfer(String arg1, String arg2, double arg3){

    }

    public String checkAccount(int arg){
        for(int i = 0; i < accountList.size(); i++){
            int tempNumber = accountList.get(i).getNumber();
            String tempType = accountList.get(i).getAccountType();

            if(arg == tempNumber && tempType.equals("Current")){
                //call toString and return it.
            }
            else{
                i++;
            }
        }
        return "Not a current account";
    }


    public void annualChange(){

    }



    public String toString(){
        return null; //fix later
    }

}
