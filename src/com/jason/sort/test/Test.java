package com.jason.sort.test;

import com.jason.sort.JInsertionSort;
import com.jason.sort.JSelectionSort;

public class Test {

	public static void main(String[] args) {
		System.out.println("Selection Sort");
		int[] selectionArray = {5,1,2,3,4,5,6,1,-1,2,-1,5,1,2,3,4,5,6,1};
		print(selectionArray);
		JSelectionSort.sort(selectionArray);
		print(selectionArray);
		
		System.out.println("Insertion Sort");
		int[] insertionArray = {5,1,2,3,4,5,6,1,-1,2,-1,5,1,2,3,4,5,6,1};
		print(insertionArray);
		JInsertionSort.sort(insertionArray);
		print(insertionArray);
	}
	
	private static void print(int[] array) {
		for(int i : array){
			System.out.print(i + ", ");
		}
		System.out.println();
	}
}
