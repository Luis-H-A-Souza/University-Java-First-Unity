package executavel;

import java.util.Scanner;

public class ProgramDivisorFinder {

	public static void main(String[] args) {

		int n, i;

		Scanner sc = new Scanner(System.in);

		System.out.println("This programs displays the divisors of the chosen number!\n");

		System.out.print("Write a number: ");
		n = sc.nextInt();
		i = n;

		System.out.print("\nThe divisors: ");
		do {
			
			if (n % i == 0) {
				System.out.print(i+" ");
			}
			
			i--;
			
		} while (i > 0);

	}

}
