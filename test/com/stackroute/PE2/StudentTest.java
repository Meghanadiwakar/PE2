package com.stackroute.PE2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    private Student test;
    private static final int [] a=new int[2];

    @Before
    public void setUp(){

        test=new Student();
        a[0]=10;
        a[1]=20;
    }

    @Test
    public void testForAverage(){
        double result = test.AverageCalculation(a,2);
        assertEquals(15, result,0);
    }


    @Test
    public void testForMininmum(){


        int result = test.getminimun(a , 2);
        assertEquals(10, result);
    }

    @Test
    public void testForMaximum(){
        int result = test.getmaximum(a, 2);
        assertEquals(20, result);
    }



}

