
//package CodeForces;

import java.util.Scanner;

/* A. Shaass and Oskols (3) */
public class ShaassAndOskols {

    public static double round(double n) {
        if (n >= ((int)n + 0.5)) {
            return (int) n + 1;
        } else {
            return (int) n;
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(Math.round(2.1784 /0.01)*0.01);

    }
}
