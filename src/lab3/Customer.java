package lab3;

public class Customer {
    private String name;
    private Current currentAccount;
    private Savings savingsAccount;



    public Customer(String name) {
        this.name = name;

    }



    public String getName() {
        return name;
    }



    public Current getCurrentAccount(){
        return currentAccount;
    }



    public void addAccounts(Current currentAccount, Savings savingsAccount){
        //adds current account to currentAccount
        //adds savings account to savingsAccount
    }



    public String toString(){
        return String.format(); //fix later
    }





}



