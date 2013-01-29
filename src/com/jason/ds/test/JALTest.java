package com.jason.ds.test;

import com.jason.ds.JArrayList;

import junit.framework.TestCase;

public class JALTest extends TestCase{
	
	JArrayList jal;

	@Override
	protected void setUp() {
		Integer[] array = { new Integer(1), new Integer(2), new Integer(3) };
		jal = new JArrayList(array);
	}
	
	public void testAdd() {
		System.out.println("testAdd()");
		assertTrue(jal.size() == 3);
		jal.printArray();
		jal.add(4);
		assertTrue(jal.size() == 4);
		jal.printArray();
		jal.add(5);
		jal.add(6);
		jal.add(7);
		assertTrue(jal.size() == 7);
		jal.printArray();
	}
	
	public void testAddAt(){
		System.out.println("testAddAt()");
		assertTrue(jal.size() == 3);
		jal.printArray();
		jal.addAt(8, 2);
		assertTrue(jal.size() == 3);
		jal.printArray();
	}
	
	public void testDeleteAt(){
		System.out.println("testDeleteAt()");
		assertTrue(jal.size() == 3);
		jal.printArray();
		jal.deleteAt(1);
		assertTrue(jal.size() == 2);
		jal.printArray();
		jal.deleteAt(1);
		assertTrue(jal.size() == 1);
		jal.printArray();
	}

}
