package Week02;

// 1. Define the class
public class Account {

    // 2. Define the properties
    private String accountNumber;
    private String ownerName;
    private double balance;

    // 3. Create the constructor
    public Account(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // 4. We define methods for the class
    public void deposit(double ammount) {

        balance += ammount;

    }

    // 5. Getters

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public double getBalance() {
        return this.balance;
    }

    // 6. Setters

    public void setOwnerName(){

    }



}
