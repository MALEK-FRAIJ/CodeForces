//package CodeForces

import java.util.Scanner;

/*  T. Sort Numbers
    time limit per test0.25 seconds
    memory limit per test256 megabytes
    input standard input
    output standard output
    */
public class SortNumbers {

    public void insertionSort(int n[]) {
        int i, j, temp;
        for (i = 1; i < n.length; i++) {
            temp = n[i];
            j = i - 1;
            while (j >= 0 && n[j] > temp) {
                n[j + 1] = n[j];
                j--;
            }
            n[j + 1] = temp;
        }

    }

    public void inputArray(int n[], Scanner s) {

        for (int i = 0; i < n.length; i++) {
            n[i] = s.nextInt();
        }

    }

    public void printSortNumbers(int n[], String order) {

        if (order == "ASC") {
            for (int num : n)
                System.out.println(num);

            System.out.println();

        } else {
            for (int i = 0; i <n.length; i++) {
                System.out.println(n[i]);
            }

        }

    }

    public static void main(String[] args) {
        SortNumbers sortNumbers = new SortNumbers();
        try (Scanner scanner = new Scanner(System.in)) {

            int numbers[] = new int[3];
            sortNumbers.inputArray(numbers, scanner);
            sortNumbers.insertionSort(numbers);
            sortNumbers.printSortNumbers(numbers, "ASC");
            sortNumbers.printSortNumbers(numbers, "simple");

        }

    }
}
