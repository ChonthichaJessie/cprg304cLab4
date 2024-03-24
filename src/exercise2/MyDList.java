package exercise2;

import java.io.Serializable;

public class MyDList<E> {
	private MyNode<E> head;
	private MyNode<E> tail;
	private int size;

	public MyDList() {
		head = tail = null;
		size = 0;
	}

	public void addFirst(E item) {
		if (head == null) {
			MyNode<E> newNode = new MyNode<>(item, null, null);
			head = newNode;
			tail = head;
		} else {
			MyNode<E> newNode = new MyNode<>(item, null, head);
			head.prev = newNode;
			head = newNode;
		}
		size++;
	}

	public void addLast(E item) {
		if(tail==null)
		{
			MyNode<E> newNode = new MyNode<>(item, null, null);
			tail = newNode;
			head = tail;
		} else {
			MyNode<E> newNode = new MyNode<>(item, tail, null);
			tail.next = newNode;
			tail = newNode;
		}
		size++;

	}

	public E removeFirst() {
		if(head==null)
		{
			return null;
		}
		E e = head.element;
		head = head.next;
		head.prev.next = null;
		head.prev = null;
		size--;
		return e;
		

	}

	public E removeLast() {
		if(tail==null)
		{
			return null;
		}
		E e = tail.element;
		tail = tail.prev;
		tail.next.prev=null;
		tail.next = null;
		size--;
		return e;

	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

}
