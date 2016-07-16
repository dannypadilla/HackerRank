package dataStructures.arrays;

/*
 * ========== Arrays - DS ==========
 * Given an array, A, of N integers, print each element in
 * reverse order as a single line of space-separated integers.
 * 
 * Input:
 * The first line contains an integer,  (the number of integers in ). 
 * The second line contains  space-separated integers describing.
 * 
 * Constraints:
 * 1 <= N <= 10^3
 * 1 <= A[i] <= 10^4; where A[i] is the ith integer in A
 * 
 * Output:
 * Print all  integers in  in reverse order as a single line of
 * space-separated integers.
 */

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		// For user input
		Scanner in = new Scanner(System.in);
		
		// Save input line as a string
		int num = Integer.valueOf(in.nextLine() );
		
		// Read the second line
		String[] numList = in.nextLine().split(" ");
		
		// Initialize an empty string to save the reverse output
		String reverse = "";
		
		
		// Check if input is not empty
		if (numList.length != 0) {
			
			// Starts at end of input then appends it to reverse String
			for (int i = numList.length - 1; i > 0; i-- ) {
					
					// Append each char in reverse to the reverse string
					reverse += numList[i] + " ";
			
			}
			
			// Append last element without a space at the end
			reverse += numList[0];
			
		}
		
		// Print the reverse string to the console
//		System.out.println(num);
		System.out.println(reverse);
		
		// Close scanner
		in.close();

	}

}