package oop_part1.bank_account;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setCustomerName("Ivan Petkov");
        bankAccount.setBalance(1000);
        bankAccount.setAccountNumber("BG123456");
        bankAccount.setEmail("ivan@randombank.com");
        bankAccount.setPhoneNumber("08123123123");

        bankAccount.deposit(500);
        System.out.println("You have " + bankAccount.getBalance() + " BGN in your bank account.");

        boolean withdraw = bankAccount.withdraw(1600);
        if (withdraw) {
            System.out.println("After withdraw you have " + bankAccount.getBalance() + " BGN in you bank account.");
        } else {
            System.out.println("You cannot withdraw desired amount of money.");
        }
    }

}
