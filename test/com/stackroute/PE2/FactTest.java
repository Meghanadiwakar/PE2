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

    @Test
    public void testForIntFactorial(){
        int result= test.factCal(3);
        assertEquals(6,result);

    }


    @Test
    public void testForLongFactorial(){
        int result= (int) test.factCal1(12);
        assertEquals(479001600,result);

    }
}


