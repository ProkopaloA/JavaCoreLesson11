package ua.lviv.lgs;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task2 {

	static void menu() {
		System.out.println("Enter 1 to display an array of random cars");
		System.out.println("Enter 2 to fill the array with the same values for a random car");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			menu();
			switch (sc.nextInt()) {
			case 1: {
				Auto autoArray[][] = new Auto[getRandomValueFromRange(0, 5)][getRandomValueFromRange(0, 5)];

				for (int i = 0; i < autoArray.length; i++) {

					for (int j = 0; j < autoArray[i].length; j++) {
						autoArray[i][j] = new Auto(getRandomValueFromRange(25, 450),
								getRandomValueFromRange(1980, 2021),
								new SteeringWheel(getRandomValueFromRange(25, 35), 
										steeringWheelMaterial[getRandomValueFromRange(0, 2)].toString()),
								new Engine(getRandomValueFromRange(2, 16)));
											}
				} 

				break;
			}
			case 2: {

				Auto auto = new Auto(getRandomValueFromRange(25, 450), getRandomValueFromRange(1980, 2021),
						new SteeringWheel(getRandomValueFromRange(25, 35), 
								steeringWheelMaterial[getRandomValueFromRange(0, 2)].toString()),
						new Engine(getRandomValueFromRange(2, 16)));

				Auto autoArray[] = new Auto[getRandomValueFromRange(0, 5)];

				Arrays.fill(autoArray, auto);

				System.out.println(Arrays.deepToString(autoArray));

				break;
			}

			default: {
				System.out.println("The entered number must be 1 or 2!");

				break;
			}

			}
		}

	}

	public static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("min value must be smaller than max value");
		}

		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}
}
