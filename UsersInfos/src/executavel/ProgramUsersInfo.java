package executavel;

import java.util.Scanner;

public class ProgramUsersInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, menName = "nonexistent", womenName = "nonexistent";
		char code, gender;
		float height, weight, totalHeight = 0, totalWeight = 0, maxHeight = 0, maxWeight = 0;
		int menAux = 0, womenAux = 0;

		System.out.println("Welcome to Kiko's usersInfo!");
		do {
			System.out.print("\nInform the name: ");
			name = sc.next();

			System.out.print("\nInform the gender (M/F): ");
			do {
				gender = sc.next().charAt(0);
				if (gender != 'm' && gender != 'M' && gender != 'f' && gender != 'F') {
					System.out.print("Digit only 'M' or 'F': ");
				}
			} while (gender != 'm' && gender != 'M' && gender != 'f' && gender != 'F');

			System.out.print("\nInform the height in meters: ");
			do {
				height = sc.nextFloat();
				if (height < 0.628) {
					System.out.print(
							"The smallest person on earth has 62,8 centimeters, " + "please, inform a valid height: ");
				}
			} while (height < 0.628);
			if (gender == 'm' || gender == 'M') {
				totalHeight += height;
				menAux++;
			} else {
				if (height > maxHeight) {
					womenName = name;
					maxHeight = height;
				}
			}

			System.out.print("\nInform the weight in kg: ");
			do {
				weight = sc.nextFloat();
				if (weight <= 0) {
					System.out.println("Inform a valid weight: ");
				}
			} while (weight <= 0);
			if (gender == 'f' || gender == 'F') {
				totalWeight += weight;
				womenAux++;
			} else {
				if (weight > maxWeight) {
					menName = name;
					maxWeight = weight;
				}
			}

			System.out.print("\nDo you want to continue the research? (Y/N): ");
			do {
				code = sc.next().charAt(0);
				if (code != 'y' && code != 'Y' && code != 'n' && code != 'N') {
					System.out.println("Digit only 'Y' or 'N': ");
				}
			} while (code != 'y' && code != 'Y' && code != 'n' && code != 'N');
		} while (code != 'n' && code != 'N');
		
		float menAverage = average(totalHeight, menAux);
		System.out.printf("\nThe height average among men is %.2fm", menAverage);

		float womenAverage = average(totalWeight, womenAux);
		System.out.println("\nThe weight avarage among women is " + womenAverage + "kg");

		System.out.println("The heaviest men is " + menName + " who has " + maxWeight + "kg");
		System.out.println("The highest women is " + womenName + " who has " + maxHeight + "m");
	}

	public static float average(float a, int b) {
		float result = a / b;
		return result;
	}

}
