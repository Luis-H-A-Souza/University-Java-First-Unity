package executable;

import java.util.Scanner;

public class ProgramMDAMultiplier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line, column, auxLine = 0, auxColumn = 0;

		System.out.println("Welcome to Kiko's MultiDimensional Array Multiplier!\n");
		do {
			System.out.println("Inform the size of lines: ");
			line = sc.nextInt();
			if (line < 1) {
				System.out.println("Number of lines cant be below 1!");
			}
		} while (line < 1);

		do {
			System.out.println("Inform the size of columns: ");
			column = sc.nextInt();
			if (column < 1) {
				System.out.println("Number of columns cant be below 1!");
			}
		} while (column < 1);

		int[][] multiplicand = new int[line][column];
		int[][] multiplier = new int[line][column];
		int[][] product = new int[line][column];

		System.out.println("\nFill the multiplicand MultiDimensional Array!");
		for (int i = 0; i < line; i++) {
			auxLine++;
			for (int j = 0; j < column; j++) {
				auxColumn++;
				System.out.print("Line " + auxLine + ", Column " + auxColumn + ": ");
				multiplicand[i][j] = sc.nextInt();
			}
		}

		auxLine = 0;
		auxColumn = 0;

		System.out.println("\nFill the multiplier MultiDimensional Array!");
		for (int i = 0; i < line; i++) {
			auxLine++;
			for (int j = 0; j < column; j++) {
				auxColumn++;
				System.out.print("Line " + auxLine + ", Column " + auxColumn + ": ");
				multiplier[i][j] = sc.nextInt();
			}
		}

		auxLine = 0;
		auxColumn = 0;

		System.out.println("\nThe Products are:");
		for (int i = 0; i < line; i++) {
			auxLine++;
			for (int j = 0; j < column; j++) {
				auxColumn++;
				product[i][j] = multiplicand[i][j] * multiplier[i][j];
				System.out.println(multiplicand[i][j] + " * " + multiplier[i][j] + " = " + product[i][j]);
			}
		}

	}

}
