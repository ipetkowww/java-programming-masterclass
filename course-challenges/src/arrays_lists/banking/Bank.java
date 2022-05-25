package arrays_lists.banking;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            System.out.println("Customer details for branch " + existingBranch.getName());
            for (int i = 0; i < existingBranch.getCustomers().size(); i++) {
                Customer customer = existingBranch.getCustomers().get(i);
                System.out.printf("Customer: %s[%d]%n", customer.getName(), (i + 1));
                if (printTransactions) {
                    System.out.println("Transactions");
                    for (int j = 0; j < customer.getTransactions().size(); j++) {
                        System.out.printf("[%d]  Amount %.2f%n", (j + 1), customer.getTransactions().get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private Branch findBranch(String nameOfBranch) {
        Branch foundBranch = null;
        for (Branch branch : branches) {
            if (branch.getName().equals(nameOfBranch)) {
                foundBranch = branch;
                break;
            }
        }
        return foundBranch;
    }
}
