/* Write a boolean method called isEven()
in a class called EvenNumTest,
which takes an int as input and returns true
if the input is even. 
The signature of the method is 
as follows: public static boolean isEven(int number)*/


package com.stackroute.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenTest {
    Even test;
    @Before
    public void setUp(){
        test=new Even();
    }
    @After
    public void Teardown(){
        test=null;
    }
//test for success//
    @Test
    public void testForEvennumber() {
        int result = test.Evenodd(2);
        assertEquals(0, result);
    }
//test for failure//  //test for odd//
    @Test
    public void testForOddnumber() {
        int result = test.Evenodd(5);
        assertEquals(1, result);

    }
//test for null//
    @Test
    public void testFornull() {
        int result = test.Evenodd(-2);
        assertEquals(2, result);

    }

}
