
//package CodeForces
import java.util.Scanner;

/* Q. Coordinates of a Point
   time limit per test1 second
   memory limit per test256 megabytes
   input standard input
   output standard output 
   */
/**
 * CoordinatesOfAPoint
 */
public class CoordinatesOfAPoint {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            float xAxis, yAxis;

            xAxis = scanner.nextFloat();
            yAxis = scanner.nextFloat();

            if (xAxis > 0 && yAxis!=0) {
                if (yAxis > 0 ) {
                    System.out.println("Q1");
                } else {
                    System.out.println("Q4");
                }
            } else if (xAxis < 0 && yAxis!=0) {
                if (yAxis > 0) {
                    System.out.println("Q2");
                } else {
                    System.out.println("Q3");
                }
            }else if (yAxis == 0 && xAxis!=0) {
                System.out.println("Eixo X");
            }else if (xAxis == 0 && yAxis!=0) {
                System.out.println("Eixo Y");
            }else{
                System.out.println("Origem");
            }
        }
    
            
        

    }

}