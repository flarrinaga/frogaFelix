package com.myapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    @Test
    public void testApp() {
        // Write your test cases here
        // Example:
        // assertEquals(expected, actual);
        // write test for factorial
        assertEquals(120, App.factorial(5));
    }
}