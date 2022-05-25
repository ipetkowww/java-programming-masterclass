package oop_part2.master_oop_challenge;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String additionName, double additionPrice) {
        addition1Name = additionName;
        addition1Price = additionPrice;
    }

    public void addHamburgerAddition2(String additionName, double additionPrice) {
        addition2Name = additionName;
        addition2Price = additionPrice;
    }

    public void addHamburgerAddition3(String additionName, double additionPrice) {
        addition3Name = additionName;
        addition3Price = additionPrice;
    }

    public void addHamburgerAddition4(String additionName, double additionPrice) {
        addition4Name = additionName;
        addition4Price = additionPrice;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = price;
        System.out.printf("%s hamburger on a %s roll price is %.2f%n", name, breadRollType, price);
        if (addition1Name != null && !addition1Name.equals("")) {
            hamburgerPrice += addition1Price;
            System.out.printf("Added %s for an extra %.2f%n", addition1Name, addition1Price);
        }
        if (addition2Name != null && !addition2Name.equals("")) {
            hamburgerPrice += addition2Price;
            System.out.printf("Added %s for an extra %.2f%n", addition2Name, addition2Price);
        }
        if (addition3Name != null && !addition3Name.equals("")) {
            hamburgerPrice += addition3Price;
            System.out.printf("Added %s for an extra %.2f%n", addition3Name, addition3Price);
        }
        if (addition4Name != null && !addition4Name.equals("")) {
            hamburgerPrice += addition4Price;
            System.out.printf("Added %s for an extra %.2f%n", addition4Name, addition4Price);
        }
        return hamburgerPrice;
    }
}
