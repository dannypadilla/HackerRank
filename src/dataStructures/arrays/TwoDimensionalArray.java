package dataStructures.arrays;

/*
 * ========== 2D Array - DS ==========
 * Given a 6 x 6 2D array A
 * We define an hour glass in A to be a subset of values with indices
 * falling in this pattern in A's graphical representation:
 * 			a b c
 * 			  d
 * 			e f g
 * There are 16 hour glasses in A, and an hour
 * glass sum is the sum of an hour glass' values.
 * 
 * Task:
 * Calculate the hour glass sum for every hour
 * glass in A,then print the maximum hour glass sum.
 * 
 * Input:
 * There are 6 lines of input, where each line contains 6
 * space-separated integers describing 2D Array A; every
 * value in A will be in the inclusive range of -9 to 9.
 * 
 * Constraints:
 * -9 <= A[i][j] < 9
 * 0 <= i, j <= 5
 * 
 * Output Format:
 * Print the largest (maximum) hour glass sum found in A.
 * 
 */

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
//		// Sample input array for testing
//		int[][] sample = {
//				{1, 1, 1, 0, 0, 0 },
//				{0, 1, 0, 0, 0, 0 },
//				{1, 1, 1, 0, 0, 0 },
//				{0, 0, 2, 4, 4, 0 },
//				{0, 0, 0, 2, 0, 0 },
//				{0, 0, 1, 2, 4, 0 }
//				};
		
		// Take user input from console
		Scanner in = new Scanner(System.in);
		
		// Initialize empty 6 x 6 array
		int[][] sample = new int[6][6];
		
		// Loop 6 times since the input is expected to be 6 x 6
		for (int i = 0; i < 6; i++) {
			
			// Helper takes current line and splits it as an array
			String[] helper = in.nextLine().split(" ");

			// Loop through each token of the line
			for (int j = 0; j < 6; j++) {
				
				// Append each token to the sample array
				sample[i][j] = Integer.valueOf(helper[j] );
			}
		}
		
		// Initialize largest sum to lowest possible value (-9 * 7) - 1
		int largestSum = -64;
		
		// Iterate each row starting in the "origin/center" of each hour glass 
		for (int i = 1; i <= 4; i++) {
			
			// Go through each column at the hour glasses origin/center
			for (int j = 1; j <= 4; j ++) {
				
				// Adds the hour glass
				int sum = sample[i - 1][j - 1] + sample[i - 1][j] + sample[i - 1][j + 1] +
												 sample[i][j] 	  +
						  sample[i + 1][j - 1] + sample[i + 1][j] + sample[i + 1][j + 1];
				
				// Test if current hour glass is largest sum
				if (sum > largestSum) {
					largestSum = sum;
				}
			}
		}
		// Print largest hour glass sum to console
		System.out.println(largestSum);

		// Close scanner
		in.close();
		
	}

}
