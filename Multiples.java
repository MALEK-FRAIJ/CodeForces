//package CodeForces;

import java.util.Scanner;

/* J. Multiples
time :limit per test1 second
memory: limit per test256 megabytes
input: standard input
output: standard output */

public class Multiples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long a, b;
        a = scan.nextLong();
        b = scan.nextLong();

        /* ***A is said to be Multiple of B if B is divisible by A. */

        if (a % b == 0 || b % a == 0) {
            // Print "Multiples" if A is multiple of B or vice versa
            System.out.println("Multiples");

        } else {

            // Otherwise print "No Multiples". 
            System.out.println("No Multiples");
        }

    }
}
