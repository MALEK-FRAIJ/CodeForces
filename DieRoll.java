
//package CodeForces;
import java.util.Scanner;

/**
 * DieRoll
 */

/* A. Die Roll (2) */
public class DieRoll {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            String[] result = { "1/1", "5/6", "2/3", "1/2", "1/3", "1/6" };
            int person1, person2;

            person1 = scan.nextInt();
            person2 = scan.nextInt();

            System.out.println(result[Math.max(person1, person2) - 1]);
        }

    }
}
