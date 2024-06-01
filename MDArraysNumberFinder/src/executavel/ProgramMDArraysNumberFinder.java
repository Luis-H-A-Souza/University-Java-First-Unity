package executavel;

import java.util.Scanner;

public class ProgramMDArraysNumberFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] Array = new int[3][5];
		int Find, auxLine = -1, auxColumn, flag = 0;

		System.out.println("Welcome to Kiko's Multi-Dimensional Array Number Finder!");
		System.out.println("\nFill the Multi-Dimensional Array!");
		for (int i = 0; i < Array.length; i++) {
			auxLine++;
			auxColumn = 0;
			for (int j = 0; j < Array[0].length; j++) {
				do {
					System.out.print("Line " + auxLine + ", Column " + auxColumn + ": ");
					Array[i][j] = sc.nextInt();
					if (Array[i][j] < 0) {
						System.out.println("Inform only Positive Numbers!");
					}
				} while (Array[i][j] < 0);
				auxColumn++;
			}
		}
		System.out.print("\nNumber to Find: ");
		Find = sc.nextInt();
		for (int i = 0; i < Array.length; i++) {
			for (int j = 0; j < Array[0].length; j++) {
				if (Find == Array[i][j]) {
					System.out.println("Number found: Line " + i + ", Column " + j);
					flag++;
				}
			}
		}
		if (flag == 0) {
			System.out.println("\nNumber Not Found!");
		}
	}

}
