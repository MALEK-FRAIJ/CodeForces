//package CodeForces

import java.util.Scanner;

/* C. Next Alphabet
time limit per test1 second
memory limit per test256 megabytes
input standard input
output standard output*/

/**
 * NextAlphabet
 */
public class NextAlphabet {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner (System.in)){
            char c = scanner.next().charAt(0),result;

            result = (char) (c == 122 ? c-25 : c+1);
            System.out.println(result);
        }
    }
}