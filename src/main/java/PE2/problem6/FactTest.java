package PE2.problem6;

public class FactTest {
    static int factCal(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {

            fact = fact * i;

        }
        return fact;
    }


    static long factCal1(long x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {

            fact = fact * i;

        }
        return fact;
    }
}


       /* public static void main(String args[])

        {

            int n,fact=0;

            /*n=Long.parseLong(args[0]);*/

            /*fact=factCal(n);

            System.out.println("fact="+fact);

        }*/



