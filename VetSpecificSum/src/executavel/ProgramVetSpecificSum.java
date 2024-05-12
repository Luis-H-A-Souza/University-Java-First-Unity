package executavel;

import java.util.Scanner;

public class ProgramVetSpecificSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[8];
		int[] b = new int[8];
		int[] c = new int[8];
		int aux = 1;
		
		System.out.println("Welcome to Kiko's Corresponding Array Position Sum!");
		System.out.println("\nStart by filling the first array:");
		//Create a loop for filling the arrays
		for(int i = 0; i < a.length; i++) {
			System.out.print(aux+"º number: ");
			a[i] = sc.nextInt();
			aux++;
		}
		aux = 1;
		System.out.println("\nNow by filling the second array:");
		for(int i = 0; i < b.length; i++) {
			System.out.print(aux+"º number: ");
			b[i] = sc.nextInt();
			aux++;
		}
		aux = 1;
		System.out.println("\nNow to the sums!");
		//Create a loop for matching the positions and do the sums
		for (int i = 0; i < c.length; i++) {
			c[i] = a[i] + b[i];
			System.out.println(aux+"º Position: "+a[i]+" + "+b[i]+" = "+c[i]);
			aux++;
		}
	}

}
