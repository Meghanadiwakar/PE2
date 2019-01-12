/*Write a Java method to check if a given number is power of 4*/


package com.stackroute.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Powerof4Test {
   Powerof4 test;
    @Before
    public void setUp(){
        test=new Powerof4();
    }
    @After
    public void Teardown(){
        test=null;
    }
    //test for success//
    @Test
    public void testForNumberWhichIsAPowerOf4(){

        int result = test.isPowerOfFour(64);
        assertEquals(1, result);
    }
//test for failure//
    @Test
    public void testForNumberWhichIsANotPowerOf4(){

        int result = test.isPowerOfFour(23);
        assertEquals(0, result);
    }
    //test for null//

    @Test
    public void testForNull(){

        int result = test.isPowerOfFour(-2);
        assertEquals(2, result);
    }


}



