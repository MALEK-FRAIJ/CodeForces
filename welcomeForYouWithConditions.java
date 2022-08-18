//package CodeForces;

import java.util.Scanner;

/* Welcome for you with Conditions*/
public class welcomeForYouWithConditions {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            // Only one line containing two numbers A and B (0 ≤ A, B ≤ 100).
            byte number1, number2;

            number1 = scan.nextByte();
            number2 = scan.nextByte();

            // Print "Yes" if A is greater than or equal to B.
            if (number1 >= number2) {

                System.out.println("Yes");

                // Otherwise print "No".
            } else {
                System.out.println("No");
            }
        }

    }
}
