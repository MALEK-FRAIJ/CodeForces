//package CodeForces

import java.util.Scanner;

//MaxAndMain

/*
 * K. Max and Min
 * time limit per test0.25 seconds
 * memory limit per test64 megabytes
 * input standard input
 * output standard output
 */

public class MaxAndMain {

    private int size;
    private int[] numbers;

    MaxAndMain(int size){
        this.size = size;
        this.numbers = new int[size];


    }
    public void setNumbers(int num,int index) {
        this.numbers[index] = num;
    }

    public  int minimum() {

        int min = this.numbers[0];
        for (int i = 1; i < this.size; i++) {
            if (this.numbers[i] < min) {
                min = this.numbers[i];
            }
        }

        return min;
    }

    public  int maximum() {

        int max = this.numbers[0];
        for (int i = 1; i < this.size; i++) {
            if (this.numbers[i] > max) {
                max = this.numbers[i];
            }
        }

        return max;
    }
    public void print(){
        System.out.println("minimum value inside array numbers: "+minimum());
        System.out.println("maximum value inside array numbers: "+maximum());
    }

    public static void main(String[] args) {
        MaxAndMain maxMain = new MaxAndMain(3);

        try (Scanner scan = new Scanner(System.in)) {

            for (int i = 0; i < maxMain.size; i++) {
                maxMain.setNumbers(scan.nextInt(),i);
            }
            
            maxMain.print();

        }

    }
}
