// package CodeForces

import java.util.Scanner;

/*  E. Interval Sweep
time limit per test1 second
memory limit per test256 megabytes
input standard input
output standard output
*/
/**
 * IntervalSweep
 */
public class IntervalSweep {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int oddNumber, evenNumber;
        
            oddNumber = scanner.nextInt();
            evenNumber = scanner.nextInt();
        

            if (oddNumber - evenNumber == 1 ||oddNumber - evenNumber == -1||
            (oddNumber ==evenNumber && oddNumber!=0&& evenNumber!=0 )) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}