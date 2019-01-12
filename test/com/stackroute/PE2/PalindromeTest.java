/*/*Write a Java method to Reverse the given*
* input & Check if it is a Palindrome.*/
*/

package com.stackroute.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome object;
    @Before
    public void setUp()
    {
        object = new Palindrome();
    }
    @After
    public void tearDown(){
        object = null;
    }
    //test for success.//
    @Test
    public void testSuccess() {
        String expectedValue = "Palindrome";
        //Act
        String actualValue = object.reverse("abcdcba");
        //Assert
        assertEquals(expectedValue,actualValue);
    }
    //test for failure//
    @Test
    public void testFailure() {
        String expectedValue = "Palindrome";
        //Act
        String actualValue = object.reverse("abcd");
        //Assert
        assertNotEquals(expectedValue,actualValue);
    }
//test for null//
    @Test
    public void testnull() {
        String expectedValue = null;
        //Act
        String actualValue = object.reverse("");
        //Assert
        assertNotEquals(expectedValue,actualValue);
    }
}




