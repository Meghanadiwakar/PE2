/*program accepts integer and
*prints tom if odd, jerry if even
*provided num is between 20 and 30
**/

package set1;

import java.util.Scanner;
public class Tomnjerry {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n;
        n = in.nextInt();
        if (n % 2 == 0) {
            if ((n >= 20) && (n <= 30))
                System.out.println("Jerry");
        } else if (n >= 20 && n <= 30) {
            System.out.println("Tom");
        }
    }
}