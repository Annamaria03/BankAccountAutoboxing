package annamaria03;

import java.util.Random;

public class Customer extends Bank{
    private String name;
    private Long accountNum;
    private double initialAmount;

    public Customer(String name, double initialAmount) {
        this.name=name;
        this.accountNum =accountNumGenerator();
        this.initialAmount=initialAmount;

    }

    @Override
    public String toString() {
        return "Customer{" +
                "name=" + name +
                ", account number= " + accountNum +
                ", initialAmount= " + initialAmount +
                "} " + super.toString() + "the current amount is " + balanceRounder();
    }

    public String getName() {
        return name;
    }

    public Long accountNumGenerator(){
        Random random = new Random();
        return random.nextLong(1000000000)*10;
    }

    public double getInitialAmount() {
        return initialAmount;
    }

    @Override
    public Double getBalance() {
        return getInitialAmount()+super.getBalance();
    }

}
