package com.jason.sort;

public class JInsertionSort {

	public static void sort(int[] array) {
		print(array);
		for (int i = 2; i < array.length; i++) {
			int minVal = array[i];
			int j;
			for (j = i; j >= 1 && array[j-1] > minVal; j--) {
				array[j] = array[j - 1];
				print(array);
			}
			array[j] = minVal;
			print(array);
		}
		print(array);
	}

	private static void print(int[] array) {
		for(int i : array){
			System.out.print(i + ", ");
		}
		System.out.println();
	}
}
