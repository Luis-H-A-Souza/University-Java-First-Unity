package executavel;

import java.util.Scanner;

//Write a program that reads a array of 10 position integers and writes the indices
//of the elements that are odd.
public class ProgramArrayFindTheOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		int aux = 1, odd = 0;

		System.out.println("Welcome to Kiko's 10p Array Odd Finder!");

		System.out.println("\nStart by filling the 10p Array:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(aux + "º number: ");
			aux++;
			array[i] = sc.nextInt();
			if (array[i] % 2 != 0) {
				odd++;
			}
		}
		System.out.println("\nThis were the odd numbers: ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println("\nTotalizing " + odd + " odd numbers");

	}

}
