package academy.learnprogramming;


//Logical name: Account
public class Bank {

    private long accountNumber; //or String
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String phoneNumber;

    public Bank(){
        //Default values for the field, this has to be called first
        this(11111, 0.00, "Default name", "Default address", "default phone");
        System.out.println("Empty constructor called. ");
    }

    public Bank(long accountNumber, double balance, String customerName,
                String customerEmailAddress, String phoneNumber){

        System.out.println("Account constructor with parameters called.");

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.phoneNumber = phoneNumber;

        /*
        setAccountNumber(accountNumber);
        setBalance(balance);
        setCustomerName(customerName);
        setCustomerEmailAddress(customerEmailAddress);
        setPhoneNumber(phoneNumber);*/
    }

    public Bank(String customerName, String customerEmailAddress, String phoneNumber) {
        /*this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.phoneNumber = phoneNumber;*/
        this(99999, 100.55, customerName, customerEmailAddress, phoneNumber);
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit){
        if(deposit < 0){
            System.out.println("Invalid value. Did you mean to withdraw?");
            return;
        }
        this.balance += deposit;
        System.out.println("After adding " + deposit + " new balance is " + getBalance());
    }

    public void withdrawal(double withdrawal){
        if(withdrawal > getBalance()){ // this.balance - withdrawal < 0
            System.out.println("You don't have enough money on your account");
            return;
        }
        this.balance -= withdrawal;
        System.out.println("After withdrawal of " + withdrawal + " balance is " + getBalance());
    }

}
