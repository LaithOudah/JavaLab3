package lab3;

public class Savings extends Account {

    public Savings(Current arg1) {
        super(arg1.getCustomer(), arg1.getBank(), arg1.getBalance());
        accountType = "Savings";
        balance = 0.0;
    }

    public void changeBalance(Double arg) {
        balance += arg;
    }

    public double getBalance(Double arg) {
        return balance;
    }
}