package com.jason.ds.test;

import com.jason.ds.JStack;

import junit.framework.TestCase;

public class JSTest extends TestCase{

	JStack js;
	
	@Override
	protected void setUp() {
		js = new JStack();
		js.push(1);
		js.push(2);
		js.push(3);
	}
	
	public void testPush() {
		System.out.println("testPush");
		assertTrue(js.size() == 3);
		js.push(4);
		js.push(5);
		js.push(6);
		js.printStack();
		assertTrue(js.size() == 6);
	}
	
	public void testPop() {
		System.out.println("testPop");
		assertTrue(js.size() == 3);
		js.pop();
		js.pop();
		js.printStack();
		assertTrue(js.size() == 1);
	}
}
