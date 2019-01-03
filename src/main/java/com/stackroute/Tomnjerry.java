package com.stackroute;

import java.util.Scanner;

public class Tomnjerry {

    public int check(long k) {
        if (k % 2 == 0) {
            if ((k >= 20) && (k <= 30))
                return 0;
        } else if (k >= 20 && k <= 30) {
            return 1;
        }
        return 2;
    }

    public static void main(String[] args) {

        int p;
        Tomnjerry q = new Tomnjerry();

        /** taking input */
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");

        /** number might be long and not fit in int*/
        long n = sc.nextLong();
        p = q.check(n);

        /** checking if the number and its reverse are same */
        if (p == 0) {
            System.out.println("jerry");
        } else {
            if (p == 1) {
                System.out.println("tom");
            } else {
                if (p == 2) {

                    System.out.println("number out of range");
                }

            }
        }
    }
}





