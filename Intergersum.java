/*this program reads unspecified number of only integers
* and adds them. The program displays total sum and
* shows error for non integer values
 */

package set1;

import java.util.Scanner;

    public class Intergersum
    {
        public static void main(String[] args) {
            int n;
            int sum = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your Numbers:");

            while(input.hasNextInt())
            {
                n = input.nextInt();
                sum = sum + n;
            }
            System.out.println("Oops! You didn't enter an Integer Number.\n");
            System.out.println("Sum = " + sum);

        }

    }

