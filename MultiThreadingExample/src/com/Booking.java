package com;

class Booking1 implements Runnable {
	int avl = 1;
	@Override
	public synchronized void run() {
		Thread t =Thread.currentThread();
		String name =t.getName();
		if (avl == 1){
			System.out.println(name+" got ticket");
			avl = avl -1;
			
		}else {
			System.out.println(name+" no ticket");
		}
		System.out.println(+ avl);
		
	}
}

public class Booking {

	public static void main(String[] args) {
		
		Booking1 b1 = new Booking1();
		//Booking1 b2 = new Booking1();
		//Booking1 b3 = new Booking1();
		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b1);
		Thread t3 = new Thread(b1);
		t1.setName("Lex");
		t2.setName("Pepe");
		t3.setName("mari");
		t1.start();
		t2.start();
		t3.start();
		
	}

}
