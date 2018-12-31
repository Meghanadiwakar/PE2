/*this is a program which takes in num and string
*and last n  characters of integer
 *  should be repeated in string
 */
package set1;

import java.util.Scanner;
    public class Repeatnumber
    {
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter String:");
            String str = input.nextLine();
            System.out.println("Enter number:");
            int n = input.nextInt();

            for (int i = 0; i <= str.length() - 1; i++ ) {
                System.out.print(str.charAt(i));
            }
            for (int j = 0; j < n; j++) {
                for (int i = str.length() - n; i <= str.length() - 1; i++) {
                    System.out.print(str.charAt(i));
                }
            }
        }
    }


