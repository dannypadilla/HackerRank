package algorithms.warmup;

/*
 * ========== Diagonal Difference ==========
 * 
 * Given a square matrix of size N x N, calculate the absolute difference between the sums of its diagonals.
 * 
 * Input:
 * The first line contains a single integer, N. The next N lines denote the matrix's rows,
 * with each line containing N space-separated integers describing the columns.
 * 
 * Output:
 * Print the absolute difference between the two sums of the matrix's diagonals as a single integer.
 * 
 */

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); // prompt for user input
		int n = in.nextInt();
		int a[][] = new int[n][n]; // set matrix size

		int firstDiagonal = 0; // initialize sums
		int secondDiagonal = 0; // initia;ize

		for(int i = 0; i < n; i++) { // row
			for (int j = 0; j < n; j++) { // column

				a[i][j] = in.nextInt();
				//System.out.print(" (" + i + "," + j + ") ");
			}
			//System.out.println("\n");
		}

		for (int first = 0; first < n; first++) {
			firstDiagonal += a[first][first];
			System.out.print(firstDiagonal);

			secondDiagonal += a[first][n - 1 - first];
			System.out.println(Math.abs(firstDiagonal - secondDiagonal) );
		}
		
	}

}
