package lab3;

public class Transaction {

    private int theAccount;
    private double theAmount;
    private String tofrom;


    /**
     * @param arg1 = AccountNumber (sending or receiving money)
     * @param arg2 = Amount
     * @param arg3 = Sent "to" or received "From".
     */
    public Transaction(int arg1, double arg2, String arg3) {
        theAccount = arg1;
        theAmount = arg2;
        tofrom = arg3;
    }

    public String toString() {
        String returner;
        returner = tofrom + " the account number " + theAccount + " with the amount of " + Math.abs(theAmount) + "\n";
        return returner;
    }
}
