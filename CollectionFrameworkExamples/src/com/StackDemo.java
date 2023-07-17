package com;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack ss = new Stack();
		ss.push(10);
		ss.push(20);
		ss.push(30);
		ss.push(40);
		System.out.println(ss);
		System.out.println("Pop "+ss.pop()); //it removes top most element
		System.out.println(ss);
		System.out.println("Peek " +ss.peek()); //it checks top most element
		System.out.println(ss);
		System.out.println("search "+ss.search(30)); //it give position of than element from top
		System.out.println("search "+ss.search(100));

	}

}
