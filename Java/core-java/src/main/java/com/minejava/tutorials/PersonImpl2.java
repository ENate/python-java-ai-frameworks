package com.minejava.tutorials;

import java.util.List;

import com.minejava.tutorials.dao.CheckPerson;


public class PersonImpl2<T> implements CheckPerson<T> {

    public enum Sexed {
        MALE, FEMALE;
    }

    int age;
    Sexed gendered;
    String names;


    public PersonImpl2(int someAge, Sexed sex, String anames) {
        this.names = anames;
        this.gendered = sex;
        this.age = someAge;
    }

    public int getAge() {
        return age;
    }

    public Sexed getGendered() {
        return gendered;
    }

    void printPerson() {

    }

    public void printPersonsOlderThan(List<PersonImpl2<T>> roster, int age) {
        // DO Auto-generated method stub

        for (PersonImpl2<T> p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }

    }

    @Override
    public boolean testMethod(T p2Impl) {
        // Implemented Auto-generated method stub
        return false;
    }

    public void printPersonsWithPredicate(List<PersonImpl2<T>> proster, CheckPerson<PersonImpl2<T>> tester) {
        for (PersonImpl2<T> p2 : proster) {
            if(tester.testMethod(p2)) {
                p2.printPerson();
            }
        }
    }



}
