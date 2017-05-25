package com.example.nathan.passwordvalidator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    String validPW = "valid-password";

    @Test
    public void testLaziness() throws Exception {
        assertTrue(Password.isNotPassword(validPW));
    }

    @Test
    public void testLength() throws Exception {
        assertTrue(Password.isLongEnough(validPW));
    }

}