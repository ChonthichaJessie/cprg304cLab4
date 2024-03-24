package exercise2;

import java.io.Serializable;

public class MyNode<E>implements Serializable
{

	private static final long serialVersionUID = 1L;
	E element;
	MyNode<E> next;
	MyNode<E> prev;
	
	public MyNode( E element, MyNode<E> prev,MyNode<E> next)
	{
		this.element = element;
		this.prev = prev;
		this.next = next;
		
	}
	
//	public MyNode()
//	{
//		this.element = element;
//	}

}
