package PE2.problem3;

import java.util.Scanner;

public class Even {

    public int Evenodd(int k) {
        if (k % 2 == 0)
            return 0;
        else return 1;
    }
        public static void main(String args[])
        {
            int p;
            Even q = new Even();
            int x;
            System.out.println("Enter an integer to check if it is odd or even");
            Scanner in = new Scanner(System.in);
            x = in.nextInt();
            p= q.Evenodd(x);


            if(p==0)

                System.out.println("The number is even.");
            else if(p==1)
                System.out.println("The number is odd.");
        }
    }

