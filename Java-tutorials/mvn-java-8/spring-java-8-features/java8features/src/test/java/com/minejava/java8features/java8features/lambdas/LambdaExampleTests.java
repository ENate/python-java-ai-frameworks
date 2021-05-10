package com.minejava.java8features.java8features.lambdas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import lambdas.LambdaExample;


public class LambdaExampleTests {
    // Create object
    private final LambdaExample calculator = new LambdaExample();

    @Test
    void testAddition()
    {
        // test addition method of the calculator class
        int resultInterger = calculator.additionOperator(4, 10);
        assertEquals(14, resultInterger);
    }

}
