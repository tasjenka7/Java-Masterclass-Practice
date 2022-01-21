package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("NBS");

        bank.addBranch("Beograd");

        bank.addCustomer("Beograd", "Tamara", 50.05);
        bank.addCustomer("Beograd", "Petar", 109.04);
        bank.addCustomer("Beograd", "Jelena", 76.32);

        bank.addBranch("Novi Sad");

        bank.addCustomer("Novi Sad", "Bob", 142.58);

        bank.addCustomerTransaction("Beograd", "Tamara", 44.22);
        bank.addCustomerTransaction("Beograd", "Tamara", 105.01);
        bank.addCustomerTransaction("Beograd", "Petar", 269.00);

        bank.listCustomers("Beograd", true);
        bank.listCustomers("Novi Sad", false);

       // bank.addBranch("Nis");
        if(!bank.addCustomer("Nis", "Brajan", 5.53)){
            System.out.println("Error Nis branch doesn't exist");
        }

        if(!bank.addBranch("Novi Sad")){
            System.out.println("Novi Sad branch already exists.");
        }

        if(!bank.addCustomerTransaction("Beograd", "Bla", 22.2)){
            System.out.println("Customer does not exists at branch");
        }

        if(!bank.addCustomer("Beograd", "Tamara", 12.200)){
            System.out.println("Customer Tamara already exists");
        }
    }
}
