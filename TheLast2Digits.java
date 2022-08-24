
//package CodeForces
import java.util.Scanner;

/*  Y. The last 2 digits
time limit per test1 second
memory limit per test256 megabytes
input standard input
output standard output
*/
public class TheLast2Digits {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numbers = new int[4];
            long multiple = 1;

            for (int index = 0; index < numbers.length; index++) {
                numbers[index] = scanner.nextInt();
                multiple *= numbers[index];
            }

            System.out.println(multiple % 100);

        }
        ;
    }
}
