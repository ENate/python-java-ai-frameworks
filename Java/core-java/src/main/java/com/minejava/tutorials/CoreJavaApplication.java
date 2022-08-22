package com.minejava.tutorials;

import java.util.ArrayList;
import java.util.List;

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
    // Add entries
    // Call to function
    System.out.print("Youa re here..");
    CoreLambdaImpl cLambdaImpl = new CoreLambdaImpl();
    cLambdaImpl.verifyPersonsWithAge(mPersons);
    }






}
