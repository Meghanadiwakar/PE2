/*program which accepts word and
*checks each letter for consonant or vowel
 */
package set1;

import java.util.Scanner;
public class Vowelnconsonant {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your String");
            String str=input.nextLine();
            char c;
            for(int i=0; i<str.length() ;i++ ) {
                c=str.charAt(i);
                if( c== 'a' || c =='e' || c =='i' || c =='o' || c == 'u' )
                {
                    System.out.println(str.charAt(i) + " = Vowel");
                }
                else
                {
                    System.out.println(str.charAt(i) + " = Consonent");
                }
            }

        }
    }

