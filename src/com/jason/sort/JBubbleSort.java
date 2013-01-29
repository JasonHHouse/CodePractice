package com.jason.sort;

public class JBubbleSort {

	public static void sort(int array[]) {
		print(array);
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < (array.length - i); j++) {
				if (array[j - 1] > array[j]) {
					swap(array, j - 1, j);
					print(array);
				}
			}
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
