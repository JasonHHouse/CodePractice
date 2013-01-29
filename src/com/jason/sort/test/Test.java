package com.jason.sort.test;

import com.jason.sort.*;

public class Test {

	public static void main(String[] args) {
		System.out.println("Selection Sort");
		int[] selectionArray = {4,5,2,3,1};
		JSelectionSort.sort(selectionArray);
		
		System.out.println("Insertion Sort");
		int[] insertionArray = {4,5,2,3,1};
		JInsertionSort.sort(insertionArray);
		
		System.out.println("Bubble Sort");
		int[] bubbleArray = {4,5,2,3,1};
		JBubbleSort.sort(bubbleArray);
		
		System.out.println("Bucket Sort");
		int[] bucketSort = {4,5,2,3,1};
		JBucketSort.sort(bucketSort);
	}
	
}
