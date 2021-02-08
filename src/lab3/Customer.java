package lab3;

public class Customer {
    private String name;
    private String CurrentAccount;
    private String SavingsAccount;

    public Customer(String name, String currentAccount, String savingsAccount) {
        this.name = name;
        CurrentAccount = currentAccount; // Current??
        SavingsAccount = savingsAccount; // Savings??
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentAccount() {
        return CurrentAccount;
    }

    public void setCurrentAccount(String currentAccount) {
        CurrentAccount = currentAccount;
    }

    public String getSavingsAccount() {
        return SavingsAccount;
    }

    public void setSavingsAccount(String savingsAccount) {
        SavingsAccount = savingsAccount;
    }
}



