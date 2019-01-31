/* PROBLEM STATEMENT:
 * A non-empty zero-indexed array A consisting of N integers is given. 
 * Array A represents numbers on a tape. Any integer P, such that 0 < P < N, 
 * splits this tape into two non-empty parts:
 * 
 * A[0], A[1], ..., A[P - 1] and A[P], A[P + 1], ..., A[N - 1].
 * 
 * Write a function: int solution(int A[], int N); that, given a non-empty 
 * zero-indexed array A of N integers, returns the minimal difference that can be 
 * achieved.
 */
package com.TapeEquilibrium;

public class Main {
	
	public int solution(int A[], int N) {
		// Initialize values
		int total_sum=0, right_sum=0, min = Integer.MAX_VALUE, diff = 0;
		
		// get the total sum of the array
		for(int i = 0; i< N; i++) {
			total_sum += A[i];
		}
		
		// start moving the sum value such that the right side gets populated and the
		// left side starts losing the value
		for(int i = N-1 ; i >= 0; i--) {
			total_sum -= A[i];
			right_sum += A[i];
			
			// The difference matters. Hence the absolute is taken.
			diff = Math.abs(total_sum - right_sum);
			
			// If the difference is min encountered, change the min value
			if(diff < min) {
				min = diff;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		
		// Input values
		int arr[] = {3,5,2,7,9,4,5};
		int size = arr.length;
		Main te =  new Main();
		
		// Call the function
		int soln = te.solution(arr,size);
		
		// Print the solution
		System.out.println(soln);
	}

}
