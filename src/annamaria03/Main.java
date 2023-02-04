package annamaria03;

public class Main {
    public static void main(String[] args) {

        Customer first = new Customer("Bob",0.00);
        first.credit(124.00);
        first.debit(-25.55);
        first.credit(4.00);
        first.debit(-30.55);
        first.credit(550.00);
        first.debit(-125.55);
        System.out.println("---".repeat(45));
        Bank bank1 = new Bank();
        System.out.println("first has been added: " + bank1.addCustomer(first)
                + " piggy belly: "+ first.balanceRounder());

        System.out.println("Listing all customers: "+ bank1.listAllCustomers());

        System.out.println(bank1.addCustomer(new Customer("Gig",25.22)));
        System.out.println("Find bob and add some money: "
                +bank1.findCustomer("Bob").credit(56.00));
        System.out.println(bank1.findCustomer("Bob").balanceRounder());
        System.out.println(bank1.addCustomer(new Customer("Bib",0.25)));
        System.out.println(bank1.addCustomer(new Customer("Gic",100.00)));
        System.out.println("---".repeat(45));
        System.out.println(bank1.listAllCustomers());
        System.out.println("After this point i need you to freak out ");
        System.out.println(bank1.addCustomer(new Customer("Gig",456.22)));
        System.out.println("---".repeat(45));


    }

}
