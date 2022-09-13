
//package CodeForces
import java.util.Scanner;
/*  X. Two intervals
time limit per test1 second
memory limit per test256 megabytes
input standard input
output standard output
*/

import static java.lang.Math.*;

public class TwoIntervals {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int[] in = new int[4];

            for (int i = 0; i < in.length; i++) {
                in[i] = scanner.nextInt();

            }

            if (max(in[0], in[2]) > min(in[1], in[3]))
                System.out.println(-1);
            else
                System.out.println(max(in[0], in[2])+" "+min(in[1], in[3]));

        }
    }
}
