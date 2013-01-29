package com.jason.ds;

public class JLinkedList<T> {

	private Node head;

	public JLinkedList(T value) {
		head = new Node(null, value);
	}

	public int length() {
		int count = 1;
		Node pointer = head;
		while ((pointer = pointer.next) != null)
			count++;
		return count;
	}

	public void insertNode(T value) {
		while(head.next != null)
			head = head.next;
		head.next = new Node(null, value);
	}
	
	public T get(int position) {
		Node pointer = head;
		for(int i = 0; i < position;i++)
			if(pointer.next != null)
				pointer = pointer.next;
		return pointer.value;
	}
	
	public void insertNode(T value, int position) {
		if(head == null && position == 0) {
			head = new Node(null, value);
			return;
		}
			
		Node pointer = head;
		for (int i = 0; i < position - 1; i++)
			if (pointer.next != null)
				pointer = pointer.next;
			else {
				System.err.println("insertNode: position out of bounds");
				return;
			}
		Node afterPointer = pointer.next;
		pointer.next = new Node(afterPointer, value);

	}

	public boolean deleteNode(int position) {
		if (position == 0) {
			head = null;
			return true;
		}

		Node pointer = head;
		Node prevPointer = new Node();
		for (int i = 0; i < position - 1; i++)
			if (pointer.next != null) {
				prevPointer = pointer;
				pointer = pointer.next;
			} else {
				System.err.println("insertNode: position out of bounds");
				return false;
			}

		prevPointer.next = pointer.next;

		return false;
	}

	class Node {
		private Node next;
		private T value;

		public Node() {

		}

		public Node(Node next, T value) {
			super();
			this.next = next;
			this.value = value;
		}

	}

}
