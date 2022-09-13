
//package CodeForces;
import java.util.Scanner;
/*  T. Sort Numbers
    time limit per test0.25 seconds
    memory limit per test256 megabytes
    input standard input
    output standard output
    */

/**
 * SortNumber
 */
public class SortNumber {
    public void insertionSort(int[] arr, int size) {
        int temp, i, j;
        for (i = 1; i < size; i++) {
            temp = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }

    }

    public void print(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortNumber sortNumber = new SortNumber();
        try (Scanner scanner = new Scanner(System.in)) {
            int [] numbers = new int[3];
            int length = numbers.length;
            int [] n =new int[3];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = scanner.nextInt();
                n[i] = numbers[i];
            }
            sortNumber.insertionSort(numbers, length);
            sortNumber.print(numbers);
            sortNumber.print(n);


        }
    }

}