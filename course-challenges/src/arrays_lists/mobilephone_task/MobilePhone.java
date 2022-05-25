package arrays_lists.mobilephone_task;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> myContacts;
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        boolean isAdded = false;
        if (findContact(contact.getName()) < 0) {
            myContacts.add(contact);
            isAdded = true;
        }
        return isAdded;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        boolean isUpdated = false;

        if (findContact(oldContact) >= 0) {
            int positionOfOldContact = findContact(oldContact);
            myContacts.set(positionOfOldContact, newContact);
            isUpdated = true;
        }
        return isUpdated;
    }

    public boolean removeContact(Contact contact) {
        return myContacts.remove(contact);
    }

    public Contact queryContact(String contactName) {
        int contactPosition = findContact(contactName);
        if (contactPosition >= 0) {
            return myContacts.get(contactPosition);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.printf("%d. %s -> %s%n", (i + 1), myContacts.get(i).getName(), myContacts.get(i).getPhoneNumber());
        }
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            String currentContactName = myContacts.get(i).getName();
            if (currentContactName.equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
}
