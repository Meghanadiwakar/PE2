/*Write a Java method to check if a given number is power of 4*/

package com.stackroute.PE2;

public class Powerof4 {
    static int isPowerOfFour(int n)
    {
       if (n == 0)
            return 0;
        if(n<0)
            return 2;
        while (n != 1) {
            if (n % 4 != 0)
                return 0;
            n = n / 4;
        }
        return 1;
    }
}



