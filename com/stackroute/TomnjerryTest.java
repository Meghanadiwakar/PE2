package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class TomnjerryTest {
@Test
public void testCheckrange(){
    Tomnjerry test = new Tomnjerry();
    int result = test.check(234356);
    assertEquals(2, result);
}
@Test
    public void testCheckeven(){
        Tomnjerry test = new Tomnjerry();
        int result = test.check(24);
        assertEquals(0, result);
    }

    @Test
    public void testCheckodd(){
        Tomnjerry test = new Tomnjerry();
        int result = test.check(23);
        assertEquals(1, result);
    }

}