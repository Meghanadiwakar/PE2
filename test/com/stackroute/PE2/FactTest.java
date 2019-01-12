/*Write a program to list all the factorials,
that can be expressed as an int 
(i.e., 32-bit signed integer).
*/


package com.stackroute.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactTest {

    Fact test;
    @Before
    public void setUp()
    {
        test=new Fact();
    }

    @After
    public void Teardown(){
        test=null;
    }

    //test for success//
    @Test
    public void testForIntFactorial(){
        int result= test.factCal(3);
        assertEquals(6,result);

    }

//test for long factorial//
    @Test
    public void testForLongFactorial(){
        int result= (int) test.factCal1(12);
        assertEquals(479001600,result);

    }

    //test for failure//
    @Test
    public void testForfailure() {
        int result = (int) test.factCal1(12);
        assertNotEquals(4600, result);
    }

    }

