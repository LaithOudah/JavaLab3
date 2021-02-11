package lab3;

public class Savings extends Account {

    /**
     *
     * @param arg1 = accountNumber
     * @param arg2 = otherAccount
     */
    public Savings(int arg1, Current arg2){
        super(arg1, arg2); //calls 2:nd constructor in Account class
        balance = 0.0;
    }

    public void changeBalance(double arg) {
        //changes balance on savings account by "arg" amount.
        balance = balance + arg; // + might be wrong, just says change.
    }

    public double getBalance() {
        return balance;
    }


}
