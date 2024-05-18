package executavel;

import java.util.Scanner;

public class ProgramArrayNumberFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		int aux = 1, match = 0;

		System.out.println("Welcome to Kiko's Number Finder!");
		System.out.println("Start by filling the array!\n");

		for (int i = 0; i < array.length; i++) {
			System.out.print(aux + "º Number: ");
			array[i] = sc.nextInt();
			aux++;
		}
		System.out.print("\nInform the Number you want to find: ");
		int n = sc.nextInt();

		for (int i = 0; i < array.length; i++) {
			if (array[i] == n) {
				System.out.println("\nNumber encountered in position " + i);
				match++;
			}
		}
		if (match == 0) {
			System.out.println("\nThere are zero occurrences on that Number!");
		}

	}

}
