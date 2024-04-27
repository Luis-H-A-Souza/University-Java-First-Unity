package executavel;

import java.util.Scanner;

public class ProgamPrimeNumberFinder {

	public static void main(String[] args) {

		int n, aux = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("This Progam detects if a Number is Prime or not!\n");

		System.out.print("Chose a number: ");
		n = sc.nextInt();

		for (int i = n; i > 0; i--) {
			// Everytime a divisor is found aux is incremented
			if (n % i == 0) {
				aux++;
			}
		}

		// If the number has more than 2 divisors, then its not a prime number
		if (aux > 2) {
			System.out.println("\nNot a Prime Number!");
		}

		else {
			System.out.println("\nThis is a Prime Number!");
		}

	}

}
