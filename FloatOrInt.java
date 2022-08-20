//package CodeForces;

import java.util.Scanner;

/*  U. Float or int
time limit per test1 second
memory limit per test256 megabytes
input standard input
output standard output
*/
public class FloatOrInt {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            float n = scanner.nextFloat();

            if (n == (int) n)
                System.out.println("int " + (int) n);
            else

                // System.out.printf("float %d %.3f ",(int)n,n%(int)n); //wrong answer
                System.out.println("float " + (int) n + " " + String.format("%.3f", n % (int) n));

        }
    }
}
