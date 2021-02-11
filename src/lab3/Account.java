package lab3;

public class Account {

    protected int accountNumber;
    protected String accountType;
    protected double balance;
    protected String otherAccount;
    public static final double FEE = 10.0;
    public static final double INTEREST = 0.02;


    public Account(int arg1) {
        accountNumber = arg1;
        accountType = "Current";
    }

    public Account(int arg2, String arg3) {
        accountNumber = arg2;
        otherAccount = arg3;
    }


    public String getAccountType() {
        return accountType;
    }

    public int getNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void annualChange() {
        if (accountType.equals("Current")) {
            balance -= FEE;
        } else {
            balance += (balance * INTEREST);
        }
    }

}

