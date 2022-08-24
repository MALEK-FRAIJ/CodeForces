//package CodeForces

import java.util.Scanner;

/* D. Ali Baba and Puzzles
time limit per test1 second
memory limit per test256 megabytes
input standard input
output standard output
*/

/**
 * AliBabaAndPuzzles
 */
public class AliBabaAndPuzzles {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            long[] a = new long[4];

            for (int index = 0; index < a.length; index++) {
                a[index] = scanner.nextLong();
            }

            if (a[0] - a[1] * a[2] == a[3] || a[0] * a[1] - a[2] == a[3] || a[0] + a[1] * a[2] == a[3] ||
                    a[0] * a[1] + a[2] == a[3] || a[0] + a[1] - a[2] == a[3] || a[0] - a[1] + a[2] == a[3])
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}
