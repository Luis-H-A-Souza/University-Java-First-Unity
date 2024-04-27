package executavel;

import java.util.Scanner;

public class ProgramShoppingFieldResearch {

	public static void main(String[] args) {

		int age, male = 0, female = 0, code = 0, shopping = 0, services = 0, food = 0, leisure = 0;
		char gender;

		Scanner sc = new Scanner(System.in);

		System.out.println("This program is a field research for a big shopping center!\n");

		do {
			System.out.print("How old are you: ");
			do {
				age = sc.nextInt();
				if (age < 0){
					System.out.println("\nChoose a valid age: ");
				}
			} while (age < 0);

			System.out.println("\nHow do you identify ('m' for male and 'f' for female): ");
			do {
				// Increment the value of man and women for later data
				gender = sc.next().charAt(0);
				if (gender == 'm' || gender == 'M') {
					male++;
				}

				else if (gender == 'f' || gender == 'F') {
					female++;
				}

				else {
					System.out.print("\nPlease select a valid gender: ");
				}
				// Below it compares if the char is valid
			} while (gender != 'm' && gender != 'M' && gender != 'f' && gender != 'F');

			System.out.println("Why did you come here for?");
			System.out.println("1 - Shopping");
			System.out.println("2 - Services (Bank, Mail, etc.)");
			System.out.println("3 - Leisure (Movie Theater, Games, etc.)");
			System.out.println("4 - Food (Restaurants or Cafeteria)");
			System.out.println("5 - Stop researching");
			System.out.print("Your answer: ");

			do {
				code = sc.nextInt();
				// Tests if the code written is valid
				if (code > 5 || code < 1) {
					System.out.println("Insert a valid code: ");
				}

				// increments the corresponding int based on the code for later data
				else if (code == 1) {
					shopping++;
				}

				else if (code == 2) {
					services++;
				}

				else if (code == 3) {
					leisure++;
				}

				else if (code == 4) {
					food++;
				}
				System.out.println();
			} while (code > 5 || code < 1);
		} while (code != 5);

		int total;

		// The formula calculates the percentage of the codes
		total = shopping + services + leisure + food;

		shopping = (100 * shopping) / total;
		services = (100 * services) / total;
		leisure = (100 * leisure) / total;
		food = (100 * food) / total;

		System.out.println("\nThe percentage of people looking for 'shopping' is: " + shopping + "%");
		System.out.println("The percentage of people looking for 'services' is: " + services + "%");
		System.out.println("The percentage of people looking for 'leisure' is: " + leisure + "%");
		System.out.println("The percentage of people looking for 'food' is: " + food + "%");

		if (male > female) {
			System.out.println("\nThere are more men then women!");
		}

		else if (female > male) {
			System.out.println("\nThere are more women then men!");
		}

		else {
			System.out.println("\nThere are an equal number of women and men!");
		}
	}

}
