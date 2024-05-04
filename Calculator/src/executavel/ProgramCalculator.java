package executavel;

import java.util.Scanner;

public class ProgramCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, result;
		char op, code;

		do {
			System.out.println("Welcome to Kiko's Calculator!");

			System.out.print("\nDigit a number: ");
			n1 = sc.nextDouble();

			System.out.print("\nChoose an operator ('+', '-', '/' or '*': ");
			do {
				op = sc.next().charAt(0);
				if (op != '+' && op != '-' && op != '/' && op != '*') {
					System.out.print("Choose a valid operator: ");
				}
			} while (op != '+' && op != '-' && op != '/' && op != '*');

			System.out.print("\nDigit a number: ");
			n2 = sc.nextDouble();

			switch (op) {
			case '+':
				result = sum(n1, n2);
				System.out.println("\nResult: " + result);
				break;

			case '-':
				result = subtraction(n1, n2);
				System.out.println("\nResult: " + result);
				break;

			case '/':
				result = division(n1, n2);
				System.out.println("\nResult: " + result);
				break;

			case '*':
				result = multiplication(n1, n2);
				System.out.println("\nResult: " + result);
				break;
			}

			System.out.print("\nWould you like to continue? (Y/N): ");
			do {
				code = sc.next().charAt(0);
				if (code != 'n' && code != 'N' && code != 'Y' && code != 'y') {
					System.out.print("Choose between Y or N: ");
				}
			} while (code != 'n' && code != 'N' && code != 'Y' && code != 'y');

		} while (code != 'n' && code != 'N');

	}

	public static double sum(double a, double b) {
		double result = a + b;
		return result;
	}

	public static double subtraction(double a, double b) {
		double result = a - b;
		return result;
	}

	public static double division(double a, double b) {
		double result = a / b;
		return result;
	}

	public static double multiplication(double a, double b) {
		double result = a * b;
		return result;
	}

}
