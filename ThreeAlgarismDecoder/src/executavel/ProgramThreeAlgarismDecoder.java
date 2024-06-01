package executavel;

import java.util.Scanner;

public class ProgramThreeAlgarismDecoder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] threeAlgarism = new int[10];
		int[] verifiedDigit = new int[10];
		int aux = 1;

		System.out.println("Welcome to Kiko's Three Algarism Decoder!\n");
		System.out.println("Inform Ten Numbers with Three Algarisms!");

		for (int i = 0; i < 10; i++) {
			do {
				System.out.print(aux + "° Number: ");
				threeAlgarism[i] = sc.nextInt();
				if ((threeAlgarism[i] < 100 || threeAlgarism[i] > 999)
						&& (threeAlgarism[i] > -100 || threeAlgarism[i] < -999)) {
					System.out.println("Inform only Three Algarism Numbers!");
				}
			} while ((threeAlgarism[i] < 100 || threeAlgarism[i] > 999)
					&& (threeAlgarism[i] > -100 || threeAlgarism[i] < -999));
			aux++;
		}

		for (int i = 0; i < 10; i++) {
			verifiedDigit[i] = ((4 * (threeAlgarism[i] / 100)) + (3 * ((threeAlgarism[i] / 10) % 10))
					+ (2 * ((threeAlgarism[i] % 10) % 10))) / 7;
		}

		System.out.print("\nThe Verified digits are: | ");
		for (int i = 0; i < 10; i++) {
			System.out.print(verifiedDigit[i] + " | ");
		}
	}

}
