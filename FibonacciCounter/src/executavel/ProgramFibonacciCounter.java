package executavel;

import java.util.Scanner;

public class ProgramFibonacciCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int terms, f1 = 1, f2 = 1, fn = 1;

		System.out.println("This program prints the starting numbers of the Fibonacci Sequence, chosen by you!\n");
		
		System.out.print("Number of terms: ");
		terms = sc.nextInt();
		System.out.println();
		
		for (int i = terms; i > 0; i--) {
			//The first two numbers of the sequence will always be '1'
			if (i == terms) {
				System.out.print(fn+" ");
			}
			
			else if (i == terms - 1) {
				System.out.print(fn+" ");		
			}
			
			//From the third number and onwards we use a formula
			else {
				//Fibonacci is the sum of the two past terms
				fn = f1 + f2;
				System.out.print(fn+" ");
				//Then the past terms are updated for following sums
				f1 = f2;
				f2 = fn;
			} 
			
		}
		
	}

}
