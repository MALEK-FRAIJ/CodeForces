
import java.util.Scanner;

/**
 * Katryoshka
 */

/*
 * G. Katryoshka
 * time limit per test1 second
 * memory limit per test256 megabytes
 * input standard input
 * output standard output
 */
public class Katryoshka {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            long eyes, mouth, body;
            int count = 0;

            eyes = scanner.nextLong();
            mouth = scanner.nextLong();
            body = scanner.nextLong();
            while (true) {

                if (eyes > 0 && mouth > 0 && body > 0) {
                    count++;
                    eyes--;
                    mouth--;
                    body--;
                } else if (eyes > 1 && body > 0) {
                    count++;
                    eyes -= 2;
                    body--;
                } else if (eyes > 1 && mouth > 0 && body > 0) {
                    count++;
                    eyes -= 2;
                    mouth--;
                    body--;
                } else {
                    break;
                }

                System.out.println(count);
            }

        }
    }
}
