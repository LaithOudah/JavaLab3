package lab3;

public class Account {

    protected int accountNumber;
    protected String accountType;
    protected double balance;
    protected Account otherAccount;
    public static final double FEE = 10.0, INTEREST = 0.02;

    /**
     * First Constructor
     *
     * @param arg1 = accountNumber
     */
    public Account(int arg1) {
        accountNumber = arg1;
        accountType = "Current";
    }

    /**
     * Second Constructor
     *
     * @param arg1 = accountNumber
     * @param arg2 = otherAccount
     */
    public Account(int arg1, Current arg2) {
        accountType = "Savings";
        accountNumber = arg1;
        otherAccount = arg2;
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

