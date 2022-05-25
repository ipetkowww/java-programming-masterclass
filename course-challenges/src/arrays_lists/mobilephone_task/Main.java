package arrays_lists.mobilephone_task;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final MobilePhone MOBILE_PHONE = new MobilePhone("0891 23 45 67");

    public static void main(String[] args) {
        printMenu();

        boolean inProgress = true;
        while (inProgress) {
            System.out.println("Please select an option: (NOTE: option 6 to view all listed options)");
            int userChoice = Integer.parseInt(SCANNER.nextLine());
            switch (userChoice) {
                case 0:
                    printAllContacts();
                    break;
                case 1:
                    String contactName = SCANNER.nextLine();
                    String phoneNumber = SCANNER.nextLine();
                    boolean isAdded = addNewContact(contactName, phoneNumber);
                    if (isAdded) {
                        System.out.printf("Contact: %s with phone: %s successfully added!%n", contactName, phoneNumber);
                    } else {
                        System.out.printf("Contact: %s already exist in contact list.%n", contactName);
                    }
                    break;
                case 2:

                    break;
                case 5:
                    inProgress = false;
                    break;
            }
        }
    }

    private static boolean addNewContact(String contactName, String phoneNumber) {
        return MOBILE_PHONE.addNewContact(new Contact(contactName, phoneNumber));
    }

    private static void printAllContacts() {
        MOBILE_PHONE.printContacts();
    }

    public static void printMenu() {
        System.out.println("Mobile Phone Contacts");
        System.out.println("Available options. Select: ");
        System.out.println("\t0: To print all contacts");
        System.out.println("\t1: To add new contact");
        System.out.println("\t2: To updated existing contact");
        System.out.println("\t3: To remove contact");
        System.out.println("\t4: To search/find contact");
        System.out.println("\t5: To quit");
        System.out.println("\t6: To view all available options");
    }



}
