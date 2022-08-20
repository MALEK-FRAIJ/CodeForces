
//package CodeForces
import java.util.Scanner;

/**
 * AgeInDays
 */

/*
 * R. Age in Days
 * time limit per test1 second
 * memory limit per test256 megabytes
 * input standard input
 * output standard output
 */
public class AgeInDays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();

        System.out.println(days / 365 + " years");
        days %= 365;
        System.out.println(days / 30 + " months");
        days %= 30;
        System.out.println(days + " days");
    }
}