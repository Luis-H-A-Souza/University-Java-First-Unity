package executable;

import java.util.Scanner;

public class ProgramMDAMainDiagonalSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] Array = new int[4][4];
		int auxLine = 0, auxColumn = 0, diagonalSum = 0;

		System.out.println("Welcome to Kiko's MultiDimensional Array Main Diagonal Sum!");
		System.out.println("\nFill the Array:");

		for (int i = 0; i < Array.length; i++) {
			System.out.println();
			auxLine++;
			auxColumn = 0;
			for (int j = 0; j < Array[0].length; j++) {
				auxColumn++;
				System.out.print("Line " + auxLine + ", Column " + auxColumn + ": ");
				Array[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nThe Main Diagonal is:");
		for (int i = 0; i < Array.length; i++) {
			diagonalSum += Array[i][i];
			if (i == Array.length - 1) {
				System.out.print(Array[i][i] + " = ");
			} else {
				System.out.print(Array[i][i] + " + ");
			}
		}

		System.out.println(diagonalSum);

	}

}
