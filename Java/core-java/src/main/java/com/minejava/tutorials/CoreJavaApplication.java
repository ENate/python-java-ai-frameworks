package com.minejava.tutorials;

import java.util.ArrayList;
import java.util.List;


import com.minejava.tutorials.dao.CoreLambda;

public class CoreJavaApplication {
    public static void main(String[] args) {
        List<CoreLambdaImpl> mPersons = new ArrayList<>();

    //
    CoreLambdaImpl coreLambdaImpl = new CoreLambdaImpl(23, "Hoster Maerst");
    CoreLambdaImpl coreLambdaImpl2 = new CoreLambdaImpl(25, "Jearter");
    CoreLambdaImpl coreLambdaImpl3 = new CoreLambdaImpl(23, "Hoster");

    mPersons.add(coreLambdaImpl);
    mPersons.add(coreLambdaImpl2);
    mPersons.add(coreLambdaImpl3);
    CoreLambda coreLambda = p -> p.getAge() >= 24;
    System.out.println(coreLambda.testPerson(coreLambdaImpl2));
    // Add entries
    // Call to function
    System.out.println();
    System.out.println("The name found is ..");
    CoreLambdaImpl cLambdaImpl = new CoreLambdaImpl();
    cLambdaImpl.verifyPersonsWithAge(mPersons);
    }






}
