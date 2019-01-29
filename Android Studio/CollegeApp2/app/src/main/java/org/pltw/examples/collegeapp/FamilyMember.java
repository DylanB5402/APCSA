package org.pltw.examples.collegeapp;

public class FamilyMember {

    private String firstName, lastName;

    public FamilyMember() {
        this.firstName = "Ada";
        this.lastName = "Lovelace";
    }

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
}
