package com.jason.ds.test;

import junit.framework.TestCase;

import com.jason.ds.JLinkedList;

public class JLLTest extends TestCase {
	JLinkedList<Integer> jll;

	@Override
	protected void setUp() {
		jll = new JLinkedList<Integer>(1);
	}

	public void testjllSize() {
		assertTrue(jll.length() == 1);
	}
	
	public void testjllAddNode() {
		jll.insertNode(2);
		jll.insertNode(3);
		jll.insertNode(4);
		jll.insertNode(5);
		jll.insertNode(6);
		assertTrue(jll.length() == 6);
	}

	public void testGet() {
		int value = jll.get(3);
		assertTrue(value == 3);
	}
	
	public void testjllDeleteNode() {
		//jll.deleteNode(1);
		//assertTrue(jll.length() == 2);
	}
}
