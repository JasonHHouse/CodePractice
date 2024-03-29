package com.jason.sort;

public class JSelectionSort {

	public static void sort(int[] array) {
		print(array);
		for (int i = 0; i < array.length; i++) {
			int minValueLoc = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[minValueLoc] > array[j])
					minValueLoc = j;
			}
			swap(array, minValueLoc, i);
			print(array);
		}
		print(array);
	}

	private static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	private static void print(int[] array) {
		for(int i : array){
			System.out.print(i + ", ");
		}
		System.out.println();
	}
}
