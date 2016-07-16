package algorithms.warmup;


/*
 * ========== Simple Array Sum ==========
 * Given an array of N integers, find the sum of its elements.
 * 
 * Input Format:
 * The first line contains an integer, N, denoting the size of the array.
 * The second line contains N space-separated integers representing the array's elements.
 * 
 * Output Format:
 * Print the sum of the array's elements as a single integer.
 */

import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) {
		
		// Take in user input from console
		Scanner in = new Scanner(System.in);
		
		// Save first line: size of the array
		int size = Integer.valueOf(in.nextLine() );
		
		// Read next line as an array
		String[] numToSum = in.nextLine().split(" ");
		
		// Initialize sum to 0
		int sum = 0;
		
		// Loop through each element and add it to sum
		for (int i = 0; i < size; i++) {
			
			// Add each element to the sum
			sum += Integer.valueOf(numToSum[i] );
		}
		
		// Print out the sum
		System.out.println(sum);
		
		// Close scanner
		in.close();
		
	}

}
