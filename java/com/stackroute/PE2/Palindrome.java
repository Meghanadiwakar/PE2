/*Write a Java method to Reverse the given*
* input & Check if it is a Palindrome.*/

package com.stackroute.PE2;

public class Palindrome {
//this method checks for palindrome//
    public String reverse(String str) {
        String temp = "";
        if (str != null) {
            for (int i = (str.length()) - 1; i >= 0; i--) {
                temp = temp + str.charAt(i);

            }
            if (temp.equals(str)) {
                return ("Palindrome");
            } else {


                return ("not palindrome");
            }
        }
        return null;
    }
}

