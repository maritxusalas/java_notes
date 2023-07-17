package com;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println("size " +al.size());
		int num[] = new int[10];
		System.out.println("size is " +num.length);
		System.out.println("size "+al.size());
		al.add("Lex");
		al.add("Steven");
		al.add("John");
		System.out.println(al);
		System.out.println("size "+al.size());
		System.out.println("0 index position value "+al.get(0));
		System.out.println("1 index position value "+al.get(1));
		//System.out.println("Wrong index position "+al.get(4));
		al.add("Raju");   // add element at last 
		al.add(1,"Neena");   // adding Neena name in 1 index position 
		System.out.println(al);
		al.remove(2);	// remvove name using index position Steven 
		al.remove("John");  // remvoe using value 		John
		System.out.println(al);
		System.out.println("Search "+al.contains("Lex"));
		System.out.println("Search "+al.contains("Akash"));
		
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(2);
		al1.add(6);
		System.out.println(al1);
		al1.remove(2);   //by default number consider as index 
		System.out.println(al1);
		Integer a=10;
		al1.remove(a);  // remove using number value 
		System.out.println(al1);






	}

}
