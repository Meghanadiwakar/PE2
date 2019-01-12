/*/*Create a class named Member with Name, age, Salary 
as its variable, write an other class 
named Member Variable that creates 
an instance of the Member class, initialises
its member variables, and then displays
the value of each member variable.*/*/


package com.stackroute.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {
    @Before
    public void setUp() {
        MemberVariable obj = new MemberVariable();
    }
//test for success//
    @Test
    public void MemberTestSuccess() {
        MemberVariable obj = new MemberVariable();
        String expectedName = "Name : Harry Potter";
        String actualName = obj.memberName("Name : Harry Potter");
        assertEquals(expectedName, actualName);
        int expectedAge = 60;
        int actualAge = obj.memberAge(60);
        assertEquals(expectedAge, actualAge);
        String expectedSalary = "2700";
        String actualSalary = obj.memberSalary("2700");
        assertEquals(expectedSalary, actualSalary);
    }
//test for failure//
    @Test
    public void MemberTestFailure() {
        MemberVariable obj = new MemberVariable();
        String expectedValue1 = "";
        String actualValue1 = obj.memberName("hima");
        assertNotEquals(expectedValue1, actualValue1);
    }

    @After
    public void tearDown() {
        MemberVariable obj = new MemberVariable();
        obj = null;
    }
}

