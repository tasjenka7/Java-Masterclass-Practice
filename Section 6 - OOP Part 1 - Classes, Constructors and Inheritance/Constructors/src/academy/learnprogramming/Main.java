package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        /*Bank Pera = new Bank();
        // Before constuctor
        Pera.setAccountNumber(212548151);
        Pera.setBalance(100000);
        Pera.setCustomerName("Pera");
        Pera.setPhoneNumber("0632565248");
        System.out.println(Pera.getCustomerName() + " has " + Pera.getBalance() +
                " on account number " + Pera.getAccountNumber());
        Pera.depositFunds(15000);
        Pera.withdrawal(100230);
        Pera.depositFunds(-55145);
        Pera.withdrawal(5555555);*//*

        ////////////////////////////////////
        Bank constructorBank = new Bank(12345, 0.00, "Bob Brown", "bob@mail.com", "12354685");
        constructorBank.withdrawal(100.0);

        constructorBank.depositFunds(50.0);
        constructorBank.withdrawal(100.0);

        constructorBank.depositFunds(51.0);
        constructorBank.withdrawal(100.0);

        Bank tims = new Bank("Tim", "tim@mail.com", "1254848");
    */
        VipCustomer Pera0 = new VipCustomer();
        VipCustomer Pera2 = new VipCustomer("Pera","peraa@mail.com");
        VipCustomer Pera = new VipCustomer("Pera", 300000, "pera@mail.com");

        System.out.println("Pera \n" + Pera.getName() + " ( " + Pera.getEmailAddress() + " ): " + Pera.getCreditLimit() );

        System.out.println("Pera0 \n" + Pera0.getName() + " ( " + Pera0.getEmailAddress() + " ): " + Pera0.getCreditLimit() );

        System.out.println("Pera2 \n" + Pera2.getName() + " ( " + Pera2.getEmailAddress() + " ): " + Pera2.getCreditLimit() );

    }
}
