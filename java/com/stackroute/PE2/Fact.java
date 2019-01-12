/*Write a program to list all the factorials,
that can be expressed as an int 
(i.e., 32-bit signed integer).
*/

package com.stackroute.PE2;

public class Fact {
//this method returns int factorial//
        static int factCal(int x) {
            int fact = 1;
            for (int i = 1; i <= x; i++) {

                fact = fact * i;

            }
            return fact;
        }


//this method returns long factorial//
        static long factCal1(long x) {
            int fact = 1;
            for (int i = 1; i <= x; i++) {

                fact = fact * i;

            }
            return fact;
        }
    }


