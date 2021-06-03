package ua.lviv.lgs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class task1 {

	public static void main(String[] args) {

		Integer array[] = new Integer[getRandomValueFromRange(0,10)];

		for (int i = 0; i < array.length; i++) {
			array[i] = getRandomValueFromRange(-1000, 1000);
		}

		System.out.println("Array before sorting: " + Arrays.toString(array));

		Arrays.sort(array);
		System.out.println("Array sorted: " + Arrays.toString(array));

		Arrays.sort(array, Collections.reverseOrder());
		System.out.println("Array sorted in descending order: " + Arrays.toString(array));

	}

	public static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("min value must be smaller than max value");
		}

		Random r = new Random();
		return r.nextInt(max - min + 1) + min; 
	}
}
