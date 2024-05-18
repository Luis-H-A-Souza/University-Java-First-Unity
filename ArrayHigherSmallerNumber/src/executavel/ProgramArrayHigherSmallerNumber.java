package executavel;

import java.util.Scanner;

public class ProgramArrayHigherSmallerNumber {
	//Read a 12 position array and print the highest and smallest numbers as so it's respective positions

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[12];

		System.out.println("Welcome to Kiko's HigherSmallerNumber!");
		System.out.println("Let's find out the Highest and Smallest Number and they position between 12 Numbers!");
		System.out.println("\n1º Number: ");
		//Reads the first number for initializing other variables
		number[0] = sc.nextInt();
		
		//Sets some variables based on the first reading for comparison reasons
		int higherNumber = number[0], smallerNumber = number[0];
		int higherPos = 0, smallerPos = 0, aux = 2;

		for (int i = 1; i < number.length; i++) {
			System.out.println(aux + "º Number: ");
			number[i] = sc.nextInt();
			//Compares the actual number with previous set values
			if (number[i] > higherNumber) {
				higherNumber = number[i];
				higherPos = i;
			} else if (number[i] < smallerNumber) {
				smallerNumber = number[i];
				smallerPos = i;
			}
			aux++;
		}

		System.out.println("The position " + higherPos + " has the highest number: " + higherNumber);
		System.out.println("The position " + smallerPos + " has the smallest number: " + smallerNumber);
	}

}
