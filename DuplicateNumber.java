import java.util.Scanner;

/**
 * DuplicateNumber
 */
public class DuplicateNumber {
    private int size;
    private int[] numbers;

    DuplicateNumber(int size) {
        this.size = size;
        this.numbers = new int[size];
    }

    public void setNumbers(Scanner scanner) {
        for (int j = 0; j < this.size; j++) {
            this.numbers[j] = scanner.nextInt();
        }

    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void printArray() {
        System.out.print("[");
        for (int element : this.numbers) {
            System.out.print(element + ",");
        }
        System.out.println("\b]");
    }

    // Brute-force O(n^2)
    public int duplicateNumber() {
        int i, j;
        for (i = 0; i < this.size; i++) {
            for (j = i + 1; j < this.size; j++) {
                if (numbers[i] == numbers[j]) {
                    return numbers[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        DuplicateNumber duplicateNumber = new DuplicateNumber(6);
        try (Scanner scanner = new Scanner(System.in)) {
            duplicateNumber.setNumbers(scanner);
            duplicateNumber.printArray();
            System.out.println(duplicateNumber.duplicateNumber());   
        }

    }

}