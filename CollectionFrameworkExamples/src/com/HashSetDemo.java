package com;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		//HashSet hs = new HashSet();
		Set hs = new HashSet();
		System.out.println("Size "+hs.size());
		System.out.println("Empty or not "+hs.isEmpty());
		hs.add(10);
		hs.add(10.20);
		hs.add("Lex");
		hs.add(true);
		System.out.println("Size "+hs.size());
		System.out.println("Empty or not "+hs.isEmpty());
		System.out.println(hs);
		hs.remove("Lex"); //it removes using value
		System.out.println(hs);
		System.out.println("Search "+hs.contains(10));
		System.out.println("Search "+hs.contains(100));
		System.out.println(hs);
		hs.clear(); //remove all elemnts
		System.out.println(hs);
		System.out.println("Size "+hs.size());
		
	}

}
