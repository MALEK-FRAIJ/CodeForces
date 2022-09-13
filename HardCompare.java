//package CodeForces

import java.util.Scanner;

/*  Z. Hard Compare
time limit per test1 second
memory limit per test256 megabytes
input standard input
output standard output
*/

public class HardCompare {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            long [] n = new long[4];

            for (int i = 0; i < n.length; i++) {
                n[i] = scanner.nextLong();
            }
            if (n[1]*Math.log(n[0]) >n[3]*Math.log(n[2])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

         
        };
    }
}
