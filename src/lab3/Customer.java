package lab3;

public class Customer {
    private String name;
    private Current currentAccount;
    private Savings savingsAccount;

    /**
     * @param arg = Customer Name
     */
    public Customer(String arg) {
        name = arg;
    }

    public String getName() {
        return name;
    }

    public Current getCurrentAccount() {
        return currentAccount;
    }

    public void addAccounts(Current cur, Savings sav) {
        currentAccount = cur;
        savingsAccount = sav;
    }

    /**
     * toString Method
     *
     * @return returns Customer information
     */
    public String toString() {

        String holder = "Name of customer: " +  name;

        if (currentAccount.getNumber() != 0) {
            holder += "\nCurrent Account: " + currentAccount.getNumber();
        }

        if (savingsAccount.getNumber() != 0) {
            holder += "\nSavings Account: " + savingsAccount.getNumber();
        }

        return holder + "\n----------------";
    }
}
