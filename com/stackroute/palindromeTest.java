package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class palindromeTest {
    @Test
    public void testCheckNotPalindrome(){
        palindrome test = new palindrome();
        int result = test.check(234356);
        assertEquals(0, result);
    }

    @Test
    public void testCheckPalindromeSumGreater(){
        palindrome test = new palindrome();
        int result = test.check(2468642);
        assertEquals(1, result);
    }

    @Test
    public void testCheckPalindromeSumLess(){
        palindrome test = new palindrome();
        int result = test.check(12345654321L);
        assertEquals(2, result);
    }




}