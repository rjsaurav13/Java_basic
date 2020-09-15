package javab;

import java.util.AbstractList;
import java.util.Objects;

/**
 * A class that implements a doubly linked list
 * 
 * @author UC San Diego Intermediate Programming MOOC team
 *
 * @param <E> The type of the elements stored in the list
 */
public class Linkedlist<E> extends AbstractList<E> {
	LLNode<E> head;
	LLNode<E> tail;
	int size;

	/** Create a new empty LinkedList */
	public MyLinkedList() {
		head = new LLNode<E>(null);
		tail = new LLNode<E>(null);
		head.next = tail;
		tail.prev = head;
		size = 0;
	}

	/**
	 * Appends an element to the end of the list
	 * 
	 * @param element The element to add
	 */
	public boolean add(E element) {
		Objects.requireNonNull(element);
		if (size == Integer.MAX_VALUE) {
			return false;
		}
		LLNode<E> newNode = new LLNode<E>(element, tail.prev, tail);
		tail.prev.next = newNode;
		tail.prev = newNode;
		++size;

		return true;
	}

	/**
	 * Get the element at position index
	 * 
	 * @throws IndexOutOfBoundsException if the index is out of bounds.
	 */
	public E get(int index) {
		return getNthNode(index).data;
	}
	
	private LLNode<E> getNthNode(int index) {

		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}

		LLNode<E> node = head.next;
		while (--index >= 0) {
			node = node.next;
		}

		return node;
	}

	/**
	 * Add an element to the list at the specified index
	 * 
	 * @param The     index where the element should be added
	 * @param element The element to add
	 */
	public void add(int index, E element) {
		Objects.requireNonNull(element);
		if (index == size) {
			this.add(element);
			return;
		}
		LLNode<E> nthNode = getNthNode(index);
		LLNode<E> theNew = new LLNode<E>(element, nthNode.prev, nthNode);
		nthNode.prev.next = theNew;
		nthNode.prev = theNew;
		++size;
	}

	/** Return the size of the list */
	public int size() {
		// TODO: Implement this method
		return size;
	}

	/**
	 * Remove a node at the specified index and return its data element.
	 * 
	 * @param index The index of the element to remove
	 * @return The data element removed
	 * @throws IndexOutOfBoundsException If index is outside the bounds of the list
	 * 
	 */
	public E remove(int index) {
		LLNode<E> nthNode = getNthNode(index);
		nthNode.next.prev = nthNode.prev;
		nthNode.prev.next = nthNode.next;
		--size;
		return nthNode.data;
	}


	/**
	 * Set an index position in the list to a new element
	 * 
	 * @param index
	 *            The index of the element to change
	 * @param element
	 *            The new element
	 * @return The element that was replaced
	 * @throws IndexOutOfBoundsException
	 *             if the index is out of bounds.
	 */
	public E set(int index, E element) {
		Objects.requireNonNull(element);
		LLNode<E> nthNode = getNthNode(index);
		E previousValue = nthNode.data;
		nthNode.data = element;
		return previousValue;
	}

	@Override
	public String toString() {
		StringBuilder stringRepresentation = new StringBuilder();
		stringRepresentation.append("[");
		
		int index = 0;

		for (E element : this) {
			if (index++ != size - 1) {
				stringRepresentation.append(element.toString() + ", ");
			} else {
				stringRepresentation.append(element.toString());
			}
		}

		stringRepresentation.append("]");

		return stringRepresentation.toString();
	}
}

class LLNode<E> {
	LLNode<E> prev;
	LLNode<E> next;
	E data;

	public LLNode(E e) {
		this.data = e;
		this.prev = null;
		this.next = null;
	}

	public LLNode(E e, LLNode<E> prev, LLNode<E> next) {
		this.data = e;
		this.prev = prev;
		this.next = next;
	}


