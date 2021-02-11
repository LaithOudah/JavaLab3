package lab3;

public class Transaction {

    private int theAccount;
    private double theAmount;
    private String tofrom;

    public Transaction(int theAccount, double theAmount, String tofrom) {
        this.theAccount = theAccount;
        this.theAmount = theAmount;
        this.tofrom = tofrom;
    }

    public String toString() {
        return "Money Transfer: " + tofrom + "\n Account: " + theAccount + "\n Amount " + theAmount + "\n";
    }
}
