package algorithms.warmup;

/*
Consider a staircase of size n = 4:

   #
  ##
 ###
####

Observe that its base and height are both equal to n, and the image is drawn using # symbols and spaces.
The last line is not preceded by any spaces.

Write a program that prints a staircase of size n.
 */

import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char arr[][] = new char[n][n];

        for(int x = 0; x < arr.length; x++) { // initialize array to empty char
            for(int y = 0; y < arr.length; y++) {
                arr[x][y] = ' ';
            }
        }

        for(int i = n; i > 0; i--) { // yolo n^2; there's a better recursive way
            for(int j = n - i; j < n; j++) {
                arr[i - 1][j] = '#';
            }
        }

        for(int x = 0; x < arr.length; x++) { // print the array
            for(int y = 0; y < arr.length; y++) {
                System.out.print(arr[x][y]);
            }
            System.out.println();
        }

    }

}
