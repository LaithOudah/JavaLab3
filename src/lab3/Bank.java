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
                return "Customer already exists";
            }

            else{
                Customer tempBoy = new Customer(arg1);
                customerList.add(tempBoy);
                Current dummyCurrent = new Current(accountNumber, tempBoy, arg2);
                Savings dummySavings = new Savings(accountNumber+1,dummyCurrent);
                accountList.add(dummyCurrent);
                accountList.add(dummySavings);
                tempBoy.addAccounts(dummyCurrent,dummySavings);
                accountNumber = accountNumber +2;
                return "Customer added";
            }
        }
        return"";
    }



    public Customer findCustomer(String arg){
        for(int i = 0; i < customerList.size(); i++){
            if(arg.equals(customerList.get(i).getName())){
                return customerList.get(i);
            }
            else{
                System.out.println("Customer does not exist");
                return null;
            }
        }
        return null;
    }


    /**
     * sends money between accounts of single person
     *
     * @param arg1 = name
     * @param arg2 = amount
     */
    public void transfer(String arg1, double arg2){
        Customer lonely = findCustomer(arg1);

    }




    /**
     * sends money between 'current' accounts of different people
     *
     * @param arg1 = senders name
     * @param arg2 = receivers name
     * @param arg3 = amount
     */
    public void transfer(String arg1, String arg2, double arg3){
        Customer sender = findCustomer(arg1);
        Customer receiver = findCustomer(arg2);
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
