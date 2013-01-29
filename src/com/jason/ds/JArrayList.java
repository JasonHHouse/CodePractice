package com.jason.ds;

public class JArrayList {

	private Integer[] array;

	public JArrayList() {
		array = new Integer[10];
		clearArray(array);
	}

	public JArrayList(Integer[] array) {
		this.array = array;
	}

	public int size() {
		for (int count = 0; count < array.length; count++)
			if (array[count] == null)
				return count;
		return array.length;
	}

	public Integer get(int position) {
		if (position >= size())
			System.err.println("Value out of bounds");
		return array[position];
	}

	public void set(Integer value, int position) {
		if (position >= size())
			System.err.println("Value out of bounds");
		array[position] = value;
	}

	public void add(int value) {
		// Add the value if it can fit
		for (int i = 0; i < array.length; i++)
			if (array[i] == null) {
				array[i] = value;
				return;
			}

		// Otherwise double the size, copy over and add the value
		Integer[] doubleArray = new Integer[array.length * 2];
		clearArray(doubleArray);
		for (int i = 0; i < array.length; i++) {
			doubleArray[i] = array[i];
		}
		doubleArray[array.length] = value;
		array = doubleArray;
	}

	public void addAt(int value, int position) {
		if (position < array.length)
			array[position] = value;
	}

	public void deleteAt(int position) {
		if (position < array.length) {
			for (; position < size(); position++)
				if (position == size() - 1)
					array[position] = null;
				else
					array[position] = array[position + 1];
		}
	}

	public void printArray() {
		String output = "";
		for (Integer i : array)
			if (i != null)
				output += i + ", ";
		System.out.println(output);
	}

	private void clearArray(Integer[] array) {
		for (int i = 0; i < array.length; i++)
			array[i] = null;
	}
}
