package com.minejava.tutorials;

import java.util.List;
import java.util.function.Predicate;

import com.minejava.tutorials.dao.CoreLambda;

public class CoreLambdaImpl implements CoreLambda{

    int age;
    String names;

    public CoreLambdaImpl() {

    }
    public CoreLambdaImpl(int argAge, String names) {
        this.age = argAge;
        this.names = names;

    }

    // Getter method
    public int getAge() {
        return age;
    }

    public String getNames() {
        return names;
    }


    public void verifyPersonsWithAge(List<CoreLambdaImpl> roster) {
        // Done Auto-generated method stub
        for (CoreLambdaImpl p2 : roster) {
            if (p2.getNames()=="Hoster" && testPerson(p2)) {
                System.out.println("Found!! " + p2.getNames());
            } else {
                System.out.println("Name is not found!!");
            }
        }
    }

    public static void printPersonsWithPredicate(
    List<CoreLambdaImpl> roster, Predicate<CoreLambdaImpl> tester) {
    for (CoreLambdaImpl p : roster) {
        if (tester.test(p)) {
            p.printPerson();
        }
    }
}

    public void printPerson() {

    }

    public static void printPersons(
    List<CoreLambdaImpl> roster, CoreLambda tester) {
    for (CoreLambdaImpl p : roster) {
        if (tester.testPerson(p)) {
            p.printPerson();
        }
    }
}

    @Override
    public boolean testPerson(CoreLambdaImpl p) {
        // DO Auto-generated method stub
        return p.getAge() <= 25 && p.getAge() >=18;
    }
    @Override
    public String toString() {
        return "CoreLambdaImpl [age=" + age + ", names=" + names + "]";
    }
}
