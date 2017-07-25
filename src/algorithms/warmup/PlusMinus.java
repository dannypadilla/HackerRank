package algorithms.warmup;

/*
Given an array of integers, calculate which fraction of its elements are positive,
which fraction of its elements are negative, and which fraction of its elements are
zeroes, respectively. Print the decimal value of each fraction on a new line.
 */

import java.util.Scanner;

public class PlusMinus {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        int numberOfPositive = 0;
        int numberOfNegative = 0;
        int numberOfZero = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if(arr[i] > 0) {
                numberOfPositive++;
            } else if(arr[i] < 0) {
                numberOfNegative++;
            } else {
                numberOfZero++;
            }
        }

        System.out.printf("%f\n", (double)numberOfPositive / n);
        System.out.printf("%f\n", (double)numberOfNegative / n);
        System.out.printf("%f\n", (double)numberOfZero / n);

    }
}
