package com;

public class DefaultThreadInfo {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("My thread");	
		t.setPriority(1);
		System.out.println(t);

	}

}
