package com;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(5);
		ts.add(1);
		//ts.add("Abc");
		ts.add(2);
		ts.add(7);
		ts.add(4);
		ts.add(3);
		System.out.println(ts);
		System.out.println(ts.headSet(5)); //excluye desde el quinto hasta el final
		System.out.println(ts.tailSet(3)); //incluye desde el tercero hasta el final
		System.out.println(ts.subSet(2, 4)); //start including and ends excluding
	}

}
