
//package CodeForces
import java.util.Scanner;

/*  A. Winter Sale
time limit per test1 second
memory limit per test256 megabytes
input standard input
output standard output*/
public class WinterSale {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double discount, discountPrice;
            double originalPrice;

            discount = scanner.nextInt();
            discountPrice = scanner.nextInt();

            // discountPrice = originalPrice-(originalPrice*discount/100)
            originalPrice = discountPrice / (1 - discount / 100);

            System.out.printf("%.2f", originalPrice);

        }
    }
}
