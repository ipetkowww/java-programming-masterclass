package oop_part2.master_oop_challenge;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;


    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown");
    }

    public void addHealthAddition1(String additionName, double price) {
        healthyExtra1Name = additionName;
        healthyExtra1Price = price;
    }

    public void addHealthAddition2(String additionName, double price) {
        healthyExtra2Name = additionName;
        healthyExtra2Price = price;
    }
}
