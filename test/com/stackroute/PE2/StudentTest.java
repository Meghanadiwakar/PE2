/* Write a program, which reads number of students
and n grades as input (of int between 0 
and 100, inclusive) and displays the average,
minimum and maximum.Your program shall 
 check for valid input. You should
keep all the grades in an int[] 
and use a method for each of the computations.
*/

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
//test for success average//
    @Test
    public void testForAverage(){
        double result = test.AverageCalculation(a,2);
        assertEquals(15, result,0);
    }

//test for minimum//
    @Test
    public void testForMininmum(){


        int result = test.getminimun(a , 2);
        assertEquals(10, result);
    }
//test for maximum//
    @Test
    public void testForMaximum(){
        int result = test.getmaximum(a, 2);
        assertEquals(20, result);
    }



}



