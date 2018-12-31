/*this program accepts a number and if it is in the range specified
* or matches the target separate messages appear accordingly
 */
package set1;

import java.util.Scanner;

    public class Guesstarget {


        public static void main(String[] args) {
            int n;
            int sum = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your Number:");

            while (input.hasNextInt()) {
                n = input.nextInt();
                if( n >=1 && n <= 100 )
                {
                    System.out.println("Number guessed matches the original number" );
                    break;
                }
                else if(n<=1 )
                {
                    System.out.println("Number guessed is less than the original number" );
                }
                else
                {
                    System.out.println("Number guessed is more than the original number" );
                }
            }

        }
    }


