package executable;

import java.util.Scanner;

public class ProgramMDASecondaryDiagonalSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] Array = new int[4][4];
		int auxLine = 0, auxColumn = 0, diagonalSum = 0;

		System.out.println("Welcome to Kiko's MultiDimensional Array Secondary Diagonal Sum!");
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

		System.out.println("\nThe Secondary Diagonal is:");
		int j = 3;
		for (int i = 0; i < 4; i++) {
			if (i != 3) {
				System.out.print(Array[i][j] + " + ");
			} else {
				System.out.print(Array[i][j] + " = ");
			}
			diagonalSum += Array[i][j];
		}
		System.out.println(diagonalSum);
	}

}
