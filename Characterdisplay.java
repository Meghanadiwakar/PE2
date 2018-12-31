/*this program takes a character from user
*and determines whether capital,small,digit,special symbol
* and displays appropriately
 */

package set1;

import java.util.Scanner;
    public class Characterdisplay
    {

        public static void main(String[] args)
        {
            char s;
            Scanner input=new Scanner(System.in);
            s =input.next().charAt(0);
            if( s >=65 && s <= 90 )
            {
                System.out.println("Capital Letter");
            }
            else if( s >=97 && s <= 122 )
            {
                System.out.println("Small Letter");
            }
            else if( s >= 48 && s <= 57 )
            {
                System.out.println("Digit");
            }
            else
            {
                System.out.println("Special Symbol");
            }

        }
    }

