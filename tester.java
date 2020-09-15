package javab;


import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

/**
 * @author UC San Diego MOOC team
 *
 */
public class tester {

	private static final int LONG_LIST_LENGTH = 10;

	MyLinkedList<String> shortList;
	MyLinkedList<Integer> emptyList;
	MyLinkedList<Integer> longerList;
	MyLinkedList<Integer> list1;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		// Feel free to use these lists, or add your own
		shortList = new MyLinkedList<String>();
		shortList.add("A");
		shortList.add("B");
		emptyList = new MyLinkedList<Integer>();
		longerList = new MyLinkedList<Integer>();
		for (int i = 0; i < LONG_LIST_LENGTH; i++) {
			longerList.add(i);
		}
		list1 = new MyLinkedList<Integer>();
		list1.add(65);
		list1.add(21);
		list1.add(42);

	}

	/**
	 * Test if the get method is working correctly.
	 */
	/*
	 * You should not need to add much to this method. We provide it as an example
	 * of a thorough test.
	 */
	@Test
	public void testGet() {
		// test empty list, get should throw an exception
		try {
			emptyList.get(0);
			fail("Check out of bounds");
		} catch (IndexOutOfBoundsException e) {

		}

		// test short list, first contents, then out of bounds
		assertEquals("Check first", "A", shortList.get(0));
		assertEquals("Check second", "B", shortList.get(1));

		try {
			shortList.get(-1);
			fail("Check out of bounds");
		} catch (IndexOutOfBoundsException e) {

		}
		try {
			shortList.get(2);
			fail("Check out of bounds");
		} catch (IndexOutOfBoundsException e) {

		}
		// test longer list contents
		for (int i = 0; i < LONG_LIST_LENGTH; i++) {
			assertEquals("Check " + i + " element", (Integer) i, longerList.get(i));
		}

		// test off the end of the longer array
		try {
			longerList.get(-1);
			fail("Check out of bounds");
		} catch (IndexOutOfBoundsException e) {

		}
		try {
			longerList.get(LONG_LIST_LENGTH);
			fail("Check out of bounds");
		} catch (IndexOutOfBoundsException e) {
		}

	}

	public void testRemove() {
		int a = list1.remove(0);
		assertEquals("Remove: check a is correct ", 65, a);
		assertEquals("Remove: check element 0 is correct ", (Integer) 21, list1.get(0));
		assertEquals("Remove: check element 1 is correct ", (Integer) 42, list1.get(1));
		assertEquals("Remove: check size is correct ", 2, list1.size());

		int lastIndexInLongerList = longerList.size() - 1;
		assertEquals("Remove: check a is correct", Integer.valueOf(lastIndexInLongerList),
				longerList.remove(lastIndexInLongerList));
		assertEquals("Remove: check size is correct ", LONG_LIST_LENGTH - 1, longerList.size());

		for (int i = 0; i < LONG_LIST_LENGTH - 1; i++) {
			assertEquals("Check " + i + " element after removing element at last index", (Integer) i,
					longerList.get(i));
		}

		try {
			new MyLinkedList<>().remove(-1);
			fail("Check out of bounds");
		} catch (IndexOutOfBoundsException e) {

		}

		try {
			list1.remove(33);
			fail("Check out of bounds");
		} catch (IndexOutOfBoundsException e) {

		}
	}

	/**
	 * Test adding an element into the end of the list, specifically public boolean
	 * add(E element)
	 */
	@Test
	public void testAddEnd() {
		try {
			list1.add(-1, 33);
			fail("Check out of bounds");
		} catch (IndexOutOfBoundsException e) {

		}

		try {
			list1.add(33, 33);
			fail("Check out of bounds");
		} catch (IndexOutOfBoundsException e) {

		}

		list1.add(33);
		assertEquals((Integer) 33, list1.get(3));
		assertEquals((Integer) 65, list1.get(0));
		assertEquals((Integer) 21, list1.get(1));
		assertEquals((Integer) 42, list1.get(2));
		assertEquals(4, list1.size());

		shortList.add("C");
		assertEquals("A", shortList.get(0));
		assertEquals("B", shortList.get(1));
		assertEquals("C", shortList.get(2));
		assertEquals(3, shortList.size());

		try {
			shortList.add(0, null);
			fail("Expected NullPointerException when adding a null element");
		} catch (NullPointerException e) {

		}
	}

	/** Test the size of the list */
	@Test
	public void testSize() {
		assertEquals(3, list1.size());
		assertEquals(2, shortList.size());
		assertEquals(LONG_LIST_LENGTH, longerList.size());
		assertEquals(0, new MyLinkedList<Boolean>().size());
	}

	/**
	 * Test adding an element into the list at a specified index, specifically:
	 * public void add(int index, E element)
	 */
	@Test
	public void testAddAtIndex() {

		try {
			list1.add(-1, 33);
			fail("Check out of bounds");
		} catch (IndexOutOfBoundsException e) {

		}

		list1.add(2, 33);

		assertEquals((Integer) 33, list1.get(2));
		assertEquals((Integer) 65, list1.get(0));
		assertEquals((Integer) 21, list1.get(1));
		assertEquals((Integer) 42, list1.get(3));
		assertEquals(4, list1.size());

		shortList.add(2, "C");
		assertEquals("A", shortList.get(0));
		assertEquals("B", shortList.get(1));
		assertEquals("C", shortList.get(2));
		assertEquals(3, shortList.size());

		try {
			shortList.add(0, null);
			fail("Expected NullPointerException when adding a null element");
		} catch (NullPointerException e) {

		}

		longerList.add(LONG_LIST_LENGTH, LONG_LIST_LENGTH - 1);
		assertEquals(Integer.valueOf(LONG_LIST_LENGTH - 1), longerList.get(LONG_LIST_LENGTH - 1));
		assertEquals(LONG_LIST_LENGTH + 1, longerList.size());

	}

	/** Test setting an element in the list */
	@Test
	public void testSet() {

		try {
			emptyList.set(0, -1);
			fail("Check out of bounds");
		} catch (IndexOutOfBoundsException e) {

		}

		for (int i = 0; i < LONG_LIST_LENGTH; i++) {
			assertEquals("Check set " + i + " element", (Integer) i, longerList.set(i, -i));
			assertEquals("Check get " + i + " element", Integer.valueOf(-i), longerList.get(i));
		}

		assertEquals("A", shortList.set(0, "33"));
		assertEquals("33", shortList.get(0));

		try {
			shortList.set(0, null);
			fail("Expected NullPointerException when setting an element to null");
		} catch (NullPointerException e) {

		}
	}

	@Test
	public void testToString() {
		assertEquals("[A, B]", shortList.toString());
		assertEquals("[65, 21, 42]", list1.toString());
	}

}
