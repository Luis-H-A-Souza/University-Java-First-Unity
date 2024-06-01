package executavel;

import java.util.Scanner;

public class ProgramIndexOddEvenChanger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sequence = new int[500];
		int aux = 1, i = -1, s = -1, storedNumber, p1 = 0, p2 = 1;

		System.out.println("Welcome to Kiko and Boli's Index Odd Even Changer");
		System.out.println("Write a sequence ('-1' to stop)");

		do {
			do {
				i++;
				System.out.print(aux + "° Number: ");
				sequence[i] = sc.nextInt();
				if (sequence[i] < -1) {
					System.out.println("Inform only positive numbers!");
				}
			} while (sequence[i] < -1);
			aux++;
			s++;
		} while (sequence[i] != -1);

		if (s < 2) {
			storedNumber = sequence[0];
			sequence[0] = sequence[1];
			sequence[1] = storedNumber;
		}

		for (i = 0; i < (s / 2); i++) {
			storedNumber = sequence[p1];
			sequence[p1] = sequence[p2];
			sequence[p2] = storedNumber;
			p1 += 2;
			p2 += 2;
		}

		System.out.print("\nThe Changed positions are:\n| ");
		for (i = 0; i < s; i++) {
			System.out.print(sequence[i] + " | ");
		}

	}

}
