package academy.learnprogramming;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;


    public VipCustomer(String name, double creditLimit, String emailAddress) {

        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, String emailAddress) {
        this(name, 100000.00, emailAddress);
    }

    public VipCustomer() {
        this("Default name", 1000000.00, "Default email");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
