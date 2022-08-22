package com.minejava.tutorials.dao;

import java.util.List;

import com.minejava.tutorials.PersonImpl;

public interface Person {
    void printPersonsOlderThan(List<Person> someRoosters);
    void printPersonsWithinAgeRange(List<Person> roster, int low, int high);

    int getAge();
    void  printPerson();
    boolean test(PersonImpl p);

}
