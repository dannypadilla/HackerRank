package algorithms.warmup;

/*
 *  ========== Compare the Triplets ==========
 *  
 *  Alice and Bob each created one problem for HackerRank.
 *  A reviewer rates the two challenges, awarding points on
 *  a scale from 1 to 100 for three categories: problem
 *  clarity, originality, and difficulty.
 *  
 *  We define the rating for Alice's challenge to be the
 *  triplet A = (a0, a1, a2) and the rating for Bob's
 *  challenge to be the triplet B = (b0, b1, b3).
 *  
 *  Your task is to find their comparison scores by comparing a0 with b0, a1 with b1, and a2 with b2.
 *  If a[i] > b[i], then Alice is awarded 1 point.
 *  If a[i] < b[i], then Bob is awarded 1 point.
 *  If a[i] == b[i], then neither person receives a point.
 *
 *  Given A and B, can you compare the two challenges and print their respective comparison points?
 *  
 *  Input Format:
 *  The first line contains 3 space-separated integers, a0, a1, and a2, describing the respective values in triplet A. 
 *  The second line contains 3 space-separated integers, b0, b1, and b2, describing the respective values in triplet B.
 *  
 *  Output Format:
 *  Print two space-separated integers denoting the
 *  respective comparison scores earned by Alice and Bob.
 *  
 */

import java.util.Scanner;

public class CompareTheTriplets {

	public static void main(String[] args) {
		
		// Input scanner
        Scanner in = new Scanner(System.in);
        
        // Take each input
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        // Initialize scores
        int alice = 0;
        int bob = 0;
        
        // Test each case....
        if (a0 > b0) {
        	alice++;
        } else if (a0 < b0 ) {
        	bob++;
        }
        
        // Individually....
        if (a1 > b1) {
        	alice++;
        } else if (a1 < b1 ) {
        	bob++;
        }
        
        // One by one....
        if (a2 > b2) {
        	alice++;
        } else if (a2 < b2 ) {
        	bob++;
        }
        
        // Then print it out
        System.out.println(alice + " " + bob);
        
        // Close the scanner
        in.close();
		
	}

}
