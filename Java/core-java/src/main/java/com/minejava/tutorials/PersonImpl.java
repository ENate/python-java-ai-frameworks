package com.minejava.tutorials;

import java.time.LocalDate;
import java.util.List;

import com.minejava.tutorials.dao.Person;

public class PersonImpl implements Person {

    public enum Sex {
        MALE, FEMALE;
    }

    // Define some fields
    String names;
    int age;
    Sex gender;
    LocalDate bithday;
    String emailAddress;

    // Constructor
    public PersonImpl() {

    }

    public PersonImpl(String namesOfAll, int allAges) {
        this.age = allAges;
        this.names = namesOfAll;
    }
    // Some args const
    public PersonImpl(String namesArg, LocalDate bdate) {
        this.bithday = bdate;
        this.names = namesArg;
    }

    // Another Overloaded const
    public PersonImpl(String aname, Sex agender, String emailAdd) {
        this.names = aname;
        this.gender = agender;
        this.emailAddress = emailAdd;
    }

    // All Args constructor
    public PersonImpl(String allNames, Sex allGender, LocalDate myDate, String emails, int ageArg) {
        this.age = ageArg;
        this.names = allNames;
        this.gender = allGender;
        this.bithday = myDate;
        this.emailAddress = emails;
    }

    // Getters and Setters
    public LocalDate getBirthDay() {
        return bithday;
    }

    public String getNames() {
        return names;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    public Sex getGender() {
        return gender;
    }

    @Override
    public int getAge() {
        return age;
    }
    // Setters
    public void setBirthDay(LocalDate lDate) {
        this.bithday = lDate;
    }

    public void setNames(String pNames) {
        this.names = pNames;
    }

    public void setEmailAddress(String mEmails) {
        this.emailAddress = mEmails;
    }
    public void setGender(Sex myGender) {
        this.gender = myGender;
    }

    public void setAge(int myAge) {
        this.age = myAge;
    }

    @Override
    public void printPersonsOlderThan(List<Person> rosters) {
        // TDO Auto-generated method stub
        for (Person p : rosters) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }

    }

    @Override
    public void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
        for (Person p: roster ) {
            if (low < p.getAge() && p.getAge() < high) {
                p.printPerson();
            }
        }
    }

    @Override
    public void printPerson() {
        System.out.println("Printing person details...");
    }

    void printPerson(List<PersonImpl> roster, PersonImpl tester) {
        for (PersonImpl p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    @Override
    public boolean test(PersonImpl pImpl) {
        return pImpl.gender == PersonImpl.Sex.MALE &&
            pImpl.getAge() >= 18 &&
            pImpl.getAge() <= 25;
    }


}
