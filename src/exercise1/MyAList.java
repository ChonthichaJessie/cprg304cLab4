package exercise1;

import java.util.ArrayList;
import java.util.Iterator;

public class MyAList<E> implements Iterable<E>
{
	private ArrayList<E> list;

	@Override
	public Iterator<E> iterator()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	public MyAList()
	{
		list = new ArrayList<>();
	}
	
	public void add(E item) {
		
		list.add(item);
	}
	
	public void addAll(MyAList<E> items) {
		list.addAll(items.list);
		
	}
	
	public E get(int index) {
		return list.get(index);
		
	}
	
	public void remove(int index) {
		list.remove(index);
		
	}
	
	public void set(int index, E item) {
		list.set(index, item);
		
	}
	
	public int size() {
		return list.size();
		
	}
	
	public boolean isEmpty() {
		if(list.size()==0) {return true;} else {return false;}
	}
	
	public ArrayList<E> toArray() {
		return list;
		
	}
	
	public void clear() {
		list.clear();
	}
	

}
