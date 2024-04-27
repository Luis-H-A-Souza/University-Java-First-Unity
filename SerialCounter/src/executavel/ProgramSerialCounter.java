package executavel;

public class ProgramSerialCounter {

	public static void main(String[] args) {
		double h = 0, num = 1, den = 1;

		System.out.println("This program prints a value determinated by the series: "
				+ "H = 1/1 + 3/2 + 5/3 + 7/4 + .... + 99/50.\n");

		while (num <= 99) {
			h += num / den;
			num += 2;
			den++;
		}

		System.out.println(h);

	}

}
