package executavel;

import java.util.Scanner;

public class ProgramMDAMinMaxFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] Numbers = new int[3][4];
		int auxLine = 0, auxColumn;
		
		System.out.println("Welcome to Kiko's MDA Smallest & Biggest Number finder");
		System.out.println("\nFill the Multi-Dimensional Array!");
		
		for (int i = 0; i < Numbers.length; i++) {
			auxLine++;
			auxColumn = 1;
			for (int j = 0; j < Numbers[0].length; j++) {
				do {
					System.out.print("Line " + auxLine + ", Column " + auxColumn + ": ");
					Numbers[i][j] = sc.nextInt();
					if (Numbers[i][j] < 0) {
						System.out.println("Inform only Positive Numbers!");
					}
				} while (Numbers[i][j] < 0);
				auxColumn++;
			}
		}
		int biggestNumber = Numbers[0][0], bigLine = 1, bigColumn = 1;
		int smallestNumber = Numbers[0][0], smallLine = 1, smallColumn = 1;
		
		for (int i = 0; i < Numbers.length; i++) {
			for (int j = 0; j < Numbers[0].length; j++) {
				if (Numbers[i][j] > biggestNumber) {
					biggestNumber = Numbers[i][j];
					bigLine = i + 1;
					bigColumn = j + 1;
				}
				else if (Numbers[i][j] < smallestNumber) {
					smallestNumber = Numbers[i][j];
					smallLine = i + 1;
					smallColumn = j + 1;
				}
			}
		}
		System.out.println("\nThe Biggest Number is " + biggestNumber + ": Line " + bigLine + ", Column " + bigColumn);
		System.out.println("\nThe Biggest Number is " + smallestNumber + ": Line " + smallLine + ", Column " + smallColumn);
	}

}
