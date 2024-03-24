package app;

import exercise1.MyAList;

public class Drive {

	public static void main(String[] args) {
		MyAList<Object> alist = new MyAList<>();
		
		alist.add("A");
		alist.add("B");
		alist.add("C");
		System.out.println(alist.size());
		alist.addAll(alist);
		System.out.println(alist.size());
		System.out.println(alist.get(0));
		alist.remove(5);
		System.out.println(alist.size());
		alist.set(0, "D");
		System.out.println(alist.get(0));
		alist.clear();
		System.out.println(alist.size());
		System.out.println(alist.isEmpty());
	}

}
