package com.jason.sort;

public class JBucketSort {

	public static void sort(int[] array) {
		print(array);
		int maxVal = 0;
		for (int i : array)
			if (i > maxVal)
				maxVal = i;

		int[] count = new int[maxVal + 1];
		for (int intVal : array) {
			count[intVal]++;
		}

		int outPos = 0;
		for (int i = 0; i < count.length; i++) {
			for (int j = 0; j < count[i]; j++) {
				array[outPos++] = i;
				print(array);
			}
		}
		print(array);
	}

	private static void print(int[] array) {
		for (int i : array) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}
}
