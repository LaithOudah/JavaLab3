package lab3;

public class Savings extends Account {

    /**
     * @param arg1 = accountNumber
     * @param arg2 = otherAccount
     */
    public Savings(int arg1, Current arg2) {
        super(arg1, arg2); // Calls 2:nd constructor in Account class
        balance = 0.0;
    }

    /**
     *
     * @param arg = Balance changer
     */
    public void changeBalance(double arg) {
        balance += arg;
    }

    public double getBalance() {
        return balance;
    }
}