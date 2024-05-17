package executavel;

import java.util.Scanner;

//Read two arrays A and B, both with 10 elements each, and they should only accept values
//in ascending order. Then generate and print the C array, the interleaving of A and B.
public class ProgramArrayInterleaver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[20];
		int aux = 2, contA = 0, contB = 0;

		System.out.println("Welcome to Kiko's Array Interleaver!");
		System.out.println("This program only let you set values in ascending order!");
		System.out.println("\nStart filling the first array:");
		System.out.print("1º number: ");
		a[0] = sc.nextInt();
		for (int i = 1; i < a.length; i++) {
			do {
				System.out.print(aux + "º number: ");
				a[i] = sc.nextInt();
				if (a[i] < a[i - 1]) {
					System.out.println("Ascending order only!");
				}
			//Do-while prevents the user from setting a smaller number
			} while (a[i] < a[i - 1]);
			aux++;
		}
		aux = 2;
		System.out.println("\nNow to the second one: ");
		System.out.print("1º number: ");
		b[0] = sc.nextInt();
		for (int i = 1; i < b.length; i++) {
			do {
				System.out.print(aux + "º number: ");
				b[i] = sc.nextInt();
				if (b[i] < b[i - 1]) {
					System.out.println("Ascending order only!");
				}
			} while (b[i] < b[i - 1]);
			aux++;
		}
		System.out.println("\nAfter the interleaving the third array has the following values:");
		//This loop fills the C array
		for (int i = 0; i < c.length; i++) {
			if (i % 2 == 0) {
				c[i] = a[contA];
				contA++;
			}
			else {
				c[i] = b[contB];
				contB++;
			}
			
			System.out.print(c[i] + " ");
		}
	}

}