package algorithms.warmup;

import java.util.Scanner;

/*
 * ========== A Very Big Sum ========== 
 * 
 * You are given an array of integers of size N. You need to print the
 * sum of the elements in the array, keeping in mind that some of those
 * integers may be quite large.
 * 
 * Input:
 * The first line of the input consists of an integer N. The next line
 * contains N space-separated integers contained in the array.
 * 
 * Sample:
 * 5
 * 1000000001 1000000002 1000000003 1000000004 1000000005
 * 
 * Output:
 * Print a single value equal to the sum of the elements in the array.
 * In the above sample, you would print 5000000015.
 * 
 * Note:
 * The range of the 32-bit integer is (2^31) to (2^31 - 1).
 * When we add several integer values, the resulting sum might exceed
 * the above range. You might need to use long long int in C/C++ or
 * long data type in Java to store such sums.
 */

public class AVeryBigSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);						// User input
		String anIntegerN = in.nextLine();							// Read in first line input
		String[] numsToSum = in.nextLine().split(" ");				// Read second line and split into an array
		long sum = 0;												// Initialize sum
		for (int i = 0; i < Integer.valueOf(anIntegerN); i++) {		// Loop through the input array
			sum += Integer.valueOf(numsToSum[i]);					// Add each value in the array to sum
		}
		System.out.println(sum);									// Print the sum value
		in.close();													// Close the scanner
	}

}
