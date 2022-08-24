//package CodeForces

import java.util.Scanner;

/*  B. Memo and Momo
time limit per test1 second
memory limit per test256 megabytes
input standard input
output standard output*/

public class MemoAndMomo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            long a, b, k;
            a = scanner.nextLong();
            b = scanner.nextLong();
            k = scanner.nextLong();

            if (a % k == 0 && b % k == 0) {
                System.out.println("Both");
            } else if (a % k == 0 && b % k != 0) {
                System.out.println("Memo");
            } else if (b % k == 0 && a % k != 0) {
                System.out.println("Momo");
            } else {
                System.out.println("No One");
            }

        }
    }
}
