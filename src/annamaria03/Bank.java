package annamaria03;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customerList;
    private ArrayList<Double> transactions;
    private String name;

    public Bank() {
        this.customerList = new ArrayList<>();
        this.transactions = new ArrayList<>();
        this.name = "PiggyBigBangBank";
    }

    @Override
    public String toString() {
        return " transactions done= " + transactions + " at " + name;
    }

    public ArrayList<Customer> addCustomer(Customer newCustomer) {
        if (filter(newCustomer)) {
            customerList.add(newCustomer);
        }
        return customerList;
    }

    public boolean filter(Customer newCustomer) {
        for (var c : customerList) {
            if (c.getName()==null || c.getName().equals(newCustomer.getName())) {
                System.out.println("Fuck!" + c.getName() + " was on the list");
                return false;
            }
        }
        return true;
    }

    public Customer findCustomer(String customer) {
        for (Customer c : customerList) {
            if (c.getName().equalsIgnoreCase(customer)) {
                return c;
            }
            System.out.println("No hit for: " + customer);
        }
        return null;
    }

    public ArrayList<Customer> listAllCustomers() {
        return customerList;
    }

    public ArrayList<Double> credit(Double amount) {
        if (amount > 0) {
            transactions.add(amount);
            System.out.println(amount + " credit has been added to your account");
            return transactions;
        }
        return transactions;
    }

    public ArrayList<Double> debit(Double amount) {
        if (amount < 0) {
            transactions.add(amount);
            System.out.println(amount + " has been withdraw from your account");
            return transactions;
        }

        return transactions;
    }

    public Double getBalance() {
        return transactions.stream().mapToDouble(a -> a).sum();
    }

    public String balanceRounder(){
        return String.format("%1.2f",getBalance());
    }

}
