/*this program uses a loop to print
*numbers upto nth iteration
 */

package set1;

import java.util.Scanner;

public class Iteration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Number:");
        int num=input.nextInt();
        for( int i=1; i<=num; i++ )
        {
            for( int j=1; j<=i ;j++ )
            {
                System.out.print(i+" ");
            }
        }
    }
}
