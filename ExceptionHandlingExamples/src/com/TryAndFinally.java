package com;

public class TryAndFinally {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a =10;
		int b = 0;
		try {
			int res = a/b;
			System.out.println("Result is" +res);
			System.out.println("mp exception");
			
		} finally {
			System.out.println("finally block");
			//close the resource
			
		}

		System.out.println("finish");
	}

}
