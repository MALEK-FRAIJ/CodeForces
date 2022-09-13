//package CodeForces;

import java.util.Scanner;

/* P. First digit !
   time limit per test0.25 seconds
   memory limit per test64 megabytes
   input standard input
   output standard output
    */

public class FirstDigit {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt(); // number X (999 < X  ≤  9999)

            while (number >= 10) 
                number /= 10;
      
            //If the first digit is even print "EVEN" otherwise print "ODD".
            if (number % 2 == 0)
                System.out.println("EVEN");
            else
                System.out.println("ODD");
        }

    }
}
