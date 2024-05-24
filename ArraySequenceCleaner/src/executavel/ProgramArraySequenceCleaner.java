package executavel;

import java.util.Scanner;

public class ProgramArraySequenceCleaner {
	// A program that reads a sequence of 20 natural numbers and store then in an
	// array.
	// Then generate a second array containing the read number without repetitions.
	// Then the program must print the two sequences.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char repeat = 'o';
		int[] sequence = new int[20];
		int[] sequenceCleaned = new int[20];
		int aux = 1, flag, p = 0, s = 0;

		System.out.println("Welcome to Kiko's Sequence Cleaner!");
		System.out.println("\nStart by filling the array!\n");
		do {
			do {
				System.out.print(aux + "º Number: ");
				sequence[s] = sc.nextInt();
				s++;
				if (sequence[s] < 0) {
					System.out.println("Inform only natural numbers!");
				}
			} while (sequence[s] < 0);
			aux++;
			do {
				System.out.print("Do you want to continue (Y/N): ");
				repeat = sc.next().charAt(0);
				if (repeat != 'n' && repeat != 'N' && repeat != 'Y' && repeat != 'y') {
					System.out.println("Write only 'y' or 'n'");
				}
			} while (repeat != 'n' && repeat != 'N' && repeat != 'Y' && repeat != 'y');
		} while ((repeat != 'n' && repeat != 'N') && s < 20);

		for (int i = 0; i < s; i++) {
			flag = 0;
			for (int k = 0; k < i; k++) {
				if (sequence[i] == sequence[k]) {
					flag++;
				}
			}
			if (flag == 0) {
				sequenceCleaned[p] = sequence[i];
				p++;
			}
		}
		System.out.print("\nThe Informed Sequence was: ");
		for (int i = 0; i < s; i++) {
			System.out.print(sequence[i] + " / ");
		}
		System.out.print("\n\nThe Cleaned Sequence is: ");
		for (int i = 0; i < p; i++) {
			System.out.print(sequenceCleaned[i] + " / ");
		}
	}

}
