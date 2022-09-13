
//package CodeForces;
import java.util.Scanner;

/*  O. Calculator
    time limit per test1 second
    memory limit per test256 megabytes
    input standard input
    output standard output
*/
public class Calculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number1, number2;
            char operator;

            number1 = scanner.nextInt();
            operator = scanner.next().charAt(0);
            number2 = scanner.nextInt();

            if (operator == '+')
                System.out.println(number1 + number2);

            else if (operator == '-')
                System.out.println(number1 - number2);
            else if (operator == '*')
                System.out.println(number1 * number2);
            else
                System.out.println(number1 / number2);
        }

    }

}
