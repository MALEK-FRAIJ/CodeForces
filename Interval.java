//package CodeForces;

import java.util.Scanner;

/* S. Interval
   time limit per test1 second
   memory limit per test256 megabytes
   input standard input
   output standard output
 
 */

public class Interval {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            float x = scanner.nextFloat();

            if (x>=0 && x<=25) 
                System.out.println("Interval [0,25]");

            else if (x>25 && x<=50)
                System.out.println("Interval (25,50]");

             else if(x>50 && x<=75) 
                System.out.println("Interval (50,75]");

            else if(x>75 && x<=100)
                System.out.println("Interval (75,100]");
                
            else
                System.out.println("Out of Intervals");
            
        }
    }
}
