package executavel;

import java.util.Scanner;

public class ProgramArrayNumberFinder {
	//A program that reads a 10 position array and a 'N' value. Then search if there's a 'N' value in the array, if so, prints the position
	//else, prints a message

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		int aux = 1, match = 0;

		System.out.println("Welcome to Kiko's Number Finder!");
		System.out.println("Start by filling the array!\n");
		
		//For fills the array
		for (int i = 0; i < array.length; i++) {
			System.out.print(aux + "º Number: ");
			array[i] = sc.nextInt();
			aux++;
		}
		System.out.print("\nInform the Number you want to find: ");
		int n = sc.nextInt();
		
		 
		System.out.println();
		//For searches the occurrences of the N number
		for (int i = 0; i < array.length; i++) {
			if (array[i] == n) {
				System.out.println("Number encountered in position " + i);
				//'match' variable to confirm an encounter 
				match++;
			}
		}
		//Depending on the value of 'match' informs the following message 
		if (match == 0) {
			System.out.println("There are zero occurrences on that Number!");
		}

	}

}
