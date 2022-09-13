
//package CodeForces;
import java.util.Scanner;

/**
 * Dice-Tower
 */

 /* A. Dice Tower (1) */
 
public class DiceTower {

    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
            int numberOfDice, topOfTower, leftInterface, rightInterface;

            numberOfDice = scan.nextInt();
            topOfTower = scan.nextInt();
            int count = 1;

            for (int i = 0; i < numberOfDice; i++) {

                leftInterface = scan.nextInt();
                rightInterface = scan.nextInt();

                if (topOfTower == rightInterface || topOfTower == leftInterface ||
                        topOfTower == 7 - rightInterface || topOfTower == 7 - leftInterface) {

                    count = 0;

                }
                topOfTower = 7 - topOfTower;
            }

            System.out.println((count == 1 ? "YES" : "NO"));
        }

    }
}