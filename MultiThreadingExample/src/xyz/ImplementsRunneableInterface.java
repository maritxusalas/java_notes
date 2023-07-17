package xyz;

class A implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("i "+i);
		}
		
	}
	
}

class B implements Runnable {

	@Override
	public void run() {
		for(int j=0;j<=10;j++) {
			System.out.println("j "+j);
		}
				
	}

	
	
}
public class ImplementsRunneableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1 = new A();
		B obj2 = new B();
		
		//obj1.start(); // AS THEY ARE NOT THREAD CLASSES THERE IS NO START METHOD
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
		
		

	}

}
