package oop_part1.person;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age < 0 || age > 100 ? 0 : age;
    }

    public boolean isTeen() {
        return getAge() > 12 && getAge() < 20;
    }

    public String getFullName() {
        String name;
        if ((getFirstName() == null || getFirstName().isEmpty()) && (getLastName() == null || getLastName().isEmpty())) {
            name = "";
        } else if (getFirstName() == null || getFirstName().isEmpty()) {
            name = getLastName();
        } else if (getLastName() == null || getLastName().isEmpty()) {
            name = getFirstName();
        } else {
            name = getFirstName() + " " + getLastName();
        }
        return name;
    }
}
