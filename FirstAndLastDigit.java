
// Java program to find first and
// last digits of a number
import java.math.*;
import java.util.*;

class firstAndLastDigit {

    // Find the first digit
    static int firstDigit(int n) {
        // Find total number of digits - 1
        int digits = (int) (Math.log10(n));

        // Find first digit
        n = (int) (n / (int) (Math.pow(10, digits)));

        // Return first digit
        return n;
    }

    // Find the last digit
    static int lastDigit(int n) {
        // return the last digit
        return (n % 10);
    }

    // Driver program
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(firstDigit(n) +
                " " + lastDigit(n));
    }
}

// Time Complexity: O(1)
// Auxiliary Space: O(1)
