//package CodeForces;

import java.util.Scanner;
/* N. Char
 time limit per test0.25 seconds
memory limit per test64 megabytes
input standard input
output standard output
 */

//Note : difference between 'a' and 'A' in ASCII is 32 .
public class Char {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            char x = scan.next().charAt(0);

            if (x > 64 && x < 91) {
                System.out.println((char) (x + 32));
            } else {
                System.out.println((char) (x - 32));
            }
        }

    }
}
