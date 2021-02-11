package lab3;

public class Customer {
    private String name;
    private Current Current;
    private Savings Savings;

	/*
	private String theName;
	private Current theCurrentAccount;
	*/

    public Customer(String arg) {
        name = arg;
        Current = null;
    }

    public String getName() {
        return name;
    }



    public Current getCurrentAccount() {
        return Current;
    }

    public void addAccounts Current arg1, Savings arg2) {
        if (!hasCurrentAccount()) {
            Current = arg1;
            Savings = arg2;
        }
    }


    public String toString() {
        String dummy = "";
        dummy = dummy + "\n****************";
        dummy = dummy + "\nName of Customer : " + name;
        if (hasCurrentAccount()) {
            dummy = dummy + "\n Current account : " + Current.getNumber();
            dummy = dummy + "\n Savings account : " + Savings.getBalance();
            dummy = dummy + "\n***************";
        }

        return dummy;
    }
}
